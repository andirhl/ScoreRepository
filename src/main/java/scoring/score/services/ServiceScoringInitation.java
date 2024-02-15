package scoring.score.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scoring.score.models.BussinessProduct;
import scoring.score.models.ScoringInitation;
import scoring.score.repository.IScoringInitationRepository;

@Service

public class ServiceScoringInitation {
	@Autowired
	IScoringInitationRepository RepoScoringInitation;
	
	public List<ScoringInitation> getScorInitation(){
		return RepoScoringInitation.findAll();
	}
	
	public List<ScoringInitation> getScorInitVis(Integer ScorId, String vis){
		return RepoScoringInitation.findByScinIdAndScinVisible(ScorId, vis);		
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
	
	public String getScorName(Integer ScorId) {
		return RepoScoringInitation.getScorName(ScorId);
	}
    
	public List<ScoringInitation> getScorInitbyBCnPrd(Integer bctid,Integer bprid,String visible){
		return RepoScoringInitation.findByScinBctIdAndScinBprIdAndScinVisible(bctid, bprid, visible);		
	}
	
}
