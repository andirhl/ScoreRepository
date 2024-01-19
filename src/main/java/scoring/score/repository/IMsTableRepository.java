package scoring.score.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import scoring.score.models.MsTable;

@Repository
public interface IMsTableRepository extends JpaRepository<MsTable, Integer> {

}
