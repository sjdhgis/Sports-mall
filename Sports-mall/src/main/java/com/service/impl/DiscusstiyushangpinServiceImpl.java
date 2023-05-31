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


import com.dao.DiscusstiyushangpinDao;
import com.entity.DiscusstiyushangpinEntity;
import com.service.DiscusstiyushangpinService;
import com.entity.vo.DiscusstiyushangpinVO;
import com.entity.view.DiscusstiyushangpinView;

@Service("discusstiyushangpinService")
public class DiscusstiyushangpinServiceImpl extends ServiceImpl<DiscusstiyushangpinDao, DiscusstiyushangpinEntity> implements DiscusstiyushangpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstiyushangpinEntity> page = this.selectPage(
                new Query<DiscusstiyushangpinEntity>(params).getPage(),
                new EntityWrapper<DiscusstiyushangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstiyushangpinEntity> wrapper) {
		  Page<DiscusstiyushangpinView> page =new Query<DiscusstiyushangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstiyushangpinVO> selectListVO(Wrapper<DiscusstiyushangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstiyushangpinVO selectVO(Wrapper<DiscusstiyushangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstiyushangpinView> selectListView(Wrapper<DiscusstiyushangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstiyushangpinView selectView(Wrapper<DiscusstiyushangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
