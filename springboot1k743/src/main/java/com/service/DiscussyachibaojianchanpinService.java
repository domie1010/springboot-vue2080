package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyachibaojianchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyachibaojianchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyachibaojianchanpinView;


/**
 * 牙齿保健产品评论表
 *
 * @author 
 * @email 
 * @date 2021-01-13 16:52:48
 */
public interface DiscussyachibaojianchanpinService extends IService<DiscussyachibaojianchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyachibaojianchanpinVO> selectListVO(Wrapper<DiscussyachibaojianchanpinEntity> wrapper);
   	
   	DiscussyachibaojianchanpinVO selectVO(@Param("ew") Wrapper<DiscussyachibaojianchanpinEntity> wrapper);
   	
   	List<DiscussyachibaojianchanpinView> selectListView(Wrapper<DiscussyachibaojianchanpinEntity> wrapper);
   	
   	DiscussyachibaojianchanpinView selectView(@Param("ew") Wrapper<DiscussyachibaojianchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyachibaojianchanpinEntity> wrapper);
   	
}

