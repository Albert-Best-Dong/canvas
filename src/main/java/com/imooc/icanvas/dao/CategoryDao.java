package com.imooc.icanvas.dao;

import com.imooc.icanvas.entity.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CategoryDao {
    void insert(Category category);
    @Delete("delete from category where id=#{id}")
    void delete(int id);

    Category select(int id);
    @Select("select * from category")
    @Results(value = {
            @Result(column = "id",property = "id",id = true)
    })
    List<Category> selectAll();
}
