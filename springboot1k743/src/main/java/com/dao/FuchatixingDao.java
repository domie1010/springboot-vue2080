package com.dao;

import com.entity.FuchatixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuchatixingVO;
import com.entity.view.FuchatixingView;


/**
 * 复查提醒
 * 
 * @author 
 * @email 
 * @date 2021-01-13 16:52:48
 */
public interface FuchatixingDao extends BaseMapper<FuchatixingEntity> {
	
	List<FuchatixingVO> selectListVO(@Param("ew") Wrapper<FuchatixingEntity> wrapper);
	
	FuchatixingVO selectVO(@Param("ew") Wrapper<FuchatixingEntity> wrapper);
	
	List<FuchatixingView> selectListView(@Param("ew") Wrapper<FuchatixingEntity> wrapper);

	List<FuchatixingView> selectListView(Pagination page,@Param("ew") Wrapper<FuchatixingEntity> wrapper);
	
	FuchatixingView selectView(@Param("ew") Wrapper<FuchatixingEntity> wrapper);
	
}
