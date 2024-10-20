package com.dao;

import com.entity.DiscussershoushangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussershoushangpinVO;
import com.entity.view.DiscussershoushangpinView;


/**
 * 二手商品评论表
 * 
 * @author 
 * @email 
 * @date 2023-05-22 09:32:16
 */
public interface DiscussershoushangpinDao extends BaseMapper<DiscussershoushangpinEntity> {
	
	List<DiscussershoushangpinVO> selectListVO(@Param("ew") Wrapper<DiscussershoushangpinEntity> wrapper);
	
	DiscussershoushangpinVO selectVO(@Param("ew") Wrapper<DiscussershoushangpinEntity> wrapper);
	
	List<DiscussershoushangpinView> selectListView(@Param("ew") Wrapper<DiscussershoushangpinEntity> wrapper);

	List<DiscussershoushangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussershoushangpinEntity> wrapper);
	
	DiscussershoushangpinView selectView(@Param("ew") Wrapper<DiscussershoushangpinEntity> wrapper);
	

}
