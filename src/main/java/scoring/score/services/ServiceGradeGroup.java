package scoring.score.services;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import scoring.score.models.GradeGroup;
import scoring.score.repository.IGradeGroupRepository;



@Service
public class ServiceGradeGroup {
	@Autowired
	IGradeGroupRepository repoGrGr;
	
	public List<GradeGroup> getGradeGroupList(){
		return repoGrGr.findAll();
	}
	
	public GradeGroup getGradeGroupSingle(Integer grid){
		return repoGrGr.getById(grid);
	}
	
	
}
