package com.taotao.controller;

import com.taotao.pojo.TbUser;
import com.taotao.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tbuser")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getById/{id}")
    public TbUser getUserById(@PathVariable Integer id ){
        TbUser userById = userService.getUserById(id);
        return userById;
    }
}
