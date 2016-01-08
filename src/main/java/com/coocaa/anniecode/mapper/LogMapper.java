package com.coocaa.anniecode.mapper;

import com.coocaa.anniecode.pojo.Log;
import com.coocaa.anniecode.pojo.LogExample;
import java.util.List;

import com.coocaa.anniecode.vo.Page;
import org.apache.ibatis.annotations.Param;

public interface LogMapper {
    /*int countByExample(LogExample example);

    int deleteByExample(LogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Log record);

    int insertSelective(Log record);

    List<Log> selectByExample(LogExample example);

    Log selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Log record, @Param("example") LogExample example);

    int updateByExample(@Param("record") Log record, @Param("example") LogExample example);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);*/

    /**
     * 查询所有
     * @return
     */
    List<Log> selectAll();

    /**
     * 分页查询
     * @param page
     * @return
     */
    List<Log> selectByPage(Page page);

    /**
     * 查询总的记录数
     * @return
     */
    int selectRecord();

    /**
     * 保存一条记录
     * @param log
     */
    void saveLog(Log log);
}