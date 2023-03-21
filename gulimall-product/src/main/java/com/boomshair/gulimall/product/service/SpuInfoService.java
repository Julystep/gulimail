package com.boomshair.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.boomshair.common.utils.PageUtils;
import com.boomshair.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author boomshair
 * @email 957904176@qq.com
 * @date 2023-03-21 21:33:31
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

