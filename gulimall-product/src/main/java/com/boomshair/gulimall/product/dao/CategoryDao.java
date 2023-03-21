package com.boomshair.gulimall.product.dao;

import com.boomshair.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author boomshair
 * @email 957904176@qq.com
 * @date 2023-03-21 21:33:31
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
