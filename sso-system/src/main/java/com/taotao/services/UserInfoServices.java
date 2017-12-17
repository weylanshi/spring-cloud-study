package com.taotao.services;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.taotao.mapper.UserInfoMapper;
import com.taotao.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by weylan on 2017/12/17.
 */
@Service
public class UserInfoServices {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo selectByPrimaryKey(Integer id){
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        return userInfo;
    }

    public List<UserInfo> getAllUserInfo() {
        PageHelper.startPage(1,2);
        Page<UserInfo> page = (Page<UserInfo>) userInfoMapper.selectAll2();
        System.out.println(page.getPages());
        return page.getResult();
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int add(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("小明");
        userInfo.setEmail("123@qq.com");
        return userInfoMapper.insert(userInfo);
    }
}
