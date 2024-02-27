package scoring.score.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import scoring.score.models.ScoreValueMulti;
import scoring.score.repository.IScoreValueMultiRepository;



@Service
public class ServiceScValMulti {
	@Autowired
	IScoreValueMultiRepository repoScVlMulti;
	
	public List<ScoreValueMulti> getscVlMultiList(Integer scId){
		return repoScVlMulti.findBySvmScscId(scId);		
	}
	
	public String saveUpdateScoreMulti(ScoreValueMulti svm)
	{
		repoScVlMulti.save(svm);
		return "Submit Successfuly";
	}
	
	public ScoreValueMulti getScValMultiSingle(Integer svmid, Integer svmscscid){
		return repoScVlMulti.findBySvmIdAndSvmScscId(svmid, svmscscid);
	}
}
