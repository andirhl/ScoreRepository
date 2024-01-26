package scoring.score.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import scoring.score.models.ScoringInitation;

@Repository

public interface IScoringInitationRepository extends JpaRepository<ScoringInitation, Integer>{

}
