package scoring.score.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import scoring.score.models.MsTable;
import scoring.score.models.MsTableColumn;

@Repository
public interface IMsTableColumnRepository extends JpaRepository<MsTableColumn, Integer> {

}
