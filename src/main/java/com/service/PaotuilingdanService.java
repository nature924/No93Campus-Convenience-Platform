package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PaotuilingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PaotuilingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PaotuilingdanView;


/**
 * 跑腿领单
 *
 * @author 
 * @email 
 * @date 2023-05-22 09:32:15
 */
public interface PaotuilingdanService extends IService<PaotuilingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PaotuilingdanVO> selectListVO(Wrapper<PaotuilingdanEntity> wrapper);
   	
   	PaotuilingdanVO selectVO(@Param("ew") Wrapper<PaotuilingdanEntity> wrapper);
   	
   	List<PaotuilingdanView> selectListView(Wrapper<PaotuilingdanEntity> wrapper);
   	
   	PaotuilingdanView selectView(@Param("ew") Wrapper<PaotuilingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PaotuilingdanEntity> wrapper);
   	

}

