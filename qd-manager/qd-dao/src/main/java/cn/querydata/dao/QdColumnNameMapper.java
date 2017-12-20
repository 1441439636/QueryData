package cn.querydata.dao;

import cn.querydata.pojo.QdColumnName;
import cn.querydata.pojo.QdColumnNameExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QdColumnNameMapper {
    int countByExample(QdColumnNameExample example);

    int deleteByExample(QdColumnNameExample example);

    int insert(QdColumnName record);

    int insertSelective(QdColumnName record);

    List<QdColumnName> selectByExample(QdColumnNameExample example);

    int updateByExampleSelective(@Param("record") QdColumnName record, @Param("example") QdColumnNameExample example);

    int updateByExample(@Param("record") QdColumnName record, @Param("example") QdColumnNameExample example);
}