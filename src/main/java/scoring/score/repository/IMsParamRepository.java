package scoring.score.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import scoring.score.models.MsParam;


@Repository
public interface IMsParamRepository extends JpaRepository<MsParam, Integer> {
	
	List<MsParam> findByMspKey (String key);

}
