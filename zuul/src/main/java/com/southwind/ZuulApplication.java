package com.southwind;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2020/3/6
 * Time: 17:03
 * Description: No Description
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2020/3/6 17:03
 * Modified By： 修改人姓名(如果有其他人修改时增加zhi这三项)
 * Modified Date: 修改日期
 * @EnableZuulProxy 网关代理（包含了@EnableZuulServer,设置该类是网关的启动类）
 * @EnableAutoConfiguration 自动装载配置 （可以帮助 Spring Boot 应用将所有符合条件的配置@Configuration 配置
 * 加载到当前 Spring boot 创建并使用的 IOC 容器中 ）
 * Zuul(网关) 自带了负载均衡功能
 *
 */

@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class);
    }
}
