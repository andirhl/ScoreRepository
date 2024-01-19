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
@Table(name= "MS_TABLE")


public class MsTable {
	@Id
	@Column (name="MST_ID")
	private Integer mstId;
	
	@Column (name="MST_NAME",length=60,  nullable = false)
	private String mstName;
	
	@Column (name="MST_CREATED_USER",length=60,  nullable = false)
	private String mstCreatedUser;
	
	@Column (name="MST_CREATED_DATE")
	private Date mstCreatedDate;
		
	@Column (name="MST_UPDATED_USER",length=60,  nullable = false)
	private String mstUpdatedUser;
	
	@Column (name="MST_UPDATED_DATE")
	private Date mstUpdatedDate;

}
