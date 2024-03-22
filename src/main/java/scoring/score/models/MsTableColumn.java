package scoring.score.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name= "MS_TABLE_COLUMN")

public class MsTableColumn {
	@Id
	@Column (name="MSTC_ID")
	private Integer mstcId;
	
	@Column (name="MSTC_MST_ID")
	private Integer mstcmstId;
	
	@Column (name="MSTC_NAME",length=60,  nullable = false)
	private String mstcName;
	
	@Column (name="MSTC_CREATED_USER",length=60)
	private String mstcCreatedUser;
	
	@Column (name="MSTC_CREATED_DATE")
	private Date mstcCreatedDate;
		
	@Column (name="MSTC_UPDATED_USER",length=60)
	private String mstcUpdatedUser;
	
	@Column (name="MSTC_UPDATED_DATE")
	private Date mstcUpdatedDate;
	
	@Column (name="MSTC_ALIAS_NAME")
	private Integer mstcAliasName;

}
