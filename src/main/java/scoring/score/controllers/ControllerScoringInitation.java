package scoring.score.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import scoring.score.models.ScoringInitation;
import scoring.score.services.ServiceScoringInitation;

@RestController

public class ControllerScoringInitation {
	@Autowired
	ServiceScoringInitation servScoringInitation;
	
	@GetMapping("/getscoringinitation")
	public List<ScoringInitation> getScorInitation(){
		return servScoringInitation.getScorInitation();
	}
	
	@GetMapping("/getscoringinitationvis")
	public List<ScoringInitation> getScorInitVis(Integer ScorId, String vis){
		return servScoringInitation.getScorInitVis(ScorId, vis);		
	}
	
	@GetMapping("/getscorinitationid")
	public Optional<ScoringInitation> getScorInitationId(Integer scinId) {
		return servScoringInitation.getScorInitationId(scinId);
	}
	
	@PostMapping("/submitscorinitation")
	@Transactional
	public String addupdateScoringInitation(@RequestBody  ScoringInitation ScorInit) {
		//System.out.println("begi........n :"+msTable.getMstMsTable());
		ScoringInitation mscor= servScoringInitation.addupdateScorInitation(ScorInit);
		//System.out.println("end.....:"+mtab.getMsId());
		return "Update Successfully";
	}
	
	@DeleteMapping("/deletescorinitation")
	public String deleteScoringInitation(Integer scinId) {
		return servScoringInitation.deleteScoringInitation(scinId);
	}
	
	@GetMapping("/getscorname")
	public String getScorName(Integer ScorId) {
		return servScoringInitation.getScorName(ScorId);
	}

}
