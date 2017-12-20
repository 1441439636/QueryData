package cn.querydata.pojo;

import java.io.Serializable;

public class QdPremission implements Serializable{
    @Override
    public String toString() {
        return "QdPremission{" +
                "roleId=" + roleId +
                ", columnName='" + columnName + '\'' +
                ", tableId='" + tableId + '\'' +
                '}';
    }

    private Integer roleId;

    private String columnName;

    private String tableId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId == null ? null : tableId.trim();
    }
}