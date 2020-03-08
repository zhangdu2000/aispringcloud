package com.southwind.controller;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2020/3/7
 * Time: 22:57
 * Description: No Description
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2020/3/7 22:57
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@RestController
@RequestMapping("/native")
public class NativeConfigHandler {
    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String foo;

    @GetMapping("/index")
    public String index() {
        return this.port+"-"+this.foo;
    }
}
