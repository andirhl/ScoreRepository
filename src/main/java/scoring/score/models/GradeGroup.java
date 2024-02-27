package scoring.score.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "GRADE_GROUP")
public class GradeGroup {
	
	@Id
	@Column (name="GRGR_ID", nullable = false)
	private Integer grGrId;
	
	@Column (name="GRGR_DESC", length=60)
	private String grGrDesc;
	
	@Column (name="GRGR_BCT_ID")
	private Integer grGrBctId;
	
	@Column (name="GRGR_BPR_ID")
	private Integer grGrBprId;
	
	@Column (name="GRGR_BPR_PLATFORM", length=1)
	private String grGrBprPlatform;
	
	@Column (name="GRGR_ACTIVATE", length=1)
	private String grGrActivate;
	
	@Column (name="GRGR_MULTI_BRANCH", length=1)
	private String grGrMultiBranch;
	
	@Column (name="GRGR_APPROVED_BY", length=20)
	private String grGrApprBy;
	
	@Column (name="GRGR_APPROVED_DATE")
	private Date grGrApprDate;
	
	@Column (name="GRGR_CREATE_BY", length=20)
	private String grGrCreateBy;
	
	@Column (name="GRGR_CREATE_DATE")
	private Date grGrCreateDate;
	
	@Column (name="GRGR_UPDATE_BY", length=20)
	private String grGrUpdateBy;
	
	@Column (name="GRGR_UPDATE_DATE")
	private Date grGrUpdateDate;

}
