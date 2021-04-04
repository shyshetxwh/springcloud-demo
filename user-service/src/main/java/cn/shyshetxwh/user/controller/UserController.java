package cn.shyshetxwh.user.controller;

import cn.shyshetxwh.user.pojo.User;
import cn.shyshetxwh.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: UserController
 * Author:   admin+shyshetxwh
 * Date:     2021/04/03 21:09
 */
@RestController
@RequestMapping("/user")
@RefreshScope //刷新配置
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${test.name}")
    private String name;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        System.out.println("配置文件中 name = " + name);
        return userService.findById(id);
    }
}
