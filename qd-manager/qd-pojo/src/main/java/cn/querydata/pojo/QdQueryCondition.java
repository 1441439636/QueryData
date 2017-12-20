package cn.querydata.pojo;

import java.io.Serializable;

public class QdQueryCondition implements Serializable{
    @Override
    public String toString() {
        return "QdQueryCondition{" +
                "accountId=" + accountId +
                ", tableId=" + tableId +
                ", columnChName='" + columnChName + '\'' +
                ", columnName='" + columnName + '\'' +
                ", columnCon1='" + columnCon1 + '\'' +
                ", colmnCon2='" + colmnCon2 + '\'' +
                ", dbId=" + dbId +
                '}';
    }

    private Integer accountId;

    private Integer tableId;

    private String columnChName;

    private String columnName;

    private String columnCon1;

    private String colmnCon2;

    private Integer dbId;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public String getColumnChName() {
        return columnChName;
    }

    public void setColumnChName(String columnChName) {
        this.columnChName = columnChName == null ? null : columnChName.trim();
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }

    public String getColumnCon1() {
        return columnCon1;
    }

    public void setColumnCon1(String columnCon1) {
        this.columnCon1 = columnCon1 == null ? null : columnCon1.trim();
    }

    public String getColmnCon2() {
        return colmnCon2;
    }

    public void setColmnCon2(String colmnCon2) {
        this.colmnCon2 = colmnCon2 == null ? null : colmnCon2.trim();
    }

    public Integer getDbId() {
        return dbId;
    }

    public void setDbId(Integer dbId) {
        this.dbId = dbId;
    }
}