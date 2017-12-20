package cn.querydata.pojo;

import java.io.Serializable;

public class QdRole implements Serializable{
    @Override
    public String toString() {
        return "QdRole{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleStatus=" + roleStatus +
                ", adminId=" + adminId +
                '}';
    }

    private Integer id;

    private String roleName;

    private Integer roleStatus;

    private Integer adminId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(Integer roleStatus) {
        this.roleStatus = roleStatus;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
}