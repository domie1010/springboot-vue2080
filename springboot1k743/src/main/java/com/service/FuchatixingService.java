package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuchatixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuchatixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuchatixingView;


/**
 * 复查提醒
 *
 * @author 
 * @email 
 * @date 2021-01-13 16:52:48
 */
public interface FuchatixingService extends IService<FuchatixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuchatixingVO> selectListVO(Wrapper<FuchatixingEntity> wrapper);
   	
   	FuchatixingVO selectVO(@Param("ew") Wrapper<FuchatixingEntity> wrapper);
   	
   	List<FuchatixingView> selectListView(Wrapper<FuchatixingEntity> wrapper);
   	
   	FuchatixingView selectView(@Param("ew") Wrapper<FuchatixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuchatixingEntity> wrapper);
   	
}

