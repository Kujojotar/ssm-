package com.atguigu.crud.test;

import com.atguigu.crud.bean.Department;
import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.dao.DepartmentMapper;
import com.atguigu.crud.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class MapperTest {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    SqlSession sqlSession;

    @Test
    public void Test(){
        /*
        EmployeeMapper employeeMapper=sqlSession.getMapper(EmployeeMapper.class);
        for(int i=0;i<10;i++){
            String uid= UUID.randomUUID().toString().substring(0,5);
            Employee employee=new Employee();
            employee.setEmpName(uid);
            employee.setGender(i%2==0?"f":"m");
            employee.setdId(i%3+1);
            employeeMapper.insertSelective(employee);
        }
         */

    }
}
