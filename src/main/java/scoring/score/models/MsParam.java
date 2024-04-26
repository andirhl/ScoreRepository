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
@Table(name= "MS_PARAM")
public class MsParam {
	
	@Id
	@Column (name="MSP_ID", nullable = false)
	private Integer mspId;
	
	@Column (name="MSP_KEY",length=100)
	private String mspKey;
	
	@Column (name="MSP_VALUE",length=3000)
	private String mspValue;
	
	@Column (name="MSP_NOTES",length=200)
	private String mspNotes;
	
	@Column (name="MSP_CREATED_BY",length=15)
	private String mspCreatedBy;
	
	@Column (name="MSP_CREATED_DATE")
	private Date mspCeatedDate;
		
	@Column (name="MSP_LASTUPDATE_BY",length=15)
	private String mspLastupdateBy;
	
	@Column (name="MSP_LASTUPDATE_DATE")
	private Date mspLastupdateDate;

}
