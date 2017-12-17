package com.taotao.controller;

import com.taotao.pojo.UserInfo;
import com.taotao.services.UserInfoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by weylan on 2017/12/17.
 */
@Controller
public class UserInfoController {
    @Autowired
    private UserInfoServices userInfoServices;

    @RequestMapping("/user/getUserInfoById/{id}")
    @ResponseBody
    public UserInfo getUserInfoById(@PathVariable Integer id){
        UserInfo userInfo = userInfoServices.selectByPrimaryKey(id);
        return userInfo;
    }
    @RequestMapping("/user/getAllUserInfo1")
    @ResponseBody
    public List<UserInfo> getAllUserInfo(){
        return userInfoServices.getAllUserInfo();
    }
    @RequestMapping("/user/add")
    @ResponseBody
    public int addUser(){
        return userInfoServices.add();
    }
}
