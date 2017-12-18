package com.taotao.services;

import com.taotao.mapper.TbUserMapper;
import com.taotao.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private TbUserMapper tbUserMapper;

    public TbUser getUserById(Integer id){
        TbUser tbUser = tbUserMapper.selectByPrimaryKey(id);
        return tbUser;
    }
}
