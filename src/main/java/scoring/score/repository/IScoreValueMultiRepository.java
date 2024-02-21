package scoring.score.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import scoring.score.models.ScoreValue;
import scoring.score.models.ScoreValueMulti;
import scoring.score.models.ScoreValueMultiCompKey;

@Repository
public interface IScoreValueMultiRepository extends  JpaRepository<ScoreValueMulti,ScoreValueMultiCompKey> {

}
