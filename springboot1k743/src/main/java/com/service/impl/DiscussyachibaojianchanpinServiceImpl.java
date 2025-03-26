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


import com.dao.DiscussyachibaojianchanpinDao;
import com.entity.DiscussyachibaojianchanpinEntity;
import com.service.DiscussyachibaojianchanpinService;
import com.entity.vo.DiscussyachibaojianchanpinVO;
import com.entity.view.DiscussyachibaojianchanpinView;

@Service("discussyachibaojianchanpinService")
public class DiscussyachibaojianchanpinServiceImpl extends ServiceImpl<DiscussyachibaojianchanpinDao, DiscussyachibaojianchanpinEntity> implements DiscussyachibaojianchanpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyachibaojianchanpinEntity> page = this.selectPage(
                new Query<DiscussyachibaojianchanpinEntity>(params).getPage(),
                new EntityWrapper<DiscussyachibaojianchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyachibaojianchanpinEntity> wrapper) {
		  Page<DiscussyachibaojianchanpinView> page =new Query<DiscussyachibaojianchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyachibaojianchanpinVO> selectListVO(Wrapper<DiscussyachibaojianchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyachibaojianchanpinVO selectVO(Wrapper<DiscussyachibaojianchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyachibaojianchanpinView> selectListView(Wrapper<DiscussyachibaojianchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyachibaojianchanpinView selectView(Wrapper<DiscussyachibaojianchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
