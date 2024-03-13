package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Interface2Impl implements Interface2 {

	@Autowired 
	private JdbcTemplate jt;
	public List<Bean> findBySqlQuery(String command)
	{
		String str=command;
		return this.jt.query(str,BeanPropertyRowMapper.newInstance(Bean.class));
	}
	
	
}
