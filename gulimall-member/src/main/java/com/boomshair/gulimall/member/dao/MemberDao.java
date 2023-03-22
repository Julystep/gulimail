package com.boomshair.gulimall.member.dao;

import com.boomshair.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author boomshair
 * @email 957904176@qq.com
 * @date 2023-03-22 20:52:27
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
