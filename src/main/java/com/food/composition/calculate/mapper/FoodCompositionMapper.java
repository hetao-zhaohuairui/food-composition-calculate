package com.food.composition.calculate.mapper;

import com.food.composition.calculate.model.FoodComposition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 食材成分表Mapper，操作数据库
 *
 * @author H.R.ZHAO
 */
@Mapper
public interface FoodCompositionMapper {

    @Select("SELECT * FROM FOOD_COMPOSITION_DATABASES WHERE ID=#{id}")
    public FoodComposition selectById(String id);

    @Select("SELECT * FROM FOOD_COMPOSITION_DATABASES")
    public List<FoodComposition> selectAll();

}
