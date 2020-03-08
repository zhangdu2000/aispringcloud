package com.southwind.entity;/**
 * Created with IntelliJ IDEA.
 * User: 张渡
 * Date: 2020/3/5
 * Time: 0:50
 * Description: No Description
 */

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @version 1.0
 * @author： 张渡
 * @date 2020/3/5 0:50
 * Modified By： 修改人姓名(如果有其他人修改时增加这三项)
 * Modified Date: 修改日期
 * Why & What is modified  修改原因描述
 * @Data
 */
@Data
@AllArgsConstructor
@NotEmpty
public class Student {
    private long id;
    private String  name;
    private int age;
}
