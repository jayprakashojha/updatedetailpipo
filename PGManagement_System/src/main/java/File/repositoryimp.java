package File;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class repositoryimp implements repositoryinterface {

	@Autowired
	public JdbcTemplate jt;
	
	public List<BeanEntity> findBySqlQuery(String sqlStr) {
		String q=sqlStr;
		return this.jt.query(q,BeanPropertyRowMapper.newInstance(BeanEntity.class));
	}

}
