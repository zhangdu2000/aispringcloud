package com.southwind.controller;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2020/3/7
 * Time: 16:20
 * Description: No Description
 */

import com.southwind.entity.Student;
import com.southwind.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2020/3/7 16:20
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@RestController
@RequestMapping("/feign")
public class FeignHandler {
    @Autowired
    private FeignProviderClient feignProviderClient;
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
     return    feignProviderClient.findAll();
    }
    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }

}
