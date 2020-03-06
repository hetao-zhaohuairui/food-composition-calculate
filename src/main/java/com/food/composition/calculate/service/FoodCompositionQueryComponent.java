package com.food.composition.calculate.service;

import com.food.composition.calculate.model.FoodComposition;

import java.util.List;

/**
 * 食材成分查询组件
 * 
 * @author H.R.ZHAO
 *
 * @version FoodCompositionQueryComponent.java, v 0.1 2020年03月06日 11:49:40
 *          H.R.ZHAO Exp $
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
