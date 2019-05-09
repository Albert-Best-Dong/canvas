package com.imooc.icanvas.biz.impl;

import com.imooc.icanvas.biz.CanvasBiz;
import com.imooc.icanvas.dao.CanvasDao;
import com.imooc.icanvas.entity.Canvas;
import com.imooc.icanvas.global.DaoFactory;

import java.util.List;

public class CanvasBizImpl implements CanvasBiz {
    private CanvasDao canvasDao = DaoFactory.getInstence().getDao(CanvasDao.class);
    public void add(Canvas canvas) {
        canvasDao.insert(canvas);
    }

    public void edit(Canvas canvas) {
        canvasDao.update(canvas);
    }

    public void remove(int id) {
        canvasDao.delete(id);
    }

    public Canvas get(int id) {
        return canvasDao.select(id);
    }

    public List<Canvas> getAll() {
        return canvasDao.selectAll();
    }

    public List<Canvas> getForCategory(int cid) {
        return canvasDao.selectByCid(cid);
    }

    public List<Canvas> getForIndex() {
        return null;
    }
}
