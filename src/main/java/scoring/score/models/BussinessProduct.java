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
@Table(name= "BUSSINESS_PRODUCT")

public class BussinessProduct {
	@Id
	@Column (name="BPR_ID", nullable = false)
	private Integer bprId;
	
	@Column (name="BPR_BCT_ID", nullable = false)
	private Integer bprBctId;
	
	@Column (name="BPR_PRODUCT_NAME", length=60)
	private String bprProdName;
	
	@Column (name="BPR_PLATFORM", length=1)
	private String bprPlatform;
	
	@Column (name="BPR_VISIBLE", length=1)
	private String bprVisible;
	
	@Column (name="BPR_CREATED_USER",length=40)
	private String bprCreateUser;
	
	@Column (name="BPR_CREATED_DATE")
	private Date bprCreatedDate;
	
	@Column (name="BPR_UPDATED_USER",length=40)
	private String bprUpdatedUser;
	
	@Column (name="BPR_UPDATED_DATE")
	private Date bprUpdatedDate;
	
	@Column (name="BPR_COY_ID",length=5)
	private String bprCoyId;

}
