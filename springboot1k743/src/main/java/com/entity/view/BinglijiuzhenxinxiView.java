package com.entity.view;

import com.entity.BinglijiuzhenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 病例就诊信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-13 16:52:48
 */
@TableName("binglijiuzhenxinxi")
public class BinglijiuzhenxinxiView  extends BinglijiuzhenxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BinglijiuzhenxinxiView(){
	}
 
 	public BinglijiuzhenxinxiView(BinglijiuzhenxinxiEntity binglijiuzhenxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, binglijiuzhenxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
