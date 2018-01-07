package com.taotao.controller;

import com.taotao.pojo.TbUser;
import com.taotao.services.UserService;
import com.taotao.utils.TaotaoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/tbuser")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/login")
    public TaotaoResult userLogin(String username, String password,
                                  HttpServletRequest request, HttpServletResponse response){


        return null;
    }

//    @RequestMapping("/getById/{id}")
//    public TbUser getUserById(@PathVariable Integer id ){
//        TbUser userById = userService.getUserById(id);
//        return userById;
//    }
}
