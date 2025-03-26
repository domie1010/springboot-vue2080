package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FuchatixingDao;
import com.entity.FuchatixingEntity;
import com.service.FuchatixingService;
import com.entity.vo.FuchatixingVO;
import com.entity.view.FuchatixingView;

@Service("fuchatixingService")
public class FuchatixingServiceImpl extends ServiceImpl<FuchatixingDao, FuchatixingEntity> implements FuchatixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuchatixingEntity> page = this.selectPage(
                new Query<FuchatixingEntity>(params).getPage(),
                new EntityWrapper<FuchatixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuchatixingEntity> wrapper) {
		  Page<FuchatixingView> page =new Query<FuchatixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuchatixingVO> selectListVO(Wrapper<FuchatixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuchatixingVO selectVO(Wrapper<FuchatixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuchatixingView> selectListView(Wrapper<FuchatixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuchatixingView selectView(Wrapper<FuchatixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
