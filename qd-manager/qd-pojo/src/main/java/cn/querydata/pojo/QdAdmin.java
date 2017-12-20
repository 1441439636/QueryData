package cn.querydata.pojo;

import java.io.Serializable;

public class QdAdmin implements Serializable{
    @Override
    public String toString() {
        return "QdAdmin{" +
                "id=" + id +
                ", adminNum='" + adminNum + '\'' +
                ", adminPasswd='" + adminPasswd + '\'' +
                ", adminType=" + adminType +
                ", adminInfo='" + adminInfo + '\'' +
                ", adminName='" + adminName + '\'' +
                ", adminMail='" + adminMail + '\'' +
                ", adminPhone='" + adminPhone + '\'' +
                '}';
    }

    private Integer id;

    private String adminNum;

    private String adminPasswd;

    private Integer adminType;

    private String adminInfo;

    private String adminName;

    private String adminMail;

    private String adminPhone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminNum() {
        return adminNum;
    }

    public void setAdminNum(String adminNum) {
        this.adminNum = adminNum == null ? null : adminNum.trim();
    }

    public String getAdminPasswd() {
        return adminPasswd;
    }

    public void setAdminPasswd(String adminPasswd) {
        this.adminPasswd = adminPasswd == null ? null : adminPasswd.trim();
    }

    public Integer getAdminType() {
        return adminType;
    }

    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }

    public String getAdminInfo() {
        return adminInfo;
    }

    public void setAdminInfo(String adminInfo) {
        this.adminInfo = adminInfo == null ? null : adminInfo.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminMail() {
        return adminMail;
    }

    public void setAdminMail(String adminMail) {
        this.adminMail = adminMail == null ? null : adminMail.trim();
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone == null ? null : adminPhone.trim();
    }
}