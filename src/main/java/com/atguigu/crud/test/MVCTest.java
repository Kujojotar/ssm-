package com.atguigu.crud.test;

import com.atguigu.crud.bean.Employee;
import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:application.xml","file:C:\\Users\\Jonny\\Desktop\\te\\ssm-crud\\web\\WEB-INF\\dispatcherServlet-servlet.xml"})
public class MVCTest {
    @Autowired
    WebApplicationContext webApplicationContext;

    MockMvc mockMvc;

    @Before
    public void initMvc(){
        mockMvc=MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testPage()throws Exception{
        MvcResult result=mockMvc.perform(MockMvcRequestBuilders.get("/emps").param("pn","1"))
                .andReturn();
        MockHttpServletRequest request= result.getRequest();
        PageInfo pageInfo=(PageInfo) request.getAttribute("pageInfo");
        System.out.println(pageInfo.getPageNum());
        System.out.println(pageInfo.getPages());
        System.out.println(pageInfo.getTotal());
        List<Employee> list=pageInfo.getList();
        System.out.println();
        for(Employee e:list){
            System.out.println(e);
        }
    }

}
