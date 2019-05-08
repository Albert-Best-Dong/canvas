package com.imooc.icanvas.biz.impl;

import com.imooc.icanvas.biz.CanvasBiz;
import com.imooc.icanvas.dao.CanvasDao;
import com.imooc.icanvas.entity.Canvas;
import com.imooc.icanvas.global.DaoFactory;

import java.util.List;

public class CanvasBizImpl implements CanvasBiz {
    private CanvasDao canvasDao = DaoFactory.getInstence().getDao(CanvasDao.class);
    public void add(Canvas canvas) {

    }

    public void edit(Canvas canvas) {

    }

    public void remove(int id) {

    }

    public Canvas get(int id) {
        return null;
    }

    public List<Canvas> getAll() {
        return null;
    }
}
