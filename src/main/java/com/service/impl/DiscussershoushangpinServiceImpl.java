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


import com.dao.DiscussershoushangpinDao;
import com.entity.DiscussershoushangpinEntity;
import com.service.DiscussershoushangpinService;
import com.entity.vo.DiscussershoushangpinVO;
import com.entity.view.DiscussershoushangpinView;

@Service("discussershoushangpinService")
public class DiscussershoushangpinServiceImpl extends ServiceImpl<DiscussershoushangpinDao, DiscussershoushangpinEntity> implements DiscussershoushangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussershoushangpinEntity> page = this.selectPage(
                new Query<DiscussershoushangpinEntity>(params).getPage(),
                new EntityWrapper<DiscussershoushangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussershoushangpinEntity> wrapper) {
		  Page<DiscussershoushangpinView> page =new Query<DiscussershoushangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussershoushangpinVO> selectListVO(Wrapper<DiscussershoushangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussershoushangpinVO selectVO(Wrapper<DiscussershoushangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussershoushangpinView> selectListView(Wrapper<DiscussershoushangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussershoushangpinView selectView(Wrapper<DiscussershoushangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
