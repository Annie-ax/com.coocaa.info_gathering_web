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
     * ��ѯ����
     * @return
     */
    List<Log> selectAll();

    /**
     * ��ҳ��ѯ
     * @param page
     * @return
     */
    List<Log> selectByPage(Page page);

    /**
     * ��ѯ�ܵļ�¼��
     * @return
     */
    int selectRecord();

    /**
     * ����һ����¼
     * @param log
     */
    void saveLog(Log log);
}