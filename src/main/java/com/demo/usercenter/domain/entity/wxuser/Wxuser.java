package com.demo.usercenter.domain.entity.wxuser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "wxuser")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wxuser implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private Integer userid;

    private Integer title;

    @Column(name = "createTime")
    private Date createtime;

    @Column(name = "updateTime")
    private Date updatetime;

    @Column(name = "isOriginal")
    private Integer isoriginal;

    private String author;

    private String cover;

    private String summary;

    private Integer price;

    @Column(name = "downloadUrl")
    private String downloadurl;

    @Column(name = "buyCount")
    private Integer buycount;

    @Column(name = "showFlag")
    private Integer showflag;

    @Column(name = "auditStatus")
    private String auditstatus;

    private String reason;

    private String wxnickname;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return userid
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return title
     */
    public Integer getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(Integer title) {
        this.title = title;
    }

    /**
     * @return createTime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return updateTime
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * @param updatetime
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * @return isOriginal
     */
    public Integer getIsoriginal() {
        return isoriginal;
    }

    /**
     * @param isoriginal
     */
    public void setIsoriginal(Integer isoriginal) {
        this.isoriginal = isoriginal;
    }

    /**
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * @param cover
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadurl() {
        return downloadurl;
    }

    /**
     * @param downloadurl
     */
    public void setDownloadurl(String downloadurl) {
        this.downloadurl = downloadurl;
    }

    /**
     * @return buyCount
     */
    public Integer getBuycount() {
        return buycount;
    }

    /**
     * @param buycount
     */
    public void setBuycount(Integer buycount) {
        this.buycount = buycount;
    }

    /**
     * @return showFlag
     */
    public Integer getShowflag() {
        return showflag;
    }

    /**
     * @param showflag
     */
    public void setShowflag(Integer showflag) {
        this.showflag = showflag;
    }

    /**
     * @return auditStatus
     */
    public String getAuditstatus() {
        return auditstatus;
    }

    /**
     * @param auditstatus
     */
    public void setAuditstatus(String auditstatus) {
        this.auditstatus = auditstatus;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return wxnickname
     */
    public String getWxnickname() {
        return wxnickname;
    }

    /**
     * @param wxnickname
     */
    public void setWxnickname(String wxnickname) {
        this.wxnickname = wxnickname;
    }
}