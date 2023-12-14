package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.vo.member;

@Mapper
public interface memberMapper {
	//create
	@Insert("insert into member(memberno,name,username,password,email,type) "
			+ "values(#{memberno},#{name},#{username},#{password},#{email},#{type})")
	void add(member m);
	
	//read
	@Select("select * from member where username=#{username} and password=#{password}")
	member query(String username,String password);
	
	@Select("select * from member")
	List<member> queryAll();
	
	@Select("select * from member where id=#{id}")
	member queryId(int id);
	
	@Select("select * from member where username=#{username}")
	member queryUser(String username);
	
	
	
	
	
	//update
	@Update("update member set name=#{name},password=#{password},email=#{email} where id=#{id}")
	void update(member m);
	
	
	//delete
	@Delete("delete from member where id=#{id}")
	void delete(int id);

}
