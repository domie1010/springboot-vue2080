package com.entity.vo;

import com.entity.YaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 药品信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-13 16:52:48
 */
public class YaopinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 药品名称
	 */
	
	private String yaopinmingcheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 功能主治
	 */
	
	private String gongnengzhuzhi;
		
	/**
	 * 不良反应
	 */
	
	private String buliangfanying;
		
	/**
	 * 禁忌事项
	 */
	
	private String jinjishixiang;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：药品名称
	 */
	 
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：功能主治
	 */
	 
	public void setGongnengzhuzhi(String gongnengzhuzhi) {
		this.gongnengzhuzhi = gongnengzhuzhi;
	}
	
	/**
	 * 获取：功能主治
	 */
	public String getGongnengzhuzhi() {
		return gongnengzhuzhi;
	}
				
	
	/**
	 * 设置：不良反应
	 */
	 
	public void setBuliangfanying(String buliangfanying) {
		this.buliangfanying = buliangfanying;
	}
	
	/**
	 * 获取：不良反应
	 */
	public String getBuliangfanying() {
		return buliangfanying;
	}
				
	
	/**
	 * 设置：禁忌事项
	 */
	 
	public void setJinjishixiang(String jinjishixiang) {
		this.jinjishixiang = jinjishixiang;
	}
	
	/**
	 * 获取：禁忌事项
	 */
	public String getJinjishixiang() {
		return jinjishixiang;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
