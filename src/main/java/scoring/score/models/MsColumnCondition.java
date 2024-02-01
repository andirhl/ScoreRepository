package scoring.score.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name= "MS_COLUMN_CONDITION")

public class MsColumnCondition {
	@Id
	@Column (name="MCC_ID")
	private Integer mccId;
	
	@Column (name="MCC_MSTC_ID")
	private Integer mccmstcId;
	
	@Column (name="MCOLMST_ID")
	private Integer mcolmstId;
	
	@Column (name="MCC_NAME",length=60, nullable = false)
	private String mccName;
	
	@Column (name="MCC_SIGN",length=5)
	private String mccSign;
	
	@Column (name="MCC_VALUE",length=60)
	private String mccValue;
	
	@Column (name="MCC_CONDITION",length=60)
	private String mccCondition;
	
	@Column (name="MCC_SIGN1",length=5)
	private String mccSign1;
	
	@Column (name="MCC_VALUE2",length=60)
	private String mccValue2;
	
	@Column (name="MCC_VISIBLE",length=1)
	private String mccVisible;
	
	@Column (name="MCC_CREATED_USER",length=60)
	private String mccCreatedUser;
	
	@Column (name="MCC_CREATED_DATE")
	private Date mccCreatedDate;
		
	@Column (name="MCC_UPDATED_USER",length=60)
	private String mccUpdatedUser;
	
	@Column (name="MCC_UPDATED_DATE")
	private Date mccUpdatedDate;

	

}
