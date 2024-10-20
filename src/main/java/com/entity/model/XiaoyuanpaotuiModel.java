package com.entity.model;

import com.entity.XiaoyuanpaotuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 校园跑腿
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-05-22 09:32:15
 */
public class XiaoyuanpaotuiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
