package com.nebula.mooc.webserver.service.impl;

import com.nebula.mooc.webserver.service.PostService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 15722 on 2019/4/18.
 */
@Service("PostService")
public class PostServiceImpl implements PostService {

    @Override
    public boolean showPost(HttpServletRequest request) {

        return false;
    }

    @Override
    public boolean showPostList(HttpServletRequest request) {

        return false;
    }


    @Override
    public boolean newPost(HttpServletRequest request)//发贴
    {

        return false;
    }

    @Override
    public boolean delPost(HttpServletRequest request) //删除贴子
    {
        return false;
    }

    @Override
    public boolean postReply(HttpServletRequest request)//回复
    {

        return false;
    }

    @Override
    public boolean delReply(HttpServletRequest request)//删除回复
    {
        return false;
    }

    @Override
    public boolean postLike(HttpServletRequest request)//收藏贴子
    {
        return false;
    }

    @Override
    public boolean delLike(HttpServletRequest request) {
        return false;
    }

    @Override
    public boolean replyStar(HttpServletRequest request)//点赞回复
    {
        return false;
    }

    @Override
    public boolean delReplyStar(HttpServletRequest request)//取消点赞回复
    {
        return false;
    }


}
