package com.gj.app.mapper;

import com.gj.app.entity.SysFile;
import com.gj.app.entity.SysFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFileMapper {
    long countByExample(SysFileExample example);

    int deleteByExample(SysFileExample example);

    int insert(SysFile record);

    int insertSelective(SysFile record);

    List<SysFile> selectByExample(SysFileExample example);

    int updateByExampleSelective(@Param("record") SysFile record, @Param("example") SysFileExample example);

    int updateByExample(@Param("record") SysFile record, @Param("example") SysFileExample example);

    int batchInsert(List<SysFile> list);

    int batchUpdate(List<SysFile> list);
}