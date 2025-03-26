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


import com.dao.BinglijiuzhenxinxiDao;
import com.entity.BinglijiuzhenxinxiEntity;
import com.service.BinglijiuzhenxinxiService;
import com.entity.vo.BinglijiuzhenxinxiVO;
import com.entity.view.BinglijiuzhenxinxiView;

@Service("binglijiuzhenxinxiService")
public class BinglijiuzhenxinxiServiceImpl extends ServiceImpl<BinglijiuzhenxinxiDao, BinglijiuzhenxinxiEntity> implements BinglijiuzhenxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BinglijiuzhenxinxiEntity> page = this.selectPage(
                new Query<BinglijiuzhenxinxiEntity>(params).getPage(),
                new EntityWrapper<BinglijiuzhenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BinglijiuzhenxinxiEntity> wrapper) {
		  Page<BinglijiuzhenxinxiView> page =new Query<BinglijiuzhenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BinglijiuzhenxinxiVO> selectListVO(Wrapper<BinglijiuzhenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BinglijiuzhenxinxiVO selectVO(Wrapper<BinglijiuzhenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BinglijiuzhenxinxiView> selectListView(Wrapper<BinglijiuzhenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BinglijiuzhenxinxiView selectView(Wrapper<BinglijiuzhenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
