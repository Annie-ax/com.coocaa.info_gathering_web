package com.coocaa.anniecode.service;

import com.coocaa.anniecode.pojo.Log;
import com.coocaa.anniecode.vo.LogVo;

import java.util.List;

/**
 * Created by keaxiang on 2015/12/31.
 */
public interface LogService {
    /**
     * 查询所有
     * @return
     */
    List<LogVo> findAll();

    /**
     * 分页查询
     * @param currentPage 当前页
     * @param pageSize 每页显示记录数
     * @return
     */
    List<LogVo> findByPage(int currentPage,int pageSize);

    /**
     * 获取总记录数
     * @return
     */
    int recordSum();

    /**
     * 保存一条记录
     * @param log
     */
    void saveRecord(Log log);
}
