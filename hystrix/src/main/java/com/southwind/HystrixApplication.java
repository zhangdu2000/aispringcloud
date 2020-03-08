package com.southwind;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2020/3/7
 * Time: 18:11
 * Description: No Description
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2020/3/7 18:11
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * @EnableCircuitBreaker 声明启用数据监控
 * @EnableHystrixDashboard 声明启用可视化的数据监控
 */
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrixDashboard
public class HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class,args);
    }
}
