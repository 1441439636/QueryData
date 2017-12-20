package cn.querydata.dao;

import cn.querydata.pojo.QdTableName;
import cn.querydata.pojo.QdTableNameExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QdTableNameMapper {
    int countByExample(QdTableNameExample example);

    int deleteByExample(QdTableNameExample example);

    int insert(QdTableName record);

    int insertSelective(QdTableName record);

    List<QdTableName> selectByExample(QdTableNameExample example);

    int updateByExampleSelective(@Param("record") QdTableName record, @Param("example") QdTableNameExample example);

    int updateByExample(@Param("record") QdTableName record, @Param("example") QdTableNameExample example);
}