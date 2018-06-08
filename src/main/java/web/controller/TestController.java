package web.controller;

import domain.mapper.UserMapper;
import domain.module.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liqiag
 * @discription TestController
 * @date 2018-05-28
 **/
@RestController
public class TestController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public List<User> listAll(){
        return userMapper.listUser();
    }
}