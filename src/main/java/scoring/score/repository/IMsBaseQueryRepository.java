package scoring.score.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import scoring.score.models.MsBaseQuery;

@Repository
public interface IMsBaseQueryRepository extends JpaRepository<MsBaseQuery, Integer> {

}
