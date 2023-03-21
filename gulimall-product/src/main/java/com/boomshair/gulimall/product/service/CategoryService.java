package com.boomshair.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.boomshair.common.utils.PageUtils;
import com.boomshair.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author boomshair
 * @email 957904176@qq.com
 * @date 2023-03-21 21:33:31
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

