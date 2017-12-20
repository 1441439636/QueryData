package cn.querydata.pojo;

import java.io.Serializable;

public class QdColumnName implements Serializable{
    @Override
    public String toString() {
        return "QdColumnName{" +
                "columnName='" + columnName + '\'' +
                ", columnChName='" + columnChName + '\'' +
                ", colmnChStatus=" + colmnChStatus +
                ", columnDataType='" + columnDataType + '\'' +
                ", columnNo=" + columnNo +
                ", tableId=" + tableId +
                ", dbId=" + dbId +
                '}';
    }

    private String columnName;

    private String columnChName;

    private Integer colmnChStatus;

    private String columnDataType;

    private Integer columnNo;

    private Integer tableId;

    private Integer dbId;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }

    public String getColumnChName() {
        return columnChName;
    }

    public void setColumnChName(String columnChName) {
        this.columnChName = columnChName == null ? null : columnChName.trim();
    }

    public Integer getColmnChStatus() {
        return colmnChStatus;
    }

    public void setColmnChStatus(Integer colmnChStatus) {
        this.colmnChStatus = colmnChStatus;
    }

    public String getColumnDataType() {
        return columnDataType;
    }

    public void setColumnDataType(String columnDataType) {
        this.columnDataType = columnDataType == null ? null : columnDataType.trim();
    }

    public Integer getColumnNo() {
        return columnNo;
    }

    public void setColumnNo(Integer columnNo) {
        this.columnNo = columnNo;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getDbId() {
        return dbId;
    }

    public void setDbId(Integer dbId) {
        this.dbId = dbId;
    }
}