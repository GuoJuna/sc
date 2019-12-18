package com.gj.app.mapper;

import com.gj.app.entity.SysTask;
import com.gj.app.entity.SysTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTaskMapper {
    long countByExample(SysTaskExample example);

    int deleteByExample(SysTaskExample example);

    int insert(SysTask record);

    int insertSelective(SysTask record);

    List<SysTask> selectByExample(SysTaskExample example);

    int updateByExampleSelective(@Param("record") SysTask record, @Param("example") SysTaskExample example);

    int updateByExample(@Param("record") SysTask record, @Param("example") SysTaskExample example);

    int batchInsert(List<SysTask> list);

    int batchUpdate(List<SysTask> list);
}