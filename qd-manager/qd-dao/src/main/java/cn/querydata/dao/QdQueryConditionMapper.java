package cn.querydata.dao;

import cn.querydata.pojo.QdQueryCondition;
import cn.querydata.pojo.QdQueryConditionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QdQueryConditionMapper {
    int countByExample(QdQueryConditionExample example);

    int deleteByExample(QdQueryConditionExample example);

    int insert(QdQueryCondition record);

    int insertSelective(QdQueryCondition record);

    List<QdQueryCondition> selectByExample(QdQueryConditionExample example);

    int updateByExampleSelective(@Param("record") QdQueryCondition record, @Param("example") QdQueryConditionExample example);

    int updateByExample(@Param("record") QdQueryCondition record, @Param("example") QdQueryConditionExample example);
}