package com.southwind;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2020/3/7
 * Time: 15:20
 * Description: No Description
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2020/3/7 15:20
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@SpringBootApplication
@EnableFeignClients
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }
}
