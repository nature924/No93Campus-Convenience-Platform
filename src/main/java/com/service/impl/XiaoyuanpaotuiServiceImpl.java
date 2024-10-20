package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XiaoyuanpaotuiDao;
import com.entity.XiaoyuanpaotuiEntity;
import com.service.XiaoyuanpaotuiService;
import com.entity.vo.XiaoyuanpaotuiVO;
import com.entity.view.XiaoyuanpaotuiView;

@Service("xiaoyuanpaotuiService")
public class XiaoyuanpaotuiServiceImpl extends ServiceImpl<XiaoyuanpaotuiDao, XiaoyuanpaotuiEntity> implements XiaoyuanpaotuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyuanpaotuiEntity> page = this.selectPage(
                new Query<XiaoyuanpaotuiEntity>(params).getPage(),
                new EntityWrapper<XiaoyuanpaotuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyuanpaotuiEntity> wrapper) {
		  Page<XiaoyuanpaotuiView> page =new Query<XiaoyuanpaotuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyuanpaotuiVO> selectListVO(Wrapper<XiaoyuanpaotuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyuanpaotuiVO selectVO(Wrapper<XiaoyuanpaotuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyuanpaotuiView> selectListView(Wrapper<XiaoyuanpaotuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyuanpaotuiView selectView(Wrapper<XiaoyuanpaotuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
