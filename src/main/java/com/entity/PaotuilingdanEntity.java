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
 * 跑腿领单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-22 09:32:15
 */
@TableName("paotuilingdan")
public class PaotuilingdanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PaotuilingdanEntity() {
		
	}
	
	public PaotuilingdanEntity(T t) {
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
	 * 费用
	 */
					
	private Integer paotuifeiyong;
	
	/**
	 * 订单状态
	 */
					
	private String dingdanzhuangtai;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 领取账号
	 */
					
	private String lingquzhanghao;
	
	/**
	 * 领取人
	 */
					
	private String lingquren;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 领取时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date lingqushijian;
	
	/**
	 * 预送达时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date yusongdashijian;
	
	
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
	 * 设置：费用
	 */
	public void setPaotuifeiyong(Integer paotuifeiyong) {
		this.paotuifeiyong = paotuifeiyong;
	}
	/**
	 * 获取：费用
	 */
	public Integer getPaotuifeiyong() {
		return paotuifeiyong;
	}
	/**
	 * 设置：订单状态
	 */
	public void setDingdanzhuangtai(String dingdanzhuangtai) {
		this.dingdanzhuangtai = dingdanzhuangtai;
	}
	/**
	 * 获取：订单状态
	 */
	public String getDingdanzhuangtai() {
		return dingdanzhuangtai;
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
	 * 设置：领取账号
	 */
	public void setLingquzhanghao(String lingquzhanghao) {
		this.lingquzhanghao = lingquzhanghao;
	}
	/**
	 * 获取：领取账号
	 */
	public String getLingquzhanghao() {
		return lingquzhanghao;
	}
	/**
	 * 设置：领取人
	 */
	public void setLingquren(String lingquren) {
		this.lingquren = lingquren;
	}
	/**
	 * 获取：领取人
	 */
	public String getLingquren() {
		return lingquren;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：领取时间
	 */
	public void setLingqushijian(Date lingqushijian) {
		this.lingqushijian = lingqushijian;
	}
	/**
	 * 获取：领取时间
	 */
	public Date getLingqushijian() {
		return lingqushijian;
	}
	/**
	 * 设置：预送达时间
	 */
	public void setYusongdashijian(Date yusongdashijian) {
		this.yusongdashijian = yusongdashijian;
	}
	/**
	 * 获取：预送达时间
	 */
	public Date getYusongdashijian() {
		return yusongdashijian;
	}

}
