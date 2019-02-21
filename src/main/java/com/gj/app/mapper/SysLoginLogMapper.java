package com.gj.app.mapper;

import com.gj.app.entity.SysLoginLog;
import com.gj.app.entity.SysLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLoginLogMapper {
    long countByExample(SysLoginLogExample example);

    int deleteByExample(SysLoginLogExample example);

    int insert(SysLoginLog record);

    int insertSelective(SysLoginLog record);

    List<SysLoginLog> selectByExampleWithBLOBs(SysLoginLogExample example);

    List<SysLoginLog> selectByExample(SysLoginLogExample example);

    int updateByExampleSelective(@Param("record") SysLoginLog record, @Param("example") SysLoginLogExample example);

    int updateByExampleWithBLOBs(@Param("record") SysLoginLog record, @Param("example") SysLoginLogExample example);

    int updateByExample(@Param("record") SysLoginLog record, @Param("example") SysLoginLogExample example);

    int batchInsert(List<SysLoginLog> list);

    int batchUpdate(List<SysLoginLog> list);
}