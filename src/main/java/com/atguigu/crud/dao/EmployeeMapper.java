package com.atguigu.crud.dao;

import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.bean.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Mar 08 17:27:27 CST 2021
     */
    long countByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Mar 08 17:27:27 CST 2021
     */
    int deleteByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Mar 08 17:27:27 CST 2021
     */
    int deleteByPrimaryKey(Integer empId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Mar 08 17:27:27 CST 2021
     */
    int insert(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Mar 08 17:27:27 CST 2021
     */
    int insertSelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Mar 08 17:27:27 CST 2021
     */
    List<Employee> selectByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Mar 08 17:27:27 CST 2021
     */
    Employee selectByPrimaryKey(Integer empId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Mar 08 17:27:27 CST 2021
     */
    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Mar 08 17:27:27 CST 2021
     */
    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Mar 08 17:27:27 CST 2021
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Mon Mar 08 17:27:27 CST 2021
     */
    int updateByPrimaryKey(Employee record);

    List<Employee> selectByExampleWithDept(EmployeeExample employeeExample);

    Employee selectByPrimaryKeyWithDept(Integer empId);
}