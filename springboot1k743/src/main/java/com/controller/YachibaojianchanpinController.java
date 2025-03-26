package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YachibaojianchanpinEntity;
import com.entity.view.YachibaojianchanpinView;

import com.service.YachibaojianchanpinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 牙齿保健产品
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-13 16:52:48
 */
@RestController
@RequestMapping("/yachibaojianchanpin")
public class YachibaojianchanpinController {
    @Autowired
    private YachibaojianchanpinService yachibaojianchanpinService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YachibaojianchanpinEntity yachibaojianchanpin, HttpServletRequest request){
        EntityWrapper<YachibaojianchanpinEntity> ew = new EntityWrapper<YachibaojianchanpinEntity>();
		PageUtils page = yachibaojianchanpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yachibaojianchanpin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YachibaojianchanpinEntity yachibaojianchanpin, HttpServletRequest request){
        EntityWrapper<YachibaojianchanpinEntity> ew = new EntityWrapper<YachibaojianchanpinEntity>();
		PageUtils page = yachibaojianchanpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yachibaojianchanpin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YachibaojianchanpinEntity yachibaojianchanpin){
       	EntityWrapper<YachibaojianchanpinEntity> ew = new EntityWrapper<YachibaojianchanpinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yachibaojianchanpin, "yachibaojianchanpin")); 
        return R.ok().put("data", yachibaojianchanpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YachibaojianchanpinEntity yachibaojianchanpin){
        EntityWrapper< YachibaojianchanpinEntity> ew = new EntityWrapper< YachibaojianchanpinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yachibaojianchanpin, "yachibaojianchanpin")); 
		YachibaojianchanpinView yachibaojianchanpinView =  yachibaojianchanpinService.selectView(ew);
		return R.ok("查询牙齿保健产品成功").put("data", yachibaojianchanpinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YachibaojianchanpinEntity yachibaojianchanpin = yachibaojianchanpinService.selectById(id);
        return R.ok().put("data", yachibaojianchanpin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YachibaojianchanpinEntity yachibaojianchanpin = yachibaojianchanpinService.selectById(id);
        return R.ok().put("data", yachibaojianchanpin);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        YachibaojianchanpinEntity yachibaojianchanpin = yachibaojianchanpinService.selectById(id);
        if(type.equals("1")) {
        	yachibaojianchanpin.setThumbsupnum(yachibaojianchanpin.getThumbsupnum()+1);
        } else {
        	yachibaojianchanpin.setCrazilynum(yachibaojianchanpin.getCrazilynum()+1);
        }
        yachibaojianchanpinService.updateById(yachibaojianchanpin);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YachibaojianchanpinEntity yachibaojianchanpin, HttpServletRequest request){
    	yachibaojianchanpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yachibaojianchanpin);
        yachibaojianchanpinService.insert(yachibaojianchanpin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YachibaojianchanpinEntity yachibaojianchanpin, HttpServletRequest request){
    	yachibaojianchanpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yachibaojianchanpin);
        yachibaojianchanpinService.insert(yachibaojianchanpin);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YachibaojianchanpinEntity yachibaojianchanpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yachibaojianchanpin);
        yachibaojianchanpinService.updateById(yachibaojianchanpin);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yachibaojianchanpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YachibaojianchanpinEntity> wrapper = new EntityWrapper<YachibaojianchanpinEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yachibaojianchanpinService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
