package com.gj.app.mapper;

import com.gj.app.entity.SysOperationLog;
import com.gj.app.entity.SysOperationLogExample;
import com.gj.app.entity.SysOperationLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOperationLogMapper {
    long countByExample(SysOperationLogExample example);

    int deleteByExample(SysOperationLogExample example);

    int insert(SysOperationLogWithBLOBs record);

    int insertSelective(SysOperationLogWithBLOBs record);

    List<SysOperationLogWithBLOBs> selectByExampleWithBLOBs(SysOperationLogExample example);

    List<SysOperationLog> selectByExample(SysOperationLogExample example);

    int updateByExampleSelective(@Param("record") SysOperationLogWithBLOBs record, @Param("example") SysOperationLogExample example);

    int updateByExampleWithBLOBs(@Param("record") SysOperationLogWithBLOBs record, @Param("example") SysOperationLogExample example);

    int updateByExample(@Param("record") SysOperationLog record, @Param("example") SysOperationLogExample example);

    int batchInsert(List<SysOperationLog> list);

    int batchUpdate(List<SysOperationLog> list);
}