package com.coocaa.anniecode.service;

import com.coocaa.anniecode.mapper.LogMapper;
import com.coocaa.anniecode.pojo.Log;
import com.coocaa.anniecode.vo.LogVo;
import com.coocaa.anniecode.vo.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by keaxiang on 2015/12/31.
 */

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogMapper logMapper;
    public List<LogVo> findAll() {
        List<LogVo> array = new ArrayList<LogVo>();

        List<Log> logList = new ArrayList<Log>();
        logList = logMapper.selectAll();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        for(int i = 0;i < logList.size();i++){
            LogVo logVo = new LogVo();
            logVo.setQueue(logList.get(i).getQueue());
            String createtime = sdf.format(logList.get(i).getCreatetime());
            logVo.setCreatetime(createtime);
            String time = sdf.format(logList.get(i).getTimeDate()) + "." + logList.get(i).getTimeSecond();
            logVo.setHappentime(time);
            logVo.setPid(logList.get(i).getPid());
            logVo.setLevel(logList.get(i).getLevel());
            logVo.setMsg(logList.get(i).getMsg());
            array.add(logVo);
        }

        return array;
    }



    public List<LogVo> findByPage(int currentPage, int pageSize) {
        List<LogVo> array = new ArrayList<LogVo>();
        List<Log> logList = new ArrayList<Log>();
        Page page = new Page();
        page.setCurrentPage(currentPage);
        page.setPageSize(pageSize);
        logList = logMapper.selectByPage(page);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        for(int i = 0;i < logList.size();i++){
            LogVo logVo = new LogVo();
            logVo.setQueue(logList.get(i).getQueue());
            String createtime = null;
            if(logList.get(i).getCreatetime() != null){
                createtime = sdf.format(logList.get(i).getCreatetime());
            }
            logVo.setCreatetime(createtime);
            String time = null;
            if(logList.get(i).getTimeDate() != null){
                time = sdf.format(logList.get(i).getTimeDate()) + "." + logList.get(i).getTimeSecond();
            }
            logVo.setHappentime(time);
            if(logList.get(i).getPid() != null){
                logVo.setPid(logList.get(i).getPid());
            }
            if(logList.get(i).getLevel() != null){
                logVo.setLevel(logList.get(i).getLevel());
            }
            if(logList.get(i).getMsg() != null){
                logVo.setMsg(logList.get(i).getMsg());
            }

            array.add(logVo);
        }
        return array;
    }

    public int recordSum() {
        return logMapper.selectRecord();
    }

    public void saveRecord(Log log) {
        System.out.println("now in service");
        logMapper.saveLog(log);
        //System.out.println("成功插入一条记录");
    }
}
