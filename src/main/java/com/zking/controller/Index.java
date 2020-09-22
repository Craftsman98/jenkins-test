package com.zking.controller;

import com.zking.dao.UserDao;
import com.zking.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/5/12.
 */

@Controller
public class Index {

    Logger logger = LoggerFactory.getLogger("test");

    //index页面
    //测试对代码进行一定的修改
    @RequestMapping("/")
    public String index() {
        logger.info("hello test jenkins!");
        return "register";
    }

    

}
