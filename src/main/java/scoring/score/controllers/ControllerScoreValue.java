package scoring.score.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event.ID;

import scoring.score.models.BussinessCategory;
import scoring.score.models.ScoreValue;
import scoring.score.services.ServiceBussinessCategory;
import scoring.score.services.ServiceScoreValue;

@RestController

public class ControllerScoreValue {
	@Autowired
	ServiceScoreValue servScVal;
	
	@GetMapping("/scorevaluelist")
	public List<ScoreValue> getScoreValueList(Integer bctId, Integer bprId, String typee){
		return servScVal.getScoreValueList(bctId, bprId, typee);
	}
	
	@GetMapping("/allscorevaluelist")
	public List<ScoreValue> getAllScoreValueList(){
		return servScVal.getAllScoreValueList();
	}
		
	@GetMapping("/allscorevaluesingle")
	public Optional<ScoreValue> getScoreValueSingle(Integer scscId) {
		return servScVal.getScoreValueSingle(scscId);
	}
	
	@PostMapping("/addscorevalue")
	public String saveScoreValue(@RequestBody ScoreValue scValue){
		return servScVal.saveScoreValue(scValue);
	}
	
	@DeleteMapping("/delscorevalue")
	public void delScoreValue (Integer scscId, Integer scscBctId, Integer scscBprId) {
		servScVal.delScoreValue(scscId, scscBctId, scscBprId);
	}

}
