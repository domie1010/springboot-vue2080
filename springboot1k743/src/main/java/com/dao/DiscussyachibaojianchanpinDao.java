package com.dao;

import com.entity.DiscussyachibaojianchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyachibaojianchanpinVO;
import com.entity.view.DiscussyachibaojianchanpinView;


/**
 * 牙齿保健产品评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-13 16:52:48
 */
public interface DiscussyachibaojianchanpinDao extends BaseMapper<DiscussyachibaojianchanpinEntity> {
	
	List<DiscussyachibaojianchanpinVO> selectListVO(@Param("ew") Wrapper<DiscussyachibaojianchanpinEntity> wrapper);
	
	DiscussyachibaojianchanpinVO selectVO(@Param("ew") Wrapper<DiscussyachibaojianchanpinEntity> wrapper);
	
	List<DiscussyachibaojianchanpinView> selectListView(@Param("ew") Wrapper<DiscussyachibaojianchanpinEntity> wrapper);

	List<DiscussyachibaojianchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyachibaojianchanpinEntity> wrapper);
	
	DiscussyachibaojianchanpinView selectView(@Param("ew") Wrapper<DiscussyachibaojianchanpinEntity> wrapper);
	
}
