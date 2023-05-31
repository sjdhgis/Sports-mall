package com.entity.view;

import com.entity.TiyushangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 体育商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-15 06:53:15
 */
@TableName("tiyushangpin")
public class TiyushangpinView  extends TiyushangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TiyushangpinView(){
	}
 
 	public TiyushangpinView(TiyushangpinEntity tiyushangpinEntity){
 	try {
			BeanUtils.copyProperties(this, tiyushangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
