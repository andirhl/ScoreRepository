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
@Table(name= "MS_BASE_QUERY")
public class MsBaseQuery {
	
	@Id
	@Column (name="MBQ_ID")
	private Integer mbqId;
	
	@Column (name="MBQ_NAME",length=60,  nullable = false)
	private String mbqName;
	
	@Column (name="MBQ_QUERY",length=2000, nullable = false)
	private String mbqQuery;
	
	@Column (name="MBQ_VISIBLE",length=1,  nullable = false)
	private String mbqVisible;
	
	@Column (name="MBQ_CREATED_USER",length=60,  nullable = false)
	private String mbqCreatedUser;
	
	@Column (name="MBQ_CREATED_DATE")
	private Date mbqCreatedDate;
	
	@Column (name="MBQ_UPDATED_USER",length=60,  nullable = false)
	private String mbqUpdatedUser;
	
	@Column (name="MBQ_UPDATED_DATE")
	private Date mbqUpdatedDate;
	
	@Column (name="MBQ_COY_ID",length=5)
	private String mbqCoyId;

}
