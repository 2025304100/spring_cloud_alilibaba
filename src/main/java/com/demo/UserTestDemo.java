package com.demo;

import com.demo.usercenter.dao.user.WxuserMapper;
import com.demo.usercenter.domain.entity.user.Wxuser;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserTestDemo {
    private final DiscoveryClient discoveryClient;
    private final WxuserMapper wxuserMapper;

    @GetMapping("test")
    public List<ServiceInstance> Demo() {
        //所有用户实列信息
        List<ServiceInstance> instances = discoveryClient.getInstances("user-center");
        List<String> stringStream = instances.stream()
                .map(instance -> instance.getUri().toString() + "/user/{id}")
                .collect(Collectors.toList());

        ThreadLocalRandom.current().nextInt(stringStream.size());

        return instances;
    }

    @GetMapping("addUser/{id}")
    public String addUser(@PathVariable int id) {
        Wxuser wxuser = null;
        wxuser = Wxuser.builder()
                .id(id)
                .userid(ThreadLocalRandom.current().nextInt(100000000))
                .createtime(new Date(System.currentTimeMillis()))
                .title((int) (Math.random() * 10))
                .updatetime(new Date(System.currentTimeMillis() + 10000))
                .isoriginal(true)
                .author("王大明")
                .price(12)
                .cover("美术")
                .summary("王大明那里一个大苹果~~~呵呵~~")
                .downloadurl("http://www.baidu.com")
                .buycount(10)
                .showflag(true)
                .auditstatus("REJETED")
                .reason("无")
                .wxnickname("黄晓明")
                .build();
        int insert = wxuserMapper.insert(wxuser);
        log.info("执行代码:[" + insert + "]");
        return "执行代码:[" + insert + "]";

    }

    @GetMapping("getCentor/{id}")
    public Wxuser get_User(@PathVariable Integer id) {
        Wxuser wxuser = null;
        wxuser = Wxuser.builder()
                .id(id)
                .build();
        log.info("#C节点被调用");
        List<Wxuser> select = wxuserMapper.select(wxuser);

        return  select.get(0);
    }

}
