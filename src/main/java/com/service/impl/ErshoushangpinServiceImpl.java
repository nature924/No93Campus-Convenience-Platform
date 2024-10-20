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


import com.dao.ErshoushangpinDao;
import com.entity.ErshoushangpinEntity;
import com.service.ErshoushangpinService;
import com.entity.vo.ErshoushangpinVO;
import com.entity.view.ErshoushangpinView;

@Service("ershoushangpinService")
public class ErshoushangpinServiceImpl extends ServiceImpl<ErshoushangpinDao, ErshoushangpinEntity> implements ErshoushangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ErshoushangpinEntity> page = this.selectPage(
                new Query<ErshoushangpinEntity>(params).getPage(),
                new EntityWrapper<ErshoushangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ErshoushangpinEntity> wrapper) {
		  Page<ErshoushangpinView> page =new Query<ErshoushangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ErshoushangpinVO> selectListVO(Wrapper<ErshoushangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ErshoushangpinVO selectVO(Wrapper<ErshoushangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ErshoushangpinView> selectListView(Wrapper<ErshoushangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ErshoushangpinView selectView(Wrapper<ErshoushangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
