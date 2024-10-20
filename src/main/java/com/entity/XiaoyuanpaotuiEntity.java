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
 * 校园跑腿
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-22 09:32:15
 */
@TableName("xiaoyuanpaotui")
public class XiaoyuanpaotuiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoyuanpaotuiEntity() {
		
	}
	
	public XiaoyuanpaotuiEntity(T t) {
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
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 取货地点
	 */
					
	private String quhuodidian;
	
	/**
	 * 收件地点
	 */
					
	private String shoujiandidian;
	
	/**
	 * 跑腿费用
	 */
					
	private Integer paotuifeiyong;
	
	/**
	 * 订单状况
	 */
					
	private String dingdanzhuangkuang;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 跑腿任务
	 */
					
	private String paotuirenwu;
	
	/**
	 * 费用说明
	 */
					
	private String feiyongshuoming;
	
	
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
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
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
	 * 设置：取货地点
	 */
	public void setQuhuodidian(String quhuodidian) {
		this.quhuodidian = quhuodidian;
	}
	/**
	 * 获取：取货地点
	 */
	public String getQuhuodidian() {
		return quhuodidian;
	}
	/**
	 * 设置：收件地点
	 */
	public void setShoujiandidian(String shoujiandidian) {
		this.shoujiandidian = shoujiandidian;
	}
	/**
	 * 获取：收件地点
	 */
	public String getShoujiandidian() {
		return shoujiandidian;
	}
	/**
	 * 设置：跑腿费用
	 */
	public void setPaotuifeiyong(Integer paotuifeiyong) {
		this.paotuifeiyong = paotuifeiyong;
	}
	/**
	 * 获取：跑腿费用
	 */
	public Integer getPaotuifeiyong() {
		return paotuifeiyong;
	}
	/**
	 * 设置：订单状况
	 */
	public void setDingdanzhuangkuang(String dingdanzhuangkuang) {
		this.dingdanzhuangkuang = dingdanzhuangkuang;
	}
	/**
	 * 获取：订单状况
	 */
	public String getDingdanzhuangkuang() {
		return dingdanzhuangkuang;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
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
	 * 设置：跑腿任务
	 */
	public void setPaotuirenwu(String paotuirenwu) {
		this.paotuirenwu = paotuirenwu;
	}
	/**
	 * 获取：跑腿任务
	 */
	public String getPaotuirenwu() {
		return paotuirenwu;
	}
	/**
	 * 设置：费用说明
	 */
	public void setFeiyongshuoming(String feiyongshuoming) {
		this.feiyongshuoming = feiyongshuoming;
	}
	/**
	 * 获取：费用说明
	 */
	public String getFeiyongshuoming() {
		return feiyongshuoming;
	}

}
