package scoring.score.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import scoring.score.models.GradeValue;
import scoring.score.repository.IGradeValueRepository;

@Service
public class ServiceGradeValue {
	@Autowired
	IGradeValueRepository repoGrVal;
	
	public  List<GradeValue> getGradeValueList (Integer grId) {
		return repoGrVal.findByGrGrvlGrGrIdOrderByGrGrvlId(grId) ;
	}
	
	public Optional<GradeValue> getGradeValueSingle (Integer grId, Integer grVlId) {
		return repoGrVal.findByGrGrvlGrGrIdAndGrGrvlIdOrderByGrGrvlId(grId, grVlId);
	}
	
	public String addupdateGradeValue(@RequestBody  GradeValue grVal) {
		repoGrVal.save(grVal);
		return "Submit Successfully";
	}

}
