package Payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;



@Service
public abstract class ServiceRepository implements FetchRepository {

	@Autowired
	public JdbcTemplate jt;
	
	public List<EmpBean> findBySqlQuery(String sqlStr) {
		String q=sqlStr;
		return this.jt.query(q,BeanPropertyRowMapper.newInstance(EmpBean.class));
	}
}
