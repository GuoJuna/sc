package com.gj.app.mapper;

import com.gj.app.entity.SysExpense;
import com.gj.app.entity.SysExpenseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysExpenseMapper {
    long countByExample(SysExpenseExample example);

    int deleteByExample(SysExpenseExample example);

    int insert(SysExpense record);

    int insertSelective(SysExpense record);

    List<SysExpense> selectByExample(SysExpenseExample example);

    int updateByExampleSelective(@Param("record") SysExpense record, @Param("example") SysExpenseExample example);

    int updateByExample(@Param("record") SysExpense record, @Param("example") SysExpenseExample example);

    int batchInsert(List<SysExpense> list);

    int batchUpdate(List<SysExpense> list);
}