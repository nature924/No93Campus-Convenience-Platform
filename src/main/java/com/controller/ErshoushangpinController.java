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

import com.entity.ErshoushangpinEntity;
import com.entity.view.ErshoushangpinView;

import com.service.ErshoushangpinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 二手商品
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-22 09:32:15
 */
@RestController
@RequestMapping("/ershoushangpin")
public class ErshoushangpinController {
    @Autowired
    private ErshoushangpinService ershoushangpinService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ErshoushangpinEntity ershoushangpin,
                @RequestParam(required = false) Double pricestart,
                @RequestParam(required = false) Double priceend,
		HttpServletRequest request){
        EntityWrapper<ErshoushangpinEntity> ew = new EntityWrapper<ErshoushangpinEntity>();
                if(pricestart!=null) ew.ge("price", pricestart);
                if(priceend!=null) ew.le("price", priceend);

		PageUtils page = ershoushangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ershoushangpin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ErshoushangpinEntity ershoushangpin, 
                @RequestParam(required = false) Double pricestart,
                @RequestParam(required = false) Double priceend,
		HttpServletRequest request){
        EntityWrapper<ErshoushangpinEntity> ew = new EntityWrapper<ErshoushangpinEntity>();
                if(pricestart!=null) ew.ge("price", pricestart);
                if(priceend!=null) ew.le("price", priceend);

		PageUtils page = ershoushangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ershoushangpin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ErshoushangpinEntity ershoushangpin){
       	EntityWrapper<ErshoushangpinEntity> ew = new EntityWrapper<ErshoushangpinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ershoushangpin, "ershoushangpin")); 
        return R.ok().put("data", ershoushangpinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ErshoushangpinEntity ershoushangpin){
        EntityWrapper< ErshoushangpinEntity> ew = new EntityWrapper< ErshoushangpinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ershoushangpin, "ershoushangpin")); 
		ErshoushangpinView ershoushangpinView =  ershoushangpinService.selectView(ew);
		return R.ok("查询二手商品成功").put("data", ershoushangpinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ErshoushangpinEntity ershoushangpin = ershoushangpinService.selectById(id);
		ershoushangpin.setClicknum(ershoushangpin.getClicknum()+1);
		ershoushangpin.setClicktime(new Date());
		ershoushangpinService.updateById(ershoushangpin);
        return R.ok().put("data", ershoushangpin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ErshoushangpinEntity ershoushangpin = ershoushangpinService.selectById(id);
		ershoushangpin.setClicknum(ershoushangpin.getClicknum()+1);
		ershoushangpin.setClicktime(new Date());
		ershoushangpinService.updateById(ershoushangpin);
        return R.ok().put("data", ershoushangpin);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        ErshoushangpinEntity ershoushangpin = ershoushangpinService.selectById(id);
        if(type.equals("1")) {
        	ershoushangpin.setThumbsupnum(ershoushangpin.getThumbsupnum()+1);
        } else {
        	ershoushangpin.setCrazilynum(ershoushangpin.getCrazilynum()+1);
        }
        ershoushangpinService.updateById(ershoushangpin);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ErshoushangpinEntity ershoushangpin, HttpServletRequest request){
    	ershoushangpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ershoushangpin);
        ershoushangpinService.insert(ershoushangpin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ErshoushangpinEntity ershoushangpin, HttpServletRequest request){
    	ershoushangpin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ershoushangpin);
        ershoushangpinService.insert(ershoushangpin);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ErshoushangpinEntity ershoushangpin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ershoushangpin);
        ershoushangpinService.updateById(ershoushangpin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ershoushangpinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ErshoushangpinEntity ershoushangpin, HttpServletRequest request,String pre){
        EntityWrapper<ErshoushangpinEntity> ew = new EntityWrapper<ErshoushangpinEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = ershoushangpinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ershoushangpin), params), params));
        return R.ok().put("data", page);
    }









}
