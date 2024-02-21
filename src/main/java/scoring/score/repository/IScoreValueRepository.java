package scoring.score.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import scoring.score.models.ScoreValue;

@Repository

public interface IScoreValueRepository extends  JpaRepository<ScoreValue,Integer> {
	
	///@Query("select s from ScoreValue s where s.scscBctId=1 and s.scscBprId=2 ")
	List<ScoreValue> findByScscBctIdAndScscBprIdAndScscType(Integer bctId, Integer bprId, String typee);
	
	ScoreValue findByscscId(Integer scscId);

	@Modifying
	void deleteByScscIdAndScscBctIdAndScscBprId(Integer scscId, Integer bctId, Integer bprId);

}
