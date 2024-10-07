package scoring.score.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import scoring.score.models.BussinessProduct;
import scoring.score.models.GradeBranch;
import scoring.score.services.ServiceGradeBranch;

@RestController

public class ControllerGradeBranch {
	@Autowired
	ServiceGradeBranch ServGrBr;
	
	@GetMapping("/getGradeBranchList")	
	public List<GradeBranch> getGradeBranchList( String vis){
		return ServGrBr.getGradeBranchList(vis);
	}
	

}
