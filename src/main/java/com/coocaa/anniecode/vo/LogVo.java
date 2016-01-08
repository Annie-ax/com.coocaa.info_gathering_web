package com.coocaa.anniecode.vo;

/**
 * Created by keaxiang on 2015/12/31.
 */
public class LogVo {
    private String queue;
    private String createtime;
    private String happentime;
    private Integer pid;
    private Integer level;
    private String msg;

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getHappentime() {
        return happentime;
    }

    public void setHappentime(String happentime) {
        this.happentime = happentime;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
