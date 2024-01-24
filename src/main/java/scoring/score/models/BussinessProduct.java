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
@Table(name= "BUSSINESS_CATEGORY")

public class BussinessProduct {
	@Id
	@Column (name="BPR_ID", nullable = false)
	private Integer brpId;
	
	@Column (name="BPR_BCT_ID", nullable = false)
	private Integer brpBctId;
	
	@Column (name="BPR_PRODUCT_NAME", length=60)
	private String brpProdName;
	
	@Column (name="BPR_PLATFORM", length=1)
	private String brpPlatform;
	
	@Column (name="BPR_VISIBLE", length=1)
	private String brpVisible;
	
	@Column (name="BPR_CREATED_USER",length=40)
	private String brpCreateUser;
	
	@Column (name="BPR_CREATED_DATE")
	private Date brpCreatedDate;
	
	@Column (name="BPR_UPDATED_USER",length=40)
	private String brpUpdatedUser;
	
	@Column (name="BPR_UPDATED_DATE")
	private Date brpUpdatedDate;	

}
