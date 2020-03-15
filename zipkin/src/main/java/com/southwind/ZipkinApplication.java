package com.southwind;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2020/3/8
 * Time: 13:47
 * Description: No Description
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @version 1.0
 * @author： 张渡
 * @date 2020/3/8 13:47
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * @EnableZipkinServer 声明启动 Zipkin Server
 *
 *
 * 在spring boot2.0以上的版本中，
 * 官方不再支持使用自建Zipkin Server的方式进行服务链路追踪，
 * 而是直接提供了编译好的 jar 包来给我们使用。
 * 路径查看详情：https://blog.csdn.net/ovejur/article/details/89150822?depth_1-utm_source=distribute.pc_relevant.none-task&utm_source=distribute.pc_relevant.none-task
 */
@SpringBootApplication
//@EnableZipkinServer  //已经用不了，了
public class ZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }
}
