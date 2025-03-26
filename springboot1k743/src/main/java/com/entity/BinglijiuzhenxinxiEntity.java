package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 病例就诊信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-13 16:52:48
 */
@TableName("binglijiuzhenxinxi")
public class BinglijiuzhenxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BinglijiuzhenxinxiEntity() {
		
	}
	
	public BinglijiuzhenxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 会员号
	 */
					
	private String huiyuanhao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 年龄
	 */
					
	private String nianling;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	/**
	 * 药品用量
	 */
					
	private String yaopinyongliang;
	
	/**
	 * 就诊信息
	 */
					
	private String jiuzhenxinxi;
	
	/**
	 * 就诊时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jiuzhenshijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：会员号
	 */
	public void setHuiyuanhao(String huiyuanhao) {
		this.huiyuanhao = huiyuanhao;
	}
	/**
	 * 获取：会员号
	 */
	public String getHuiyuanhao() {
		return huiyuanhao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
	/**
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
	/**
	 * 设置：药品用量
	 */
	public void setYaopinyongliang(String yaopinyongliang) {
		this.yaopinyongliang = yaopinyongliang;
	}
	/**
	 * 获取：药品用量
	 */
	public String getYaopinyongliang() {
		return yaopinyongliang;
	}
	/**
	 * 设置：就诊信息
	 */
	public void setJiuzhenxinxi(String jiuzhenxinxi) {
		this.jiuzhenxinxi = jiuzhenxinxi;
	}
	/**
	 * 获取：就诊信息
	 */
	public String getJiuzhenxinxi() {
		return jiuzhenxinxi;
	}
	/**
	 * 设置：就诊时间
	 */
	public void setJiuzhenshijian(Date jiuzhenshijian) {
		this.jiuzhenshijian = jiuzhenshijian;
	}
	/**
	 * 获取：就诊时间
	 */
	public Date getJiuzhenshijian() {
		return jiuzhenshijian;
	}

}
