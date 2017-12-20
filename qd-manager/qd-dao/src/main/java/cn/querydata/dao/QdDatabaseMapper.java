package cn.querydata.dao;

import cn.querydata.pojo.QdDatabase;
import cn.querydata.pojo.QdDatabaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QdDatabaseMapper {
    int countByExample(QdDatabaseExample example);

    int deleteByExample(QdDatabaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QdDatabase record);

    int insertSelective(QdDatabase record);

    List<QdDatabase> selectByExample(QdDatabaseExample example);

    QdDatabase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QdDatabase record, @Param("example") QdDatabaseExample example);

    int updateByExample(@Param("record") QdDatabase record, @Param("example") QdDatabaseExample example);

    int updateByPrimaryKeySelective(QdDatabase record);

    int updateByPrimaryKey(QdDatabase record);
}