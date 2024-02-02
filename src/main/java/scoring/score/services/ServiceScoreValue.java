package scoring.score.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import scoring.score.models.ScoreValue;
import scoring.score.repository.IScoreValueRepository;

@Service
public class ServiceScoreValue {
	
	@Autowired
	IScoreValueRepository repoScoVal;
	
	public List<ScoreValue> getScoreValueList(Integer bctId, Integer bprId, String typee){
		return repoScoVal.findByScscBctIdAndScscBprIdAndScscType(bctId, bprId, typee );
	}
	
	public ScoreValue saveScoreValue(ScoreValue scValue){
		return repoScoVal.save(scValue);
	}
	
	@Transactional
	public void delScoreValue (Integer scscId, Integer scscBctId, Integer scscBprId) {
		repoScoVal.deleteByScscIdAndScscBctIdAndScscBprId(scscId, scscBctId, scscBprId);
	}

	
	

}
