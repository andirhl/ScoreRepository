package scoring.score.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import scoring.score.models.MsBaseQuery;
import scoring.score.services.ServiceMsBaseQuery;

@RestController

public class ControllerMsBaseQuery {
	@Autowired
	ServiceMsBaseQuery servBaseQuery;
	
	@GetMapping("/getbasequery")
	public List<MsBaseQuery> getBaseQuery(){
		return servBaseQuery.getBaseQuery();
	}
	
	@GetMapping("/getbasequeryid")
	public Optional<MsBaseQuery> getBaseQueryId(Integer mbqid) {
		return servBaseQuery.getBaseQueryId(mbqid);
	}
}
