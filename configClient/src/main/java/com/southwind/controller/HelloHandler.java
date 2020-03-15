package com.southwind.controller;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2020/3/8
 * Time: 13:17
 * Description: No Description
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2020/3/8 13:17
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@RestController
//这里面的属性有可能会更新的，git中的配置中心变化的话就要刷新，没有这个注解内，配置就不能及时更新
@RefreshScope
@RequestMapping("/hello")
public class HelloHandler {
    @Value("${server.port}")
    private String port;
    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;
    @GetMapping("/index")
    public String index(){
      return this.port;
    }
}
