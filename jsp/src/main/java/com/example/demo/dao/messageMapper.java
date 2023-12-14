package com.example.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.vo.message;

@Mapper
public interface messageMapper {
	//create
	@Insert("Insert into message(title,content,author)" + "values(#{title},#{content},#{author})")
	void add(message m);
	
	//read
	@Select("select * from message")
	<List>message queryAll();
	
	@Select("select * from message")
	<List>message queryByAuthor(String suthor);
	
	//update
	@Update("update message set title=#{title},content=#{content},author=#{author} where id=#{id}")
	void update(message m);
	
	
	//delete
	
	
	
	
}
