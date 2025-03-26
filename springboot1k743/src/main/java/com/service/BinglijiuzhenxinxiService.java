package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BinglijiuzhenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BinglijiuzhenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BinglijiuzhenxinxiView;


/**
 * 病例就诊信息
 *
 * @author 
 * @email 
 * @date 2021-01-13 16:52:48
 */
public interface BinglijiuzhenxinxiService extends IService<BinglijiuzhenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BinglijiuzhenxinxiVO> selectListVO(Wrapper<BinglijiuzhenxinxiEntity> wrapper);
   	
   	BinglijiuzhenxinxiVO selectVO(@Param("ew") Wrapper<BinglijiuzhenxinxiEntity> wrapper);
   	
   	List<BinglijiuzhenxinxiView> selectListView(Wrapper<BinglijiuzhenxinxiEntity> wrapper);
   	
   	BinglijiuzhenxinxiView selectView(@Param("ew") Wrapper<BinglijiuzhenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BinglijiuzhenxinxiEntity> wrapper);
   	
}

