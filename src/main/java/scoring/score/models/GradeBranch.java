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
@Table(name= "GRADE_BRANCH")

public class GradeBranch {
	
	@Id
	@Column (name="GRBR_ID", nullable = false)
	private Integer grbrId;
	
	@Column (name="GRBR_GRGR_ID")
	private Integer grbrGrgrId;
	
	@Column (name="GRBR_FMO_OFFICE_CODE", length=20)
	private String grbrFmoOfficeCode;
	
	@Column (name="GRVL_FROM")
	private Integer grvlFrom;
	
	@Column (name="GRVL_TO")
	private Integer grvlTo;
	
	@Column (name="GRVL_CREATE_BY",length=20)
	private String grvlCreateBy;
	
	@Column (name="GRVL_CREATE_DATE")
	private Date grvlCreateDate;
	
	@Column (name="GRVL_UPDATE_BY",length=20)
	private String grvlUpdateBy;
	
	@Column (name="GRVL_UPDATE_DATE")
	private Date grvlUpdateDate;
	
	@Column (name="GRVL_VISBLE", length=1)
	private String grvlVisble;

}
