package com.southwind.controller;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2020/3/5
 * Time: 17:31
 * Description: No Description
 */

import com.southwind.entity.Student;
import com.southwind.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2020/3/5 17:31
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentRepository studentRepository;
    @Value("${server.port}")
    private String port;
    @GetMapping("/findAll")
    public Collection<Student> findAll(){
       return studentRepository.findAll();
    }
    @GetMapping("/finById/{id}")  //{id}传过来的id
    public Student finById(@PathVariable("id") long id) {   //映射上（@PathVariable("id") long id)
        return studentRepository.finById(id);
    }
    @PostMapping("/save")
    public void save(Student student){
        studentRepository.saveOrUpdate(student);
    }
    @PutMapping("/update")
    public void  update(Student student){
        studentRepository.saveOrUpdate(student);
    }
    @DeleteMapping("/deletaById/{id}")
    public void deleteById(@PathVariable("id") long id){
        studentRepository.deleteById(id);
    }
    @GetMapping("/index")
    public String index(){
        return "当前端口是:"+this.port;
    }
}
