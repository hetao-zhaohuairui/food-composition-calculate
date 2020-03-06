package com.food.composition.calculate.controller;

import com.food.composition.calculate.model.FoodComposition;
import com.food.composition.calculate.service.FoodCompositionQueryComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 
 * @author H.R.ZHAO
 * 
 * @version TestController.java, v 0.1 2020年03月06日 11:48:40 H.R.ZHAO Exp $
 */
@RestController
public class TestController {

	@Autowired
	private FoodCompositionQueryComponent foodCompositionComponent;

	@GetMapping("/test/{id}")
	public FoodComposition getFoodComposition(@PathVariable("id") String id) {
		return foodCompositionComponent.getById(id);
	}

	@GetMapping("/test/getAll")
	public List<FoodComposition> getAllFoodComposition() {
		return foodCompositionComponent.getAll();
	}

}
