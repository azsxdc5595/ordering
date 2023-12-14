package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.vo.porder;

@Mapper
public interface porderMapper {
	//create
	@Insert("insert into porder(deskno,memberno,ordertime,number,phone)" + "values(#{deskno},#{memberno},#{ordertime},#{number},#{phone})")
	void add(porder p);
	
	
	//read
	@Select("select * from porder")
	List<porder> queryAll();
	
	@Select("select * from porder where memberno=#{memberno}")
	List<porder> queryByMemberno(String memberno);
	
	@Select("select * from porder where id=#{id}")
	List<porder> queryById(Integer id);
	
	@Select("select * from porder where id=#{id}")
	porder getPorderById(@Param("id") Integer id);

	
	//update
	@Update("update porder set deskno=#{deskno},ordertime=#{ordertime},number=#{number},phone=#{phone} where id=#{id}")
	void updatePorder(porder p);
	
	
	//delete
	@Delete("delete from porder where id=#{id}")
	void deleteById(Integer id);


	
}