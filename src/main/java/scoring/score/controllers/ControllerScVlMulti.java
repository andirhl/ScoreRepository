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

import scoring.score.models.ScoreValueMulti;
import scoring.score.services.ServiceScValMulti;



@RestController
public class ControllerScVlMulti {
	@Autowired
	ServiceScValMulti servScVlMulti;
	
	@GetMapping("/scorevaluemultilist")
	public List<ScoreValueMulti> getscVlMultiList(Integer scId){
		return servScVlMulti.getscVlMultiList(scId);
	}
	
	@GetMapping("/scorevaluemultisingle")
	public ScoreValueMulti getScValMultiSingle(Integer svmid, Integer svmscscid){
		return servScVlMulti.getScValMultiSingle(svmid, svmscscid);
	}
	
	
	@PostMapping("/saveUpdateScoreMulti")
	public String saveUpdateScoreMulti(@RequestBody ScoreValueMulti svm) {
		return servScVlMulti.saveUpdateScoreMulti(svm);
	}
	
	
	

}
