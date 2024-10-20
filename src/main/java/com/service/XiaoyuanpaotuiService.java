package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyuanpaotuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyuanpaotuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyuanpaotuiView;


/**
 * 校园跑腿
 *
 * @author 
 * @email 
 * @date 2023-05-22 09:32:15
 */
public interface XiaoyuanpaotuiService extends IService<XiaoyuanpaotuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyuanpaotuiVO> selectListVO(Wrapper<XiaoyuanpaotuiEntity> wrapper);
   	
   	XiaoyuanpaotuiVO selectVO(@Param("ew") Wrapper<XiaoyuanpaotuiEntity> wrapper);
   	
   	List<XiaoyuanpaotuiView> selectListView(Wrapper<XiaoyuanpaotuiEntity> wrapper);
   	
   	XiaoyuanpaotuiView selectView(@Param("ew") Wrapper<XiaoyuanpaotuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyuanpaotuiEntity> wrapper);
   	

}

