package com.entity.view;

import com.entity.FuchatixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 复查提醒
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-13 16:52:48
 */
@TableName("fuchatixing")
public class FuchatixingView  extends FuchatixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuchatixingView(){
	}
 
 	public FuchatixingView(FuchatixingEntity fuchatixingEntity){
 	try {
			BeanUtils.copyProperties(this, fuchatixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
