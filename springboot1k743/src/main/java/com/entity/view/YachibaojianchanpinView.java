package com.entity.view;

import com.entity.YachibaojianchanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 牙齿保健产品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-13 16:52:48
 */
@TableName("yachibaojianchanpin")
public class YachibaojianchanpinView  extends YachibaojianchanpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YachibaojianchanpinView(){
	}
 
 	public YachibaojianchanpinView(YachibaojianchanpinEntity yachibaojianchanpinEntity){
 	try {
			BeanUtils.copyProperties(this, yachibaojianchanpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
