package scoring.score.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "SCORE_VALUE")
public class ScoreValue {
	@Id
	@Column (name="SCSC_ID")
	private Long scscId;
	
	@Column (name="SCSC_BCT_ID")
	private Integer scscBctId;
	
	@Column (name="SCSC_BPR_ID")
	private Integer scscBprId;
	
	@Column (name="SCSC_DESC", length=60)
	private String scscBprDesc;
	
	@Column (name="SCSC_TYPE", length=1)
	private String scscType;
	
	@Column (name="SCSC_SCIN_ID", length=1)
	private String scscScinId;
	
	@Column (name="SCSC_SCORE", length=1)
	private Integer scscScore;
	
	@Column (name="SCSC_MULTI", length=1)
	private String scscMultid;
	
	@Column (name="SCSC_VISBLE", length=1)
	private String scscVisible;
	
	@Column (name="SCSC_CREATED_BY", length=30)
	private String scscCreatedBy;
	
	@Column (name="SCSC_CREATED_DATE", length=1)
	private Date scscCreatedDate;
	
	@Column (name="SCSC_UPDATE_BY", length=30)
	private String scscUpdatedBy;
	
	@Column (name="SCSC_UPDATE_DATE", length=1)
	private String scscUpdatedDate;

}
