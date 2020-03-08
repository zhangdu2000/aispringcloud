package com.southwind;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2020/3/6
 * Time: 13:52
 * Description: No Description
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2020/3/6 13:52
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);
    }
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
