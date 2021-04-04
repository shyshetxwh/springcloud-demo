package cn.shyshetxwh.consumer.controller;

import cn.shyshetxwh.consumer.client.UserClient;
import cn.shyshetxwh.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: ConsumerFeignController
 * Author:   admin+shyshetxwh
 * Date:     2021/04/04 12:12
 */
@RestController
@RequestMapping("/cf")
public class ConsumerFeignController {
    @Autowired
    private UserClient userClient;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return userClient.findById(id);
    }
}
