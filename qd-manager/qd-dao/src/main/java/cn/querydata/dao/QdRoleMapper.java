package cn.querydata.dao;

import cn.querydata.pojo.QdRole;
import cn.querydata.pojo.QdRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QdRoleMapper {
    int countByExample(QdRoleExample example);

    int deleteByExample(QdRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QdRole record);

    int insertSelective(QdRole record);

    List<QdRole> selectByExample(QdRoleExample example);

    QdRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QdRole record, @Param("example") QdRoleExample example);

    int updateByExample(@Param("record") QdRole record, @Param("example") QdRoleExample example);

    int updateByPrimaryKeySelective(QdRole record);

    int updateByPrimaryKey(QdRole record);
}