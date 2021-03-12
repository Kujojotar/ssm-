package com.atguigu.crud.controller;

import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/empsj")
    @ResponseBody
    public Msg getEmpsJsonForm(@RequestParam(value="pn",defaultValue = "1" )Integer pn, Model model){
        PageHelper.startPage(pn,3);
        List<Employee> list=employeeService.getAll();
        PageInfo pageInfo=new PageInfo(list,3);
        return Msg.success().add("pageInfo",pageInfo);
    }



    @RequestMapping("/emps")
    public String getEmps(@RequestParam(value="pn",defaultValue = "1" )Integer pn, Model model){
        PageHelper.startPage(pn,3);
        List<Employee> list=employeeService.getAll();
        PageInfo pageInfo=new PageInfo(list,3);
        model.addAttribute(pageInfo);
        return "list";
    }

    @RequestMapping("/update")
    public String updateEmployee(Employee employee){
        employeeService.updateEmployee(employee);
        return "list";
    }

    @RequestMapping("/add")
    public String addEmployee(Employee employee){
        employeeService.addEmployee(employee);
        return "list";
    }

    @RequestMapping("/delete")
    public void deleteEmployee(Integer id){
        employeeService.deleteEmployee(id);
    }
}
