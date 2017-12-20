package cn.querydata.pojo;

import java.io.Serializable;

public class QdTableName implements Serializable{
    @Override
    public String toString() {
        return "QdTableName{" +
                "tableId=" + tableId +
                ", tableName='" + tableName + '\'' +
                ", tableChName='" + tableChName + '\'' +
                ", tableChStatus=" + tableChStatus +
                ", dbId=" + dbId +
                '}';
    }

    private Integer tableId;

    private String tableName;

    private String tableChName;

    private Integer tableChStatus;

    private Integer dbId;

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getTableChName() {
        return tableChName;
    }

    public void setTableChName(String tableChName) {
        this.tableChName = tableChName == null ? null : tableChName.trim();
    }

    public Integer getTableChStatus() {
        return tableChStatus;
    }

    public void setTableChStatus(Integer tableChStatus) {
        this.tableChStatus = tableChStatus;
    }

    public Integer getDbId() {
        return dbId;
    }

    public void setDbId(Integer dbId) {
        this.dbId = dbId;
    }
}