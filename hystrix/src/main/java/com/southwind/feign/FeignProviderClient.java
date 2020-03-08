package com.southwind.feign;

import com.southwind.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2020/3/7
 * Time: 15:57
 * Description: No Description
 */
@FeignClient(value = "provider")
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
     Collection<Student> findAll();
    @GetMapping("/student/index")
     String index();
}
