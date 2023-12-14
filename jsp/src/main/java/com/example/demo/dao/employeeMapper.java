package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.vo.employee;
import com.example.demo.vo.porder;
@Mapper
public interface employeeMapper {
	//create
	@Insert("insert into employee(employeeno,name,username,password,type) "
			+ "values(#{employeeno},#{name},#{username},#{password},#{type})")
	void add(employee e);
	
	
	//read
	@Select("select * from employee where username=#{username} and password=#{password}")
	employee queryUser(String username,String password);
	
	@Select("select * from employee where username=#{username} ")
	employee queryUsername(String username);
	
	
	@Select("select * from employee where id=#{id}")
	List<employee> queryById(int id);
	
	@Select("select * from employee")
	List<employee> queryAll();
	
	
	//update
	@Update("update employee set password=#{password} where id=#{id}")
	void updatePassword(employee e);
	
	@Update("update employee set type=#{type} where id=#{id}")
	void updateType(employee e);
	
	@Select("select * from employee where name=#{name}")
	employee getEmployeeByName(@Param("name")  String employeeName);

	@Select("select * from employee where id=#{id}")
	employee getEmployeeById(@Param("id")  Integer employeeId);
	
	//delete
	@Delete("delete from employee where id=#{id}")
    void delete(int id);

	
}