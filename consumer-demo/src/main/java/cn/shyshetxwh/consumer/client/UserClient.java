package cn.shyshetxwh.consumer.client;

import cn.shyshetxwh.consumer.client.fallback.UserClientFallback;
import cn.shyshetxwh.consumer.config.FeignConfig;
import cn.shyshetxwh.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * FileName: UserClient
 * Author:   admin+shyshetxwh
 * Date:     2021/04/04 12:07
 */
@FeignClient(value = "user-service",fallback = UserClientFallback.class,configuration = FeignConfig.class)  //表示是一个Feign客户端,指定服务名为user-service
public interface UserClient {

    //http://user-service/user/1
    @GetMapping("/user/{id}")
    User findById(@PathVariable Long id);
}
