package com.dao;

import com.entity.PaotuilingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PaotuilingdanVO;
import com.entity.view.PaotuilingdanView;


/**
 * 跑腿领单
 * 
 * @author 
 * @email 
 * @date 2023-05-22 09:32:15
 */
public interface PaotuilingdanDao extends BaseMapper<PaotuilingdanEntity> {
	
	List<PaotuilingdanVO> selectListVO(@Param("ew") Wrapper<PaotuilingdanEntity> wrapper);
	
	PaotuilingdanVO selectVO(@Param("ew") Wrapper<PaotuilingdanEntity> wrapper);
	
	List<PaotuilingdanView> selectListView(@Param("ew") Wrapper<PaotuilingdanEntity> wrapper);

	List<PaotuilingdanView> selectListView(Pagination page,@Param("ew") Wrapper<PaotuilingdanEntity> wrapper);
	
	PaotuilingdanView selectView(@Param("ew") Wrapper<PaotuilingdanEntity> wrapper);
	

}
