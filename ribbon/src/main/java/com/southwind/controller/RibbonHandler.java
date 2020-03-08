package com.southwind.controller;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2020/3/7
 * Time: 13:35
 * Description: No Description
 */

import com.southwind.entity.Student;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2020/3/7 13:35
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForObject("http://provider/student/findAll",Collection.class);
    }
    @GetMapping("/index")
    public String index(){
    return restTemplate.getForObject("http://provider/student/index",String.class);
    }
}
