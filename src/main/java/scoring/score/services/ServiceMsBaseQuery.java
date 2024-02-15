package scoring.score.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scoring.score.models.MsBaseQuery;
import scoring.score.models.MsTable;
import scoring.score.models.ScoringInitation;
import scoring.score.repository.IMsBaseQueryRepository;

@Service
public class ServiceMsBaseQuery {
	@Autowired
	IMsBaseQueryRepository repoBaseQuery;
   
	public List<MsBaseQuery> getBaseQuery(){
		return repoBaseQuery.findAll();
	}
	
	public List<MsBaseQuery> getBaseQueryVis(String vis){
		return repoBaseQuery.findByMbqVisible(vis);		
	}
	
	public Optional<MsBaseQuery> getBaseQueryId(Integer mbqid) {
		return repoBaseQuery.findById(mbqid);
	}
	
	public MsBaseQuery addupdateMsBaseQuery(MsBaseQuery BaseQuery) {
		//System.out.println(msTable.getMsTable()+" - "+msTable.getMstId());
		return repoBaseQuery.save(BaseQuery);
		//return "Submit Successfully";
	}

	public String deleteMsBaseQuery(Integer mbqId) {
		repoBaseQuery.deleteById(mbqId);
		return "Successfully Update";
	}
	
	public String getQueryName(Integer mbqId) {
		return repoBaseQuery.getQueryName(mbqId);
	}
	
	public String getQueryDesc(Integer mbqId) {
		return repoBaseQuery.getQueryDesc(mbqId);
	}
}
