package cn.shyshetxwh.consumer.config;

import com.sun.javafx.scene.control.Logging;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * FileName: FeignConfig
 * Author:   admin+shyshetxwh
 * Date:     2021/04/04 12:40
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        //记录所有请求和响应的明细
        return Logger.Level.FULL;
    }
}
