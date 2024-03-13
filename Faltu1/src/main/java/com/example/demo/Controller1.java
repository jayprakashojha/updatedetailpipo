package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;

public class Controller1 {

	@RequestMapping()
    public ArrayList<Bean> Home()
    {
		ArrayList<Bean> al=new ArrayList<Bean>();
		al.add(new Bean("jay",101));
		al.add(new Bean("neena",102));
		al.add(new Bean("jyoti",103));
		al.add(new Bean("monha",104));
		List<String> li=al.stream().filter(a->a.name=="madhya pradesh").map(a->a.name).collect(Collectors.toList());
		System.out.println(li);
		return al;
    }
	
	@RequestMapping()
    public String Guna()
    {
		return "Guna";
    }
}
