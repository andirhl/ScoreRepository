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

import scoring.score.models.MsTableColumn;
import scoring.score.models.MsTableColumnCompKey;
import scoring.score.services.ServiceMsTableColumn;

@RestController
public class ControllerMsTableColumn {
	@Autowired
	ServiceMsTableColumn servMsTableColumn;
	
	@GetMapping("/getmstablecolumn")
	public List<MsTableColumn> getmstablecolumn(){
		return servMsTableColumn.getMsTableColumn();
	}


	
	@PostMapping("/submitMsTableColumn")
	@Transactional
	public String addupdateMsTableColumn(@RequestBody  MsTableColumn msTableColumn) {
		//System.out.println("begi........n :"+msTable.getMstMsTableColumn());
		MsTableColumn mtab=servMsTableColumn.addupdateMsTableColumn(msTableColumn);
		//System.out.println("end.....:"+mtab.getMstcId());
		return "Update Successfully";
	}
	
	@DeleteMapping("/deleteMsTableColumn")
	public String deleteMsTableColumn(MsTableColumnCompKey msTableColumnCompKey) {
		return servMsTableColumn.deleteMstTableColumn(msTableColumnCompKey);
	}
	
	@GetMapping("/findbymstcidandmstcmsid")
	public List <MsTableColumn> findbymstcidandmstcmsid(Integer mstcId, Integer mstcmsId){
		return servMsTableColumn.findByMstcIdAndMstcMsId(mstcId, mstcmsId);
	}

}
