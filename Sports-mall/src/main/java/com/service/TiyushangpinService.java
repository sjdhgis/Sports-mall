package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TiyushangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TiyushangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TiyushangpinView;


/**
 * 体育商品
 *
 * @author 
 * @email 
 * @date 2023-04-15 06:53:15
 */
public interface TiyushangpinService extends IService<TiyushangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TiyushangpinVO> selectListVO(Wrapper<TiyushangpinEntity> wrapper);
   	
   	TiyushangpinVO selectVO(@Param("ew") Wrapper<TiyushangpinEntity> wrapper);
   	
   	List<TiyushangpinView> selectListView(Wrapper<TiyushangpinEntity> wrapper);
   	
   	TiyushangpinView selectView(@Param("ew") Wrapper<TiyushangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TiyushangpinEntity> wrapper);
   	

}

