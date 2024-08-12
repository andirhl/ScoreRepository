package scoring.score.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scoring.score.models.MsParam;
import scoring.score.repository.IMsParamRepository;

@Service
public class ServiceMsParam {
	@Autowired
	IMsParamRepository repomsparam;
	
	public List<MsParam> getParamKey(String key){
		return repomsparam.findByMspKey(key);		
	}

}
