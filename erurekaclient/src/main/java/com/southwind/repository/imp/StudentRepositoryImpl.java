package com.southwind.repository.imp;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2020/3/5
 * Time: 17:14
 * Description: No Description
 */

import com.southwind.entity.Student;
import com.southwind.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2020/3/5 17:14
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long,Student> studentMap;

    static {
        studentMap=new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",18));
        studentMap.put(2L,new Student(2L,"李四",19));
        studentMap.put(3L,new Student(3L,"王五",20));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student finById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }

}
