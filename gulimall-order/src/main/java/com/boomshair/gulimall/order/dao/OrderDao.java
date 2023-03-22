package com.boomshair.gulimall.order.dao;

import com.boomshair.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author boomshair
 * @email 957904176@qq.com
 * @date 2023-03-22 21:01:47
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
