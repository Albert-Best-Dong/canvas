package com.imooc.icanvas.dao;

import com.imooc.icanvas.entity.Canvas;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CanvasDao {
    @Insert("insert into canvas(categoryId,name,creator,price,smallImg,createTime,updateTime,description,details)" +
            "values(#{categoryId},#{name},#{creator},#{price},#{smallImg},#{createTime},#{updateTime},#{description},#{details})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Canvas canvas);

    @UpdateProvider(type = CanvasProvider.class, method = "updateSQL")
    void update(Canvas canvas);

    @Delete("delete from canvas where id = #{id}")
    void delete(int id);

    @Select("select c.*,ca.id cid from canvas c left join category ca on c.categoryId = ca.id where c.id = #{id}")
    @Results(id = "all", value = {
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "categoryId", property = "categoryId"),
            @Result(column = "name", property = "name"),
            @Result(column = "creator", property = "creator"),
            @Result(column = "price", property = "price"),
            @Result(column = "smallImg", property = "smallImg"),
            @Result(column = "createTime", property = "createTime"),
            @Result(column = "updateTime", property = "updateTime"),
            @Result(column = "description", property = "description"),
            @Result(column = "details", property = "details"),
            @Result(column = "cid", property = "category.id")
    })
    Canvas select(int id);

    @Select("select c.*,ca.id cid from canvas c left join category ca on c.categoryId = ca.id order by id desc")
    @ResultMap("all")
    List<Canvas> selectAll();

    @Select("select c.*,ca.name cname from canvas c left join category ca on c.categoryId=ca.id where c.categoryId=#{cid}")
    @ResultMap("all")
    List<Canvas> selectByCid(int cid);
}
