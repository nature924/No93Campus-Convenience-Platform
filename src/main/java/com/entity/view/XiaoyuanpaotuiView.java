package com.entity.view;

import com.entity.XiaoyuanpaotuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校园跑腿
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-22 09:32:15
 */
@TableName("xiaoyuanpaotui")
public class XiaoyuanpaotuiView  extends XiaoyuanpaotuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoyuanpaotuiView(){
	}
 
 	public XiaoyuanpaotuiView(XiaoyuanpaotuiEntity xiaoyuanpaotuiEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoyuanpaotuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
