package scoring.score.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "SCORING_INITATION")

public class ScoringInitation {
	
	@Id
	@Column (name="SCIN_ID")
	private Integer scinId;
	
	@Column (name="SCIN_DESC",length=60,  nullable = false)
	private String scinName;
	
	@Column (name="SCIN_TYPE",length=1)
	private String scinType;
	
	@Column (name="SCIN_PARAM_ID")
	private Integer scinParamId;
	
	@Column (name="SCIN_BCT_ID")
	private Integer scinBctId;
	
	@Column (name="SCIN_BPR_ID")
	private Integer scinBprId;
	
	@Column (name="SCIN_VISBLE",length=1)
	private String scinVisible;
	
	@Column (name="SCIN_CREATED_BY",length=40)
	private String scinCreatedBy;
	
	@Column (name="SCIN_CREATED_DATE")
	private Date scinCreatedDate;
	
	@Column (name="SCIN_UPDATE_BY",length=40)
	private String scinUpdateBy;
	
	@Column (name="SCIN_UPDATE_DATE")
	private Date scinUpdateDate;
	
	@Column (name="SCIN_APPROVED_BY",length=30)
	private String scinApprovedBy;
	
	@Column (name="SCIN_APPROVED_DATE")
	private Date scinApprovedDate;

}
