package com.entity.vo;

import com.entity.WanchengdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 完成订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-22 09:32:15
 */
public class WanchengdingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 跑腿费用
	 */
	
	private Integer paotuifeiyong;
		
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
	 * 完成时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date wanchengshijian;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：完成时间
	 */
	 
	public void setWanchengshijian(Date wanchengshijian) {
		this.wanchengshijian = wanchengshijian;
	}
	
	/**
	 * 获取：完成时间
	 */
	public Date getWanchengshijian() {
		return wanchengshijian;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
