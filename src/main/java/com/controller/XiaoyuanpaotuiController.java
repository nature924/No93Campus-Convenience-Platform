package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XiaoyuanpaotuiEntity;
import com.entity.view.XiaoyuanpaotuiView;

import com.service.XiaoyuanpaotuiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 校园跑腿
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-22 09:32:15
 */
@RestController
@RequestMapping("/xiaoyuanpaotui")
public class XiaoyuanpaotuiController {
    @Autowired
    private XiaoyuanpaotuiService xiaoyuanpaotuiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XiaoyuanpaotuiEntity xiaoyuanpaotui,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			xiaoyuanpaotui.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XiaoyuanpaotuiEntity> ew = new EntityWrapper<XiaoyuanpaotuiEntity>();

		PageUtils page = xiaoyuanpaotuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaoyuanpaotui), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XiaoyuanpaotuiEntity xiaoyuanpaotui, 
		HttpServletRequest request){
        EntityWrapper<XiaoyuanpaotuiEntity> ew = new EntityWrapper<XiaoyuanpaotuiEntity>();

		PageUtils page = xiaoyuanpaotuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaoyuanpaotui), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XiaoyuanpaotuiEntity xiaoyuanpaotui){
       	EntityWrapper<XiaoyuanpaotuiEntity> ew = new EntityWrapper<XiaoyuanpaotuiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xiaoyuanpaotui, "xiaoyuanpaotui")); 
        return R.ok().put("data", xiaoyuanpaotuiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XiaoyuanpaotuiEntity xiaoyuanpaotui){
        EntityWrapper< XiaoyuanpaotuiEntity> ew = new EntityWrapper< XiaoyuanpaotuiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xiaoyuanpaotui, "xiaoyuanpaotui")); 
		XiaoyuanpaotuiView xiaoyuanpaotuiView =  xiaoyuanpaotuiService.selectView(ew);
		return R.ok("查询校园跑腿成功").put("data", xiaoyuanpaotuiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XiaoyuanpaotuiEntity xiaoyuanpaotui = xiaoyuanpaotuiService.selectById(id);
        return R.ok().put("data", xiaoyuanpaotui);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XiaoyuanpaotuiEntity xiaoyuanpaotui = xiaoyuanpaotuiService.selectById(id);
        return R.ok().put("data", xiaoyuanpaotui);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XiaoyuanpaotuiEntity xiaoyuanpaotui, HttpServletRequest request){
    	xiaoyuanpaotui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaoyuanpaotui);
        xiaoyuanpaotuiService.insert(xiaoyuanpaotui);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XiaoyuanpaotuiEntity xiaoyuanpaotui, HttpServletRequest request){
    	xiaoyuanpaotui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaoyuanpaotui);
        xiaoyuanpaotuiService.insert(xiaoyuanpaotui);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XiaoyuanpaotuiEntity xiaoyuanpaotui, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xiaoyuanpaotui);
        xiaoyuanpaotuiService.updateById(xiaoyuanpaotui);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xiaoyuanpaotuiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
