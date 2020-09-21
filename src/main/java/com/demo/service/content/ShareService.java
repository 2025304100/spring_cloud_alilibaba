package com.demo.service.content;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class ShareService {
    private final DiscoveryClient discoveryClient;

    @GetMapping("/dis/{id}")
    private List<ServiceInstance> SSM(@PathVariable Integer id) {
        List<ServiceInstance> user = discoveryClient.getInstances("user-center");
        log.info("############A节点被调用####");
        return user;
    }

}
