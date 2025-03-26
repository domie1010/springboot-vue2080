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


import com.dao.YachibaojianchanpinDao;
import com.entity.YachibaojianchanpinEntity;
import com.service.YachibaojianchanpinService;
import com.entity.vo.YachibaojianchanpinVO;
import com.entity.view.YachibaojianchanpinView;

@Service("yachibaojianchanpinService")
public class YachibaojianchanpinServiceImpl extends ServiceImpl<YachibaojianchanpinDao, YachibaojianchanpinEntity> implements YachibaojianchanpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YachibaojianchanpinEntity> page = this.selectPage(
                new Query<YachibaojianchanpinEntity>(params).getPage(),
                new EntityWrapper<YachibaojianchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YachibaojianchanpinEntity> wrapper) {
		  Page<YachibaojianchanpinView> page =new Query<YachibaojianchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YachibaojianchanpinVO> selectListVO(Wrapper<YachibaojianchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YachibaojianchanpinVO selectVO(Wrapper<YachibaojianchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YachibaojianchanpinView> selectListView(Wrapper<YachibaojianchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YachibaojianchanpinView selectView(Wrapper<YachibaojianchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
