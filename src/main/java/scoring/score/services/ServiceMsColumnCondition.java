package scoring.score.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import scoring.score.models.MsColumnCondition;
import scoring.score.models.MsTable;
import scoring.score.repository.IMsColumnConditionRepository;
import scoring.score.repository.IMsTableRepository;
@Service
public class ServiceMsColumnCondition {
	@Autowired
	IMsColumnConditionRepository repoMsColumnCondition;
	
	public List<MsColumnCondition> getMsColumnCondition(){
		return repoMsColumnCondition.findAll();
	}

	public Optional<MsColumnCondition> getByMccId(Integer mccId) {
		return repoMsColumnCondition.findById(mccId);
	}
	
	public MsColumnCondition addupdateMsColCond(MsColumnCondition msColumnCondition) {
		//System.out.println(msColumnCondition.getMsColumnCondition()+" - "+msColumnCondition.getMcctId());
		return repoMsColumnCondition.save(msColumnCondition);
		//return "Submit Successfully";
	}
	
	public String deleteMstColCond(Integer mccId) {
		repoMsColumnCondition.deleteById(mccId);
		return "Successfully Update";
	}
	
	public List<MsColumnCondition> getByMccMstcId(Integer mctcId) {
		return repoMsColumnCondition.findByMccmstcId(mctcId);
	}
}
