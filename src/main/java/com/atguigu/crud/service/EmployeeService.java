package com.atguigu.crud.service;

import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    public List<Employee> getAll(){
        return employeeMapper.selectByExampleWithDept(null);
    }

    public void addEmployee(Employee employee){
        employeeMapper.insert(employee);
    }

    public void updateEmployee(Employee employee){
        employeeMapper.updateByPrimaryKey(employee);
    }

    public void deleteEmployee(Integer id){
        employeeMapper.deleteByPrimaryKey(id);
    }

    public Employee selectById(Integer id){
        return employeeMapper.selectByPrimaryKeyWithDept(id);
    }
}
