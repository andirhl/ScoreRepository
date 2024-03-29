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

import scoring.score.models.GradeGroup;
import scoring.score.services.ServiceGradeGroup;

@RestController
public class ControllerGradeGroup {
	@Autowired
	ServiceGradeGroup servGrGr;
	
	@GetMapping("/gradegrouplist")
	public List<GradeGroup> getGradeGroupList(){
		return servGrGr.getGradeGroupList();
	}
	
	@GetMapping("/gradegroupsingle")
	public  Optional<GradeGroup> getGradeGroupSingle(Integer grid){
		return servGrGr.getGradeGroupSingle(grid);
	}
	
	@PostMapping("/saveupdategroup")
	public String addUpdateGroup(@RequestBody GradeGroup grgr) {
		return servGrGr.addUpdateGroup(grgr);
	}

}
