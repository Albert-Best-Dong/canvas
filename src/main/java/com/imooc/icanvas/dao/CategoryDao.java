package com.imooc.icanvas.dao;

import com.imooc.icanvas.entity.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CategoryDao {
    @Insert("insert into category(name,createName,createTime,updateTime,description) values" +
            "(#{name},#{createName},#{createTime},#{updateTime},#{description})"
    )
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Category category);

    @UpdateProvider(type = CategoryProvider.class,method = "updateSQL")
    void update(Category category);

    @Delete("delete from category where id=#{id}")
    void delete(int id);

    @Select("select * from category where id=#{id}")
    @Results(id = "all", value = {
            @Result(column = "id", property = "id", id = true),
            @Result(column = "name", property = "name"),
            @Result(column = "createName", property = "createName"),
            @Result(column = "createTime", property = "createTime"),
            @Result(column = "updateTime", property = "updateTime"),
            @Result(column = "description", property = "description")
    })
    Category select(int id);

    @Select("select * from category")
    @Results({
            @Result(column = "id", property = "id", id = true),
            @Result(column = "name", property = "name"),
            @Result(column = "createName", property = "createName"),
            @Result(column = "createTime", property = "createTime"),
            @Result(column = "updateTime", property = "updateTime"),
            @Result(column = "description", property = "description")
    })
    List<Category> selectAll();
}
