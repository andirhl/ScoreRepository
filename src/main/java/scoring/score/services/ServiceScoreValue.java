package scoring.score.services;
import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import scoring.score.models.ScoreValue;
import scoring.score.repository.IBussinessCategoryRepository;
import scoring.score.repository.IScoreValueRepository;

@Service
public class ServiceScoreValue {
	
	@Autowired
	IScoreValueRepository repoScoVal;
	
	public List<ScoreValue> getScoreValueList(Integer bctId, Integer bprId, String typee){
		return repoScoVal.findScoreValue(bctId, bprId, typee);
	}

}
