package com.zking.controller;

import com.zking.dao.UserDao;
import com.zking.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/5/12.
 */

@Controller
public class Index {

    //index页面
    @RequestMapping("/")
    public String index() {
        return "register";
    }

    

}
