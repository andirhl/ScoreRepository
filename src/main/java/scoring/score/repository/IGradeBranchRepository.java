package scoring.score.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import scoring.score.models.GradeBranch;

@Repository
public interface IGradeBranchRepository extends JpaRepository<GradeBranch, Integer>{
	
	List<GradeBranch> findByGrvlVisble (String vis);

}
