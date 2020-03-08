package com.southwind.repository;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2020/3/5
 * Time: 17:10
 * Description: No Description
 */

import com.southwind.entity.Student;

import java.util.Collection;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2020/3/5 17:10
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 */
public interface StudentRepository {
    Collection<Student> findAll();
    Student finById(long id);
    void saveOrUpdate(Student student);
    void deleteById(long id);
}
