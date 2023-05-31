package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstiyushangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstiyushangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstiyushangpinView;


/**
 * 体育商品评论表
 *
 * @author 
 * @email 
 * @date 2023-04-15 06:53:15
 */
public interface DiscusstiyushangpinService extends IService<DiscusstiyushangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstiyushangpinVO> selectListVO(Wrapper<DiscusstiyushangpinEntity> wrapper);
   	
   	DiscusstiyushangpinVO selectVO(@Param("ew") Wrapper<DiscusstiyushangpinEntity> wrapper);
   	
   	List<DiscusstiyushangpinView> selectListView(Wrapper<DiscusstiyushangpinEntity> wrapper);
   	
   	DiscusstiyushangpinView selectView(@Param("ew") Wrapper<DiscusstiyushangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstiyushangpinEntity> wrapper);
   	

}

