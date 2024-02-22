package scoring.score.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import scoring.score.models.MsColumnCondition;

@Repository
public interface IMsColumnConditionRepository extends JpaRepository<MsColumnCondition, Integer> {
	
	List<MsColumnCondition> findByMccmstcId (Integer mctcId);

}
