package com.southwind.controller;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2020/3/6
 * Time: 13:56
 * Description: No Description
 */

import com.southwind.eneity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2020/3/6 13:56
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerHandler {
    @Autowired
    private RestTemplate restTemplate;

    /*查询全部*/
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        System.out.println("qq.com");
        return restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
    }
    @GetMapping("/findAll2")
    public Collection<Student> findAll2(){
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }
    /*单个查询*/
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return restTemplate.getForEntity("http://localhost:8010/student/finById/{id}",Student.class,id).getBody();
    }
    @GetMapping("/findById2/{id}")
    public Student findById2(@PathVariable("id") long id){
        return restTemplate.getForObject("http://localhost:8010/student/finById/{id}",Student.class,id);
    }
    /*添加*/
    @PostMapping("/save")
    public void  save(Student student){
        restTemplate.postForEntity("http://localhost:8010/student/save",student,null);
    }
    @PostMapping("/save2")
    public void  save2(Student student){
        restTemplate.postForObject("http://localhost:8010/student/save",student,null);
    }
    /*修改*/
    @PutMapping("/update")
    public void update(Student student){
        restTemplate.put("http://localhost:8010/student/update",student);
    }
    /*删除*/
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        restTemplate.delete("http://localhost:8010/student/deletaById/{id}",id);
    }

}
