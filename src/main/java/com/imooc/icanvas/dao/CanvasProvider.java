package com.imooc.icanvas.dao;

import com.imooc.icanvas.entity.Canvas;
import org.apache.ibatis.jdbc.SQL;

public class CanvasProvider {
    public String updateSQL(final Canvas canvas) {
        return new SQL() {
            {
                UPDATE("canvas");
                SET();
                if (canvas.getCreateTime() != null) {
                    SET("creatTime = #{creatTime}");
                }
                if (canvas.getName() != null) {
                    SET("name = #{name}");
                }
                if (canvas.getUpdateTime() != null) {
                    SET("updateTime = #{updateTime}");
                }

                if (canvas.getDescription() != null) {
                    SET("description = #{description}");
                }
                if (canvas.getSmallImg() != null) {
                    SET("smallImg = #{smallImg}");
                }

                if (canvas.getCreator() != null) {
                    SET("creator = #{creator}");
                }
                SET("categoryId = #{categoryId}");
                SET("price = #{price}");


                if (canvas.getDescription() != null) {
                    SET("description = #{description}");
                }
                WHERE("id = #{id}");
            }
        }.toString();
    }
}
