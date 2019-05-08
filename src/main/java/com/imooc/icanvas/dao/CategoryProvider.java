package com.imooc.icanvas.dao;

import com.imooc.icanvas.entity.Category;
import org.apache.ibatis.jdbc.SQL;

import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;

public class CategoryProvider {
    public String updateSQL(final Category category) {
        return new SQL() {
            {
                UPDATE("category");
                SET();
                if (category.getCreateTime() != null) {
                    SET("creatTime = #{creatTime}");
                }
                if (category.getName() != null) {
                    SET("name = #{name}");
                }
                if (category.getUpdateTime() != null) {
                    SET("updateTime = #{updateTime}");
                }
                if (category.getCreateName() != null) {
                    SET("createName = #{createName}");
                }
                if (category.getDescription() != null) {
                    SET("description = #{description}");
                }
                WHERE("id = #{id}");
            }
        }.toString();
    }
}
