package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ErshoushangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ErshoushangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ErshoushangpinView;


/**
 * 二手商品
 *
 * @author 
 * @email 
 * @date 2023-05-22 09:32:15
 */
public interface ErshoushangpinService extends IService<ErshoushangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ErshoushangpinVO> selectListVO(Wrapper<ErshoushangpinEntity> wrapper);
   	
   	ErshoushangpinVO selectVO(@Param("ew") Wrapper<ErshoushangpinEntity> wrapper);
   	
   	List<ErshoushangpinView> selectListView(Wrapper<ErshoushangpinEntity> wrapper);
   	
   	ErshoushangpinView selectView(@Param("ew") Wrapper<ErshoushangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ErshoushangpinEntity> wrapper);
   	

}

