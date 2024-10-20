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

import com.entity.PaotuilingdanEntity;
import com.entity.view.PaotuilingdanView;

import com.service.PaotuilingdanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 跑腿领单
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-22 09:32:15
 */
@RestController
@RequestMapping("/paotuilingdan")
public class PaotuilingdanController {
    @Autowired
    private PaotuilingdanService paotuilingdanService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PaotuilingdanEntity paotuilingdan,
		HttpServletRequest request){
        EntityWrapper<PaotuilingdanEntity> ew = new EntityWrapper<PaotuilingdanEntity>();

        String tableName = request.getSession().getAttribute("tableName").toString();
        ew.andNew();
        if(tableName.equals("yonghu")) {
            ew.eq("zhanghao", (String)request.getSession().getAttribute("username"));
        }
        if(tableName.equals("yonghu")) {
            ew.or();
            ew.eq("lingquzhanghao", (String)request.getSession().getAttribute("username"));
        }
		PageUtils page = paotuilingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, paotuilingdan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PaotuilingdanEntity paotuilingdan, 
		HttpServletRequest request){
        EntityWrapper<PaotuilingdanEntity> ew = new EntityWrapper<PaotuilingdanEntity>();

		PageUtils page = paotuilingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, paotuilingdan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PaotuilingdanEntity paotuilingdan){
       	EntityWrapper<PaotuilingdanEntity> ew = new EntityWrapper<PaotuilingdanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( paotuilingdan, "paotuilingdan")); 
        return R.ok().put("data", paotuilingdanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PaotuilingdanEntity paotuilingdan){
        EntityWrapper< PaotuilingdanEntity> ew = new EntityWrapper< PaotuilingdanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( paotuilingdan, "paotuilingdan")); 
		PaotuilingdanView paotuilingdanView =  paotuilingdanService.selectView(ew);
		return R.ok("查询跑腿领单成功").put("data", paotuilingdanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PaotuilingdanEntity paotuilingdan = paotuilingdanService.selectById(id);
        return R.ok().put("data", paotuilingdan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PaotuilingdanEntity paotuilingdan = paotuilingdanService.selectById(id);
        return R.ok().put("data", paotuilingdan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PaotuilingdanEntity paotuilingdan, HttpServletRequest request){
    	paotuilingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(paotuilingdan);
        paotuilingdanService.insert(paotuilingdan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PaotuilingdanEntity paotuilingdan, HttpServletRequest request){
    	paotuilingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(paotuilingdan);
        paotuilingdanService.insert(paotuilingdan);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody PaotuilingdanEntity paotuilingdan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(paotuilingdan);
        paotuilingdanService.updateById(paotuilingdan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        paotuilingdanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
