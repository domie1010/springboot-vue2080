package com.dao;

import com.entity.BinglijiuzhenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BinglijiuzhenxinxiVO;
import com.entity.view.BinglijiuzhenxinxiView;


/**
 * 病例就诊信息
 * 
 * @author 
 * @email 
 * @date 2021-01-13 16:52:48
 */
public interface BinglijiuzhenxinxiDao extends BaseMapper<BinglijiuzhenxinxiEntity> {
	
	List<BinglijiuzhenxinxiVO> selectListVO(@Param("ew") Wrapper<BinglijiuzhenxinxiEntity> wrapper);
	
	BinglijiuzhenxinxiVO selectVO(@Param("ew") Wrapper<BinglijiuzhenxinxiEntity> wrapper);
	
	List<BinglijiuzhenxinxiView> selectListView(@Param("ew") Wrapper<BinglijiuzhenxinxiEntity> wrapper);

	List<BinglijiuzhenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BinglijiuzhenxinxiEntity> wrapper);
	
	BinglijiuzhenxinxiView selectView(@Param("ew") Wrapper<BinglijiuzhenxinxiEntity> wrapper);
	
}
