package scoring.score.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
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
@IdClass(ScoreCompKey.class)
public class ScoreValue {
	@Id
	@Column (name="SCSC_ID")
	private Integer scscId;
	
	@Id
	@Column (name="SCSC_BCT_ID")
	private Integer scscBctId;
		
	@Id
	@Column (name="SCSC_BPR_ID")
	private Integer scscBprId;
	
	@Column (name="SCSC_DESC", length=60)
	private String scscBprDesc;

	
	@Column (name="SCSC_TYPE")
	private String scscType;
	
	@Column (name="SCSC_SCIN_ID")
	private Integer scscScinId;
	
	@Column (name="SCSC_FROM")
	private Integer scscFrom;
	
	@Column (name="SCSC_TO")
	private Integer scscTo;
	
	@Column (name="SCSC_SCORE")
	private Integer scscScore;
	
	@Column (name="SCSC_MULTI", length=1)
	private String scscMultid;
	
	@Column (name="SCSC_VISBLE", length=1)
	private String scscVisible;
	
	@Column (name="SCSC_CREATED_BY", length=30)
	private String scscCreatedBy;
	
	@Column (name="SCSC_CREATED_DATE")
	private Date scscCreatedDate;
	
	@Column (name="SCSC_UPDATED_BY", length=30)
	private String scscUpdatedBy;
	
	@Column (name="SCSC_UPDATED_DATE")
	private Date scscUpdatedDate;
	
	@Column (name="SCSC_COY_ID", length=5)
	private String scscCoyId;

}
