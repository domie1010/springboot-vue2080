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
 * 复查提醒
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-13 16:52:48
 */
@TableName("fuchatixing")
public class FuchatixingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FuchatixingEntity() {
		
	}
	
	public FuchatixingEntity(T t) {
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
	 * 提醒内容
	 */
					
	private String tixingneirong;
	
	/**
	 * 注意事项
	 */
					
	private String zhuyishixiang;
	
	/**
	 * 复查就诊时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fuchajiuzhenshijian;
	
	
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
	 * 设置：提醒内容
	 */
	public void setTixingneirong(String tixingneirong) {
		this.tixingneirong = tixingneirong;
	}
	/**
	 * 获取：提醒内容
	 */
	public String getTixingneirong() {
		return tixingneirong;
	}
	/**
	 * 设置：注意事项
	 */
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
	/**
	 * 设置：复查就诊时间
	 */
	public void setFuchajiuzhenshijian(Date fuchajiuzhenshijian) {
		this.fuchajiuzhenshijian = fuchajiuzhenshijian;
	}
	/**
	 * 获取：复查就诊时间
	 */
	public Date getFuchajiuzhenshijian() {
		return fuchajiuzhenshijian;
	}

}
