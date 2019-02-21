package com.gj.app.mapper;

import com.gj.app.entity.SysRelation;
import com.gj.app.entity.SysRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRelationMapper {
    long countByExample(SysRelationExample example);

    int deleteByExample(SysRelationExample example);

    int insert(SysRelation record);

    int insertSelective(SysRelation record);

    List<SysRelation> selectByExample(SysRelationExample example);

    int updateByExampleSelective(@Param("record") SysRelation record, @Param("example") SysRelationExample example);

    int updateByExample(@Param("record") SysRelation record, @Param("example") SysRelationExample example);

    int batchInsert(List<SysRelation> list);

    int batchUpdate(List<SysRelation> list);
}