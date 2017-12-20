package cn.querydata.dao;

import cn.querydata.pojo.QdPremission;
import cn.querydata.pojo.QdPremissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QdPremissionMapper {
    int countByExample(QdPremissionExample example);

    int deleteByExample(QdPremissionExample example);

    int insert(QdPremission record);

    int insertSelective(QdPremission record);

    List<QdPremission> selectByExample(QdPremissionExample example);

    int updateByExampleSelective(@Param("record") QdPremission record, @Param("example") QdPremissionExample example);

    int updateByExample(@Param("record") QdPremission record, @Param("example") QdPremissionExample example);
}