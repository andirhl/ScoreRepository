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

import scoring.score.models.GradeValue;
import scoring.score.services.ServiceGradeValue;

@RestController
public class ControllerGradeValue {
	@Autowired
	ServiceGradeValue servGrVl;
	
	@GetMapping("/getgradevaluelist")
	public  List<GradeValue> getGradeValueList (Integer grId) {
		return servGrVl.getGradeValueList(grId);
	}
	
	@GetMapping("/getgradevaluesingle")
	public Optional<GradeValue> getGradeValueSingle (Integer grId, Integer grVlId) {
		return servGrVl.getGradeValueSingle(grId, grVlId);
	}
	
	@PostMapping("/saveUpdateGradeValue")
	public String addupdateGradeValue(@RequestBody  GradeValue grval) {		
		return servGrVl.addupdateGradeValue(grval);
	}
	

}
