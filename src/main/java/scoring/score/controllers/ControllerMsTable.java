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

import scoring.score.models.MsTable;
import scoring.score.services.ServiceMsTable;

@RestController
public class ControllerMsTable {
	@Autowired
	ServiceMsTable servMsTable;
	
	@GetMapping("/getmstable")
	public List<MsTable> getmstable(){
		return servMsTable.getMsTable();
	}

	@GetMapping("/getmsid")
	public Optional<MsTable> getByMsId(Integer msId) {
		return servMsTable.getByMsId(msId);
	}
	
	@PostMapping("/submitMsTable")
	@Transactional
	public String addupdateMsTable(@RequestBody  MsTable msTable) {
		//System.out.println("begi........n :"+msTable.getMstMsTable());
		MsTable mtab=servMsTable.addupdateMsTable(msTable);
		//System.out.println("end.....:"+mtab.getMsId());
		return "Update Successfully";
	}
	
	@DeleteMapping("/deleteMsTable")
	public String deleteMsTable(Integer msId) {
		return servMsTable.deleteMstTable(msId);
	}
	
	@GetMapping("/getmstname")
	public String getMstName(Integer msId) {
		return servMsTable.getMstName(msId);
	}
}
