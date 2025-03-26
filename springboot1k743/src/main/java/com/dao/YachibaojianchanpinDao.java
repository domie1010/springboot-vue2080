package com.dao;

import com.entity.YachibaojianchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YachibaojianchanpinVO;
import com.entity.view.YachibaojianchanpinView;


/**
 * 牙齿保健产品
 * 
 * @author 
 * @email 
 * @date 2021-01-13 16:52:48
 */
public interface YachibaojianchanpinDao extends BaseMapper<YachibaojianchanpinEntity> {
	
	List<YachibaojianchanpinVO> selectListVO(@Param("ew") Wrapper<YachibaojianchanpinEntity> wrapper);
	
	YachibaojianchanpinVO selectVO(@Param("ew") Wrapper<YachibaojianchanpinEntity> wrapper);
	
	List<YachibaojianchanpinView> selectListView(@Param("ew") Wrapper<YachibaojianchanpinEntity> wrapper);

	List<YachibaojianchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<YachibaojianchanpinEntity> wrapper);
	
	YachibaojianchanpinView selectView(@Param("ew") Wrapper<YachibaojianchanpinEntity> wrapper);
	
}
