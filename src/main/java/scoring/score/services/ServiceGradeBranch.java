package scoring.score.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scoring.score.models.GradeBranch;
import scoring.score.repository.IGradeBranchRepository;

@Service

public class ServiceGradeBranch {
	@Autowired
	IGradeBranchRepository repoGrBr;
	
	public List<GradeBranch> getGradeBranchList(String vis){
		return repoGrBr.findByGrvlVisble(vis);	
	}

}
