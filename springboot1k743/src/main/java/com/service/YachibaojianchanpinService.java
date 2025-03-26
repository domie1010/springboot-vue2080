package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YachibaojianchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YachibaojianchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YachibaojianchanpinView;


/**
 * 牙齿保健产品
 *
 * @author 
 * @email 
 * @date 2021-01-13 16:52:48
 */
public interface YachibaojianchanpinService extends IService<YachibaojianchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YachibaojianchanpinVO> selectListVO(Wrapper<YachibaojianchanpinEntity> wrapper);
   	
   	YachibaojianchanpinVO selectVO(@Param("ew") Wrapper<YachibaojianchanpinEntity> wrapper);
   	
   	List<YachibaojianchanpinView> selectListView(Wrapper<YachibaojianchanpinEntity> wrapper);
   	
   	YachibaojianchanpinView selectView(@Param("ew") Wrapper<YachibaojianchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YachibaojianchanpinEntity> wrapper);
   	
}

