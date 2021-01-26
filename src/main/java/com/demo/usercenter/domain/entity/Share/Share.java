package com.demo.usercenter.domain.entity.Share;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "share")
@Setter
@Getter
@Builder
public class Share {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    private String title;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "is_original")
    private String isOriginal;

    private String bount;

    private String author;

    private String cover;

    private String summary;

    private BigDecimal price;

    @Column(name = "download_url")
    private String downloadUrl;

    @Column(name = "buy_count")
    private String buyCount;

    @Column(name = "show_flag")
    private String showFlag;

    @Column(name = "audit_status")
    private String auditStatus;

    private String reason;


}