package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.CommentReplayEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品评价回复关系
 *
 * @author feige
 * @email tqf@atguigu.com
 * @date 2019-12-02 19:26:44
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageVo queryPage(QueryCondition params);
}

