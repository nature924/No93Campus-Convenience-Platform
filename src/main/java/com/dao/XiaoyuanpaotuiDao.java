package com.dao;

import com.entity.XiaoyuanpaotuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyuanpaotuiVO;
import com.entity.view.XiaoyuanpaotuiView;


/**
 * 校园跑腿
 * 
 * @author 
 * @email 
 * @date 2023-05-22 09:32:15
 */
public interface XiaoyuanpaotuiDao extends BaseMapper<XiaoyuanpaotuiEntity> {
	
	List<XiaoyuanpaotuiVO> selectListVO(@Param("ew") Wrapper<XiaoyuanpaotuiEntity> wrapper);
	
	XiaoyuanpaotuiVO selectVO(@Param("ew") Wrapper<XiaoyuanpaotuiEntity> wrapper);
	
	List<XiaoyuanpaotuiView> selectListView(@Param("ew") Wrapper<XiaoyuanpaotuiEntity> wrapper);

	List<XiaoyuanpaotuiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyuanpaotuiEntity> wrapper);
	
	XiaoyuanpaotuiView selectView(@Param("ew") Wrapper<XiaoyuanpaotuiEntity> wrapper);
	

}
