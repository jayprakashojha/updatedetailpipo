package Demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
@Service
public class Service1 {

	@Autowired
	public Repository1 rep;
	
	public Bean1 savedata1(Bean1 sav)
	{
		return rep.save(sav);
	}
	
	public List<Bean1> savedata(List<Bean1> save1)
	{
		return rep.saveAll(save1);
	}
	
	public List<Bean1> getdata()
	{
		return rep.findAll();
	}
	
}
