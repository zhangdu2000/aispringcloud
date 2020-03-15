package com.southwind;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2020/3/8
 * Time: 12:58
 * Description: No Description
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2020/3/8 12:58
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * @EnableConfigServer注解，表示这里是配置中心服务
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServersApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServersApplication.class,args);
    }
}
