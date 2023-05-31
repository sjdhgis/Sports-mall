package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TiyushangpinDao;
import com.entity.TiyushangpinEntity;
import com.service.TiyushangpinService;
import com.entity.vo.TiyushangpinVO;
import com.entity.view.TiyushangpinView;

@Service("tiyushangpinService")
public class TiyushangpinServiceImpl extends ServiceImpl<TiyushangpinDao, TiyushangpinEntity> implements TiyushangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TiyushangpinEntity> page = this.selectPage(
                new Query<TiyushangpinEntity>(params).getPage(),
                new EntityWrapper<TiyushangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TiyushangpinEntity> wrapper) {
		  Page<TiyushangpinView> page =new Query<TiyushangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TiyushangpinVO> selectListVO(Wrapper<TiyushangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TiyushangpinVO selectVO(Wrapper<TiyushangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TiyushangpinView> selectListView(Wrapper<TiyushangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TiyushangpinView selectView(Wrapper<TiyushangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
