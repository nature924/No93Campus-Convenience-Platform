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


import com.dao.PaotuilingdanDao;
import com.entity.PaotuilingdanEntity;
import com.service.PaotuilingdanService;
import com.entity.vo.PaotuilingdanVO;
import com.entity.view.PaotuilingdanView;

@Service("paotuilingdanService")
public class PaotuilingdanServiceImpl extends ServiceImpl<PaotuilingdanDao, PaotuilingdanEntity> implements PaotuilingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PaotuilingdanEntity> page = this.selectPage(
                new Query<PaotuilingdanEntity>(params).getPage(),
                new EntityWrapper<PaotuilingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PaotuilingdanEntity> wrapper) {
		  Page<PaotuilingdanView> page =new Query<PaotuilingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PaotuilingdanVO> selectListVO(Wrapper<PaotuilingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PaotuilingdanVO selectVO(Wrapper<PaotuilingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PaotuilingdanView> selectListView(Wrapper<PaotuilingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PaotuilingdanView selectView(Wrapper<PaotuilingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
