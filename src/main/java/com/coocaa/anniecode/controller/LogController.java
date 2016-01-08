package com.coocaa.anniecode.controller;

import com.coocaa.anniecode.pojo.Log;
import com.coocaa.anniecode.rabbitmq.QueueConsumer;
import com.coocaa.anniecode.service.LogService;
import com.coocaa.anniecode.vo.LogVo;
import com.rabbitmq.client.QueueingConsumer;
import org.apache.commons.lang.SerializationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

/**
 * Created by keaxiang on 2015/12/31.
 */

@Controller
public class LogController {
    @Autowired
    private LogService logService;

    @RequestMapping("/Logquery")
    public ModelAndView logRequest(){
        List<LogVo> logList = new ArrayList<LogVo>();
        List<Integer> pageList = new ArrayList<Integer>();
        ModelAndView modelAndView = new ModelAndView();
        //modelAndView.addObject("logList",logList);
        //logList = logService.findByPage(1,6);
        int sum = logService.recordSum();
        modelAndView.addObject("pageSum",sum);
        if(sum > 0) {
            logList = logService.findByPage(1,6);
            modelAndView.addObject("logList",logList);
            modelAndView.addObject("page", 1);
            for (int i = 1; i <= Math.ceil(sum / 6.0); i++)
                pageList.add(i);
            modelAndView.addObject("pageList",pageList);
        }

        modelAndView.setViewName("findAll");

        return modelAndView;
    }

    @RequestMapping("/pagequery")
    public ModelAndView pageRequest(@RequestParam("currentPage") int currentPage,@RequestParam("pageSum") int pageSum){

        List<LogVo> logList = new ArrayList();
        ModelAndView modelAndView = new ModelAndView();
        logList = logService.findByPage(currentPage,6);
        modelAndView.addObject("logList",logList);
        modelAndView.addObject("pageSum",pageSum);
        List<Integer> pageList = new ArrayList<Integer>();
        //int sum = logService.recordSum();
        for (int i = 1; i <= Math.ceil(pageSum / 6.0); i++)
            pageList.add(i);
        modelAndView.addObject("pageList",pageList);
        modelAndView.addObject("page",currentPage);
        modelAndView.setViewName("findAll");

        return modelAndView;
    }
}
