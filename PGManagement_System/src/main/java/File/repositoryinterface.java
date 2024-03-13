package File;

import java.util.List;

public interface repositoryinterface {

	public abstract List<BeanEntity> findBySqlQuery(String paramString);
}
