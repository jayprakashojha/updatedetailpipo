package File;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Interface1 extends JpaRepository<BeanEntity, Integer> {

	 BeanEntity findByName(String Name);
}
