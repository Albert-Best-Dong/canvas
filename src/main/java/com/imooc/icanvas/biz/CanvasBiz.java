package com.imooc.icanvas.biz;

import com.imooc.icanvas.entity.Canvas;

import java.util.List;

public interface CanvasBiz {
    void add(Canvas canvas);

    void edit(Canvas canvas);

    void remove(int id);

    Canvas get(int id);

    List<Canvas> getAll();
}
