package com.southwind;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2020/3/5
 * Time: 0:44
 * Description: No Description
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2020/3/5 0:44
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * 8011端口
 * 用于做负载均衡 （两个启动分别不是同一个端口，使用网关 测试如果交替则就是，负载均衡成功）
 */
@SpringBootApplication
public class ProviderApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication2.class);
    }
}
