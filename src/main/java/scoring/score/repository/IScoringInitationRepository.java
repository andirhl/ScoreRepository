package scoring.score.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import scoring.score.models.ScoringInitation;

@Repository

public interface IScoringInitationRepository extends JpaRepository<ScoringInitation, Integer>{
	@Query("select s.scinName from ScoringInitation s where s.scinId=?1 and s.scinVisible='Y'")
	public String getScorName(Integer scinId);
	
	List<ScoringInitation> findByScinIdAndScinVisible (Integer scinid,String visible  );
    
	List<ScoringInitation> findByScinVisible (String vis);
	
	List<ScoringInitation> findByScinBctIdAndScinBprIdAndScinVisible (Integer bctid,Integer bprid,String visible  );
	
}
