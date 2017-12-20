package cn.querydata.pojo;

import java.io.Serializable;

public class QdRoleAccount implements Serializable{
    @Override
    public String toString() {
        return "QdRoleAccount{" +
                "roleId=" + roleId +
                ", accountId=" + accountId +
                ", adminId=" + adminId +
                '}';
    }

    private Integer roleId;

    private Integer accountId;

    private Integer adminId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
}