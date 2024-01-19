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

public class BussinessCategory {
	@Id
	@Column (name="BCT_ID", nullable = false)
	private Integer btcId;
	
	@Column (name="BCT_BUSSINESS_CATEGORY",length=60,  nullable = false)
	private String bctBussCategory;
	
	@Column (name="BCT_CREATED_USER",length=60)
	private String bctCreatedUser;
	
	@Column (name="BCT_CREATED_DATE")
	private Date bctCreatedDate;
		
	@Column (name="BCT_UPDATED_USER",length=60)
	private String bctUpdatedUser;
	
	@Column (name="BCT_UPDATED_DATE")
	private Date bctUpdatedDate;
	
	

}
