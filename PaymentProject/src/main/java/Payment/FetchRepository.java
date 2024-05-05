package Payment;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

@Configuration
public interface FetchRepository extends JpaRepository<Employee, Integer>{

	@Bean
	 List<EmpBean> findBySqlQuery(String sqlstr);
}
