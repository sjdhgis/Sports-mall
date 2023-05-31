package com.dao;

import com.entity.DiscusstiyushangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstiyushangpinVO;
import com.entity.view.DiscusstiyushangpinView;


/**
 * 体育商品评论表
 * 
 * @author 
 * @email 
 * @date 2023-04-15 06:53:15
 */
public interface DiscusstiyushangpinDao extends BaseMapper<DiscusstiyushangpinEntity> {
	
	List<DiscusstiyushangpinVO> selectListVO(@Param("ew") Wrapper<DiscusstiyushangpinEntity> wrapper);
	
	DiscusstiyushangpinVO selectVO(@Param("ew") Wrapper<DiscusstiyushangpinEntity> wrapper);
	
	List<DiscusstiyushangpinView> selectListView(@Param("ew") Wrapper<DiscusstiyushangpinEntity> wrapper);

	List<DiscusstiyushangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstiyushangpinEntity> wrapper);
	
	DiscusstiyushangpinView selectView(@Param("ew") Wrapper<DiscusstiyushangpinEntity> wrapper);
	

}
