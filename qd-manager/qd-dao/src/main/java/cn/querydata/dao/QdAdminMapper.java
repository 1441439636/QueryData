package cn.querydata.dao;

import cn.querydata.pojo.QdAdmin;
import cn.querydata.pojo.QdAdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QdAdminMapper {
    int countByExample(QdAdminExample example);

    int deleteByExample(QdAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QdAdmin record);

    int insertSelective(QdAdmin record);

    List<QdAdmin> selectByExample(QdAdminExample example);

    QdAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QdAdmin record, @Param("example") QdAdminExample example);

    int updateByExample(@Param("record") QdAdmin record, @Param("example") QdAdminExample example);

    int updateByPrimaryKeySelective(QdAdmin record);

    int updateByPrimaryKey(QdAdmin record);
}