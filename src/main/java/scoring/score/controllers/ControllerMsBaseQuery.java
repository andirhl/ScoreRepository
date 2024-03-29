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

import scoring.score.models.MsBaseQuery;
import scoring.score.services.ServiceMsBaseQuery;

@RestController

public class ControllerMsBaseQuery {
	@Autowired
	ServiceMsBaseQuery servBaseQuery;
	
	@GetMapping("/getbasequery")
	public List<MsBaseQuery> getBaseQuery(){
		var buf = servBaseQuery.getBaseQuery();
		return buf;
	}
	
	@GetMapping("/getbasequeryvis")
	public List<MsBaseQuery> getBaseQueryVis(String vis){
		return servBaseQuery.getBaseQueryVis(vis);		
	}
	
	@GetMapping("/getbasequeryid")
	public Optional<MsBaseQuery> getBaseQueryId(Integer mbqid) {
		return servBaseQuery.getBaseQueryId(mbqid);
	}
	
	@PostMapping("/submitmsbasequery")
	@Transactional
	public String addupdateMsBaseQuery(@RequestBody  MsBaseQuery BaseQuery) {
		//System.out.println("begi........n :"+msTable.getMstMsTable());
		MsBaseQuery mbase=servBaseQuery.addupdateMsBaseQuery(BaseQuery);
		//System.out.println("end.....:"+mtab.getMsId());
		return "Update Successfully";
	}
	
	@DeleteMapping("/deleteMsBaseQuery")
	public String deleteMsBaseQuery(Integer mbqId) {
		return servBaseQuery.deleteMsBaseQuery(mbqId);
	}
	
	@GetMapping("/getbasequeryname")
	public String getQueryName(Integer mbqId) {
		return servBaseQuery.getQueryName(mbqId);
	}
	
	@GetMapping("/getbasequerydesc")
	public String getQueryDesc(Integer mbqId) {
		return servBaseQuery.getQueryDesc(mbqId);
	}
	
}
