package scoring.score.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "SCORE_VALUE_MULTI")
@IdClass(ScoreValueMultiCompKey.class)
public class ScoreValueMulti {
		
	@Id
	@Column (name="SVM_ID")
	private Integer svmId;
	
	@Id
	@Column (name="SVM_SCSC_ID")
	private Integer svmScscId;
	
	@Column (name="SVM_VALUE_FROM")
	private Integer svmValueFrom;
	
	@Column (name="SVM_VALUE_TO")
	private Integer svmValueTo;
	
	@Column (name="SVM_SCORE")
	private Integer svmScore;
	
	@Column (name="SVM_VISBLE")
	private String svmVisible;
	
	@Column (name="SVM_CREATE_BY")
	private Integer svmCreateBy;
	
	@Column (name="SVM_CREATE_DATE")
	private String svmCreateDate;
	
	@Column (name="SVM_UPDATE_BY")
	private Integer svmUpdateBy;
	
	@Column (name="SVM_UPDATE_DATE")
	private String svmUpdateDate;

	    

}