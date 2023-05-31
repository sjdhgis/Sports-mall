package com.dao;

import com.entity.TiyushangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TiyushangpinVO;
import com.entity.view.TiyushangpinView;


/**
 * 体育商品
 * 
 * @author 
 * @email 
 * @date 2023-04-15 06:53:15
 */
public interface TiyushangpinDao extends BaseMapper<TiyushangpinEntity> {
	
	List<TiyushangpinVO> selectListVO(@Param("ew") Wrapper<TiyushangpinEntity> wrapper);
	
	TiyushangpinVO selectVO(@Param("ew") Wrapper<TiyushangpinEntity> wrapper);
	
	List<TiyushangpinView> selectListView(@Param("ew") Wrapper<TiyushangpinEntity> wrapper);

	List<TiyushangpinView> selectListView(Pagination page,@Param("ew") Wrapper<TiyushangpinEntity> wrapper);
	
	TiyushangpinView selectView(@Param("ew") Wrapper<TiyushangpinEntity> wrapper);
	

}
