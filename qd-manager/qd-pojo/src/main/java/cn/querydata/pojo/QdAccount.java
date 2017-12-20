package cn.querydata.pojo;

import java.io.Serializable;

public class QdAccount implements Serializable{
    @Override
    public String toString() {
        return "QdAccount{" +
                "id=" + id +
                ", accountNum='" + accountNum + '\'' +
                ", accountPasswd='" + accountPasswd + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accountStatus=" + accountStatus +
                ", adminId=" + adminId +
                ", roleId=" + roleId +
                '}';
    }

    private Integer id;

    private String accountNum;

    private String accountPasswd;

    private String accountName;

    private Integer accountStatus;

    private Integer adminId;

    private Integer roleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum == null ? null : accountNum.trim();
    }

    public String getAccountPasswd() {
        return accountPasswd;
    }

    public void setAccountPasswd(String accountPasswd) {
        this.accountPasswd = accountPasswd == null ? null : accountPasswd.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public Integer getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}