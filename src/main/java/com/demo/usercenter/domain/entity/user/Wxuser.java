package com.demo.usercenter.domain.entity.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(name = "wxuser")

public class Wxuser {
    /**
     * id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 发布人id
     */
    private Integer userid;

    /**
     * 标题
     */
    private Integer title;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 修改时间
     */
    @Column(name = "updateTime")
    private Date updatetime;

    /**
     * 是否原创 0:否 1:是
     */
    @Column(name = "isOriginal")
    private Boolean isoriginal;

    /**
     * 作者
     */
    private String author;

    /**
     * 封面
     */
    private String cover;

    /**
     * 概要信息
     */
    private String summary;

    /**
     * 价格（需要的积分）
     */
    private Integer price;

    /**
     * 下载地址
     */
    @Column(name = "downloadUrl")
    private String downloadurl;

    /**
     * 下载数
     */
    @Column(name = "buyCount")
    private Integer buycount;

    /**
     * 是否显示 0:否 1:是
     */
    @Column(name = "showFlag")
    private Boolean showflag;

    /**
     * 审核状态 NOT_YET: 待审核 PASSED:审核通过 REJECTED:审核不通过
     * 审核状态 NOT_YET: 待审核 PASSED:审核通过 REJECTED:审核不通过
     */
    @Column(name = "auditStatus")
    private String auditstatus;

    /**
     * 审核不通过原因
     */
    private String reason;

    /**
     * 发布人
     */
    @Column(name = "wxNickname")
    private String wxnickname;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取发布人id
     *
     * @return userid - 发布人id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置发布人id
     *
     * @param userid 发布人id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public Integer getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(Integer title) {
        this.title = title;
    }

    /**
     * 获取创建时间
     *
     * @return createTime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取修改时间
     *
     * @return updateTime - 修改时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 设置修改时间
     *
     * @param updatetime 修改时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 获取是否原创 0:否 1:是
     *
     * @return isOriginal - 是否原创 0:否 1:是
     */
    public Boolean getIsoriginal() {
        return isoriginal;
    }

    /**
     * 设置是否原创 0:否 1:是
     *
     * @param isoriginal 是否原创 0:否 1:是
     */
    public void setIsoriginal(Boolean isoriginal) {
        this.isoriginal = isoriginal;
    }

    /**
     * 获取作者
     *
     * @return author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取封面
     *
     * @return cover - 封面
     */
    public String getCover() {
        return cover;
    }

    /**
     * 设置封面
     *
     * @param cover 封面
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * 获取概要信息
     *
     * @return summary - 概要信息
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置概要信息
     *
     * @param summary 概要信息
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取价格（需要的积分）
     *
     * @return price - 价格（需要的积分）
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 设置价格（需要的积分）
     *
     * @param price 价格（需要的积分）
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 获取下载地址
     *
     * @return downloadUrl - 下载地址
     */
    public String getDownloadurl() {
        return downloadurl;
    }

    /**
     * 设置下载地址
     *
     * @param downloadurl 下载地址
     */
    public void setDownloadurl(String downloadurl) {
        this.downloadurl = downloadurl;
    }

    /**
     * 获取下载数
     *
     * @return buyCount - 下载数
     */
    public Integer getBuycount() {
        return buycount;
    }

    /**
     * 设置下载数
     *
     * @param buycount 下载数
     */
    public void setBuycount(Integer buycount) {
        this.buycount = buycount;
    }

    /**
     * 获取是否显示 0:否 1:是
     *
     * @return showFlag - 是否显示 0:否 1:是
     */
    public Boolean getShowflag() {
        return showflag;
    }

    /**
     * 设置是否显示 0:否 1:是
     *
     * @param showflag 是否显示 0:否 1:是
     */
    public void setShowflag(Boolean showflag) {
        this.showflag = showflag;
    }

    /**
     * 获取审核状态 NOT_YET: 待审核 PASSED:审核通过 REJECTED:审核不通过
     * 审核状态 NOT_YET: 待审核 PASSED:审核通过 REJECTED:审核不通过
     *
     * @return auditStatus - 审核状态 NOT_YET: 待审核 PASSED:审核通过 REJECTED:审核不通过
     * 审核状态 NOT_YET: 待审核 PASSED:审核通过 REJECTED:审核不通过
     */
    public String getAuditstatus() {
        return auditstatus;
    }

    /**
     * 设置审核状态 NOT_YET: 待审核 PASSED:审核通过 REJECTED:审核不通过
     * 审核状态 NOT_YET: 待审核 PASSED:审核通过 REJECTED:审核不通过
     *
     * @param auditstatus 审核状态 NOT_YET: 待审核 PASSED:审核通过 REJECTED:审核不通过
     *                    审核状态 NOT_YET: 待审核 PASSED:审核通过 REJECTED:审核不通过
     */
    public void setAuditstatus(String auditstatus) {
        this.auditstatus = auditstatus;
    }

    /**
     * 获取审核不通过原因
     *
     * @return reason - 审核不通过原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置审核不通过原因
     *
     * @param reason 审核不通过原因
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 获取发布人
     *
     * @return wxNickname - 发布人
     */
    public String getWxnickname() {
        return wxnickname;
    }

    /**
     * 设置发布人
     *
     * @param wxnickname 发布人
     */
    public void setWxnickname(String wxnickname) {
        this.wxnickname = wxnickname;
    }
}