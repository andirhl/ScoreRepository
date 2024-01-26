package scoring.score.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scoring.score.models.MsBaseQuery;
import scoring.score.models.ScoringInitation;
import scoring.score.repository.IScoringInitationRepository;

@Service

public class ServiceScoringInitation {
	@Autowired
	IScoringInitationRepository RepoScoringInitation;
	
	public List<ScoringInitation> getScorInitation(){
		return RepoScoringInitation.findAll();
	}
	
	public Optional<ScoringInitation> getScorInitationId(Integer scinId) {
		return RepoScoringInitation.findById(scinId);
	}
	
	public ScoringInitation addupdateScorInitation(ScoringInitation ScorInit) {
		//System.out.println(msTable.getMsTable()+" - "+msTable.getMstId());
		return RepoScoringInitation.save(ScorInit);
		//return "Submit Successfully";
	}
	
	public String deleteScoringInitation(Integer scinId) {
		RepoScoringInitation.deleteById(scinId);;
		return "Successfully Update";
	}

}
