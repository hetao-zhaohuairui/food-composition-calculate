package com.food.composition.calculate.service;

import com.food.composition.calculate.model.FoodComposition;

import java.util.List;

/**
 * 食材成分查询组件
 *
 * @author H.R.ZHAO
 */
public interface FoodCompositionQueryComponent {

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    public FoodComposition getById(String id);

    /**
     * 查询所有
     *
     * @return
     */
    public List<FoodComposition> getAll();

}
