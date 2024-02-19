package scoring.score.services;
import java.util.List;
import java.util.Optional;

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
	
	public List<ScoreValue> getAllScoreValueList(){
		return repoScoVal.findAll();
	}
	
	public Optional<ScoreValue> getScoreValueSingle(Integer scscId) {
		return repoScoVal.findByScscId(scscId);
	}
	
	public String saveScoreValue(ScoreValue scValue){
		 repoScoVal.save(scValue);
		 return "Submit Successfully";
	}
	
	
	
	@Transactional
	public void delScoreValue (Integer scscId, Integer scscBctId, Integer scscBprId) {
		repoScoVal.deleteByScscIdAndScscBctIdAndScscBprId(scscId, scscBctId, scscBprId);
	}

	
	

}
