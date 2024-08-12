package scoring.score.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "GRADE_VALUE")
@IdClass(GradeValueCompKey.class)
public class GradeValue {
	
	@Id
	@Column (name="GRVL_ID", nullable = false)
	private Integer grGrvlId;
	
	@Id
	@Column (name="GRVL_GRGR_ID", nullable = false)
	private Integer grGrvlGrGrId;
	
	@Column (name="GRGR_DESC", length=20)
	private String grGrvlDesc;	

	@Column (name="GRVL_FROM", nullable = false)
	private Integer grGrvlFrom;
	
	@Column (name="GRVL_TO", nullable = false)
	private Integer grGrvlTo;
	
	@Column (name="GRVL_CREATE_BY", length=20)
	private String grGrvlCreateBy;
	
	@Column (name="GRVL_CREATE_DATE", length=20)
	private Date grGrvlCreateDate;
	
	@Column (name="GRVL_UPDATE_BY", length=20)
	private String grGrvlUpdateBy;
	
	@Column (name="GRVL_UPDATE_DATE", length=20)
	private Date grGrvlUpdateDate;
	
	@Column (name="GRVL_COY_ID", length=5)
	private String grGrvlCoyId;
	
}
