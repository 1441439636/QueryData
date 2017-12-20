package cn.querydata.dao;

import cn.querydata.pojo.QdRoleAccount;
import cn.querydata.pojo.QdRoleAccountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QdRoleAccountMapper {
    int countByExample(QdRoleAccountExample example);

    int deleteByExample(QdRoleAccountExample example);

    int insert(QdRoleAccount record);

    int insertSelective(QdRoleAccount record);

    List<QdRoleAccount> selectByExample(QdRoleAccountExample example);

    int updateByExampleSelective(@Param("record") QdRoleAccount record, @Param("example") QdRoleAccountExample example);

    int updateByExample(@Param("record") QdRoleAccount record, @Param("example") QdRoleAccountExample example);
}