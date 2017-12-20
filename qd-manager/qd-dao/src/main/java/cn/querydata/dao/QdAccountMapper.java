package cn.querydata.dao;

import cn.querydata.pojo.QdAccount;
import cn.querydata.pojo.QdAccountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QdAccountMapper {
    int countByExample(QdAccountExample example);

    int deleteByExample(QdAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QdAccount record);

    int insertSelective(QdAccount record);

    List<QdAccount> selectByExample(QdAccountExample example);

    QdAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QdAccount record, @Param("example") QdAccountExample example);

    int updateByExample(@Param("record") QdAccount record, @Param("example") QdAccountExample example);

    int updateByPrimaryKeySelective(QdAccount record);

    int updateByPrimaryKey(QdAccount record);
}