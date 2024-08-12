package scoring.score.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import scoring.score.models.MsParam;
import scoring.score.services.ServiceMsParam;


@RestController
public class ControllerMsParam {
	
	@Autowired
	ServiceMsParam servMsParam;
	
	@GetMapping("/getparamkey")
	public List<MsParam> getParamKey(String key){
		return servMsParam.getParamKey(key);		
	}

}
