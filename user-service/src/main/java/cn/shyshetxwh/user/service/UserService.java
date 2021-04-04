package cn.shyshetxwh.user.service;

import cn.shyshetxwh.user.mapper.UserMapper;
import cn.shyshetxwh.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * FileName: UserService
 * Author:   admin+shyshetxwh
 * Date:     2021/04/03 21:03
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(Long id){
        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return userMapper.selectByPrimaryKey(id);
    }
}
