
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event.ID;

import scoring.score.models.MsColumnCondition;
import scoring.score.services.ServiceMsColumnCondition;

@RestController
public class ControllerMsColumnCondition {
	@Autowired
	ServiceMsColumnCondition servMsColumnCondition;
	
	@GetMapping("/getmscolumncondition")
	public List<MsColumnCondition> getmscolumncondition(){
		return servMsColumnCondition.getMsColumnCondition();
	}

	@GetMapping("/getmccid")
	public Optional<MsColumnCondition> getByMccId(Integer mccId) {
		return servMsColumnCondition.getByMccId(mccId);
	}
	
	@PostMapping("/submitMsColumnCondition")
	@Transactional
	public String addupdateMsColumnCondition(@RequestBody  MsColumnCondition msColumnCondition) {
		//System.out.println("begi........n :"+msColumnCondition.getMsColumnCondition());
		MsColumnCondition mtab=servMsColumnCondition.addupdateMsColCond(msColumnCondition);
		//System.out.println("end.....:"+mtab.getMccId());
		return "Update Successfully";
	}
	
	@DeleteMapping("/deleteMsColumnCondition")
	public String deleteMsColumnCondition(Integer mccId) {
		return servMsColumnCondition.deleteMstColCond(mccId);
	}
	
	@GetMapping("/getmccmstcid")
	public Optional<MsColumnCondition> getByMccMstcId(Integer mccmstcId) {
		return servMsColumnCondition.getByMccId(mccmstcId);
	}
}
