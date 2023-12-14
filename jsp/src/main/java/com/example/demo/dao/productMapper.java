package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.vo.product;
@Mapper
public interface productMapper {
	//create
	@Insert("insert into product(productno,productname,price)values(#{productno},#{productname},#{price})")
	void add(product p);
	
	//read
	@Select("select * from product")
	List<product> queryAll();
	
	//update
	@Update("update product set productno=#{productno},productname=#{productname},price=#{price} where id=#{id}")
	void update(product p);
	
	
	//delete
	@Delete("delete from product where id=#{id}")
	void deleteById(Integer id);
}
