package com.imooc.icanvas.dao;

import com.imooc.icanvas.entity.Canvas;

import java.util.List;

public interface CanvasDao {
    void insert(Canvas canvas);

    void update(Canvas canvas);

    void delete(int id);

    Canvas select(int id);

    List<Canvas> selectAll();

    List<Canvas> selectByStatus(String status);

    List<Canvas> selectByCid(int cid);
}
