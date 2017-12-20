package cn.querydata.pojo;

import java.io.Serializable;

public class QdDatabase implements Serializable{

    @Override
    public String toString() {
        return "QdDatabase{" +
                "id=" + id +
                ", dbType='" + dbType + '\'' +
                ", dbAddress='" + dbAddress + '\'' +
                ", dbPort='" + dbPort + '\'' +
                ", dbName='" + dbName + '\'' +
                ", dbUser='" + dbUser + '\'' +
                ", dbPasswd='" + dbPasswd + '\'' +
                ", dbStatus=" + dbStatus +
                ", adminId=" + adminId +
                '}';
    }

    private Integer id;
    private String dbType;
    private String dbAddress;
    private String dbPort;
    private String dbName;
    private String dbUser;
    private String dbPasswd;
    private Integer dbStatus;
    private Integer adminId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType == null ? null : dbType.trim();
    }

    public String getDbAddress() {
        return dbAddress;
    }

    public void setDbAddress(String dbAddress) {
        this.dbAddress = dbAddress == null ? null : dbAddress.trim();
    }

    public String getDbPort() {
        return dbPort;
    }

    public void setDbPort(String dbPort) {
        this.dbPort = dbPort == null ? null : dbPort.trim();
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName == null ? null : dbName.trim();
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser == null ? null : dbUser.trim();
    }

    public String getDbPasswd() {
        return dbPasswd;
    }

    public void setDbPasswd(String dbPasswd) {
        this.dbPasswd = dbPasswd == null ? null : dbPasswd.trim();
    }

    public Integer getDbStatus() {
        return dbStatus;
    }

    public void setDbStatus(Integer dbStatus) {
        this.dbStatus = dbStatus;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
}