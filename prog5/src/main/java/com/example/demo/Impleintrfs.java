package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository 
public class Impleintrfs implements Showdatainterface {

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<Bean> findBySqlQuery(String command1) {
	   String str=command1;
		return this.jt.query(str,BeanPropertyRowMapper.newInstance(Bean.class) );
	}

}
