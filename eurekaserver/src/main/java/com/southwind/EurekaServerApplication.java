package com.southwind;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2020/3/5
 * Time: 0:05
 * Description: No Description
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2020/3/5 0:05
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * EnableEurekaServer 声明该类是一个Eureka Server 微服务，提供服务注册和服务发现功能，即注册中心。
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class);
    }
}
