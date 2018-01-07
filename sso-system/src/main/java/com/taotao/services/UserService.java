package com.taotao.services;

import com.taotao.mapper.TbUserMapper;
import com.taotao.pojo.TbUser;
import com.taotao.utils.TaotaoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserService {

    public TaotaoResult userLogin(String username, String password,
                                  HttpServletRequest request, HttpServletResponse response);


//    public TbUser getUserById(Integer id){
//        TbUser tbUser = tbUserMapper.selectByPrimaryKey(id);
//        return tbUser;
//    }
}
