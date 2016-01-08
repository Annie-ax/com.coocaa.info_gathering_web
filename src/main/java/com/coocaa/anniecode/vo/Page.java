package com.coocaa.anniecode.vo;

/**
 * Created by keaxiang on 2016/1/6.
 */
public class Page {
    private int pageSize;
    private int currentPage;
    private int startPage;

    public int getStartPage() {
        return (currentPage - 1) * pageSize;
    }

    public void setStartPage(int startPage) {
        this.startPage = (currentPage - 1)*pageSize;
    }



    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
