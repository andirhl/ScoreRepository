package scoring.score.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import scoring.score.models.BussinessCategory;
import scoring.score.models.ScoreValue;

@Repository

public interface IScoreValueRepository extends  JpaRepository<ScoreValue,Long> {
	List<ScoreValue> findByScscBctIdAndScscBprIdAndScscType(Integer bctId, Integer bprId, Integer typee);
	
}
