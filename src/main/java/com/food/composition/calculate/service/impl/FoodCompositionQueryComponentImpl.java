package com.food.composition.calculate.service.impl;

import com.food.composition.calculate.mapper.FoodCompositionMapper;
import com.food.composition.calculate.model.FoodComposition;
import com.food.composition.calculate.service.FoodCompositionQueryComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 食材成分查询组件实现类
 *
 * @author H.R.ZHAO
 */
@Service
public class FoodCompositionQueryComponentImpl implements FoodCompositionQueryComponent {

    @Autowired
    private FoodCompositionMapper foodCompositionMapper;

    @Override
    public FoodComposition getById(String id) {
        return foodCompositionMapper.selectById(id);
    }

    @Override
    public List<FoodComposition> getAll() {
        return foodCompositionMapper.selectAll();
    }
}
