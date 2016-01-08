package com.coocaa.anniecode.service;

import com.coocaa.anniecode.pojo.Log;
import com.coocaa.anniecode.vo.LogVo;

import java.util.List;

/**
 * Created by keaxiang on 2015/12/31.
 */
public interface LogService {
    /**
     * ��ѯ����
     * @return
     */
    List<LogVo> findAll();

    /**
     * ��ҳ��ѯ
     * @param currentPage ��ǰҳ
     * @param pageSize ÿҳ��ʾ��¼��
     * @return
     */
    List<LogVo> findByPage(int currentPage,int pageSize);

    /**
     * ��ȡ�ܼ�¼��
     * @return
     */
    int recordSum();

    /**
     * ����һ����¼
     * @param log
     */
    void saveRecord(Log log);
}
