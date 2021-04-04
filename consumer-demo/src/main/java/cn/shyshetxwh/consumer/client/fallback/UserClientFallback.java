package cn.shyshetxwh.consumer.client.fallback;

import cn.shyshetxwh.consumer.client.UserClient;
import cn.shyshetxwh.consumer.pojo.User;
import org.springframework.stereotype.Component;

/**
 * FileName: UserClientFallback
 * Author:   admin+shyshetxwh
 * Date:     2021/04/04 12:30
 */
@Component
public class UserClientFallback implements UserClient {
    @Override
    public User findById(Long id) {
        User user=new User();
        user.setId(id);
        user.setName("用户异常");
        return user;
    }
}
