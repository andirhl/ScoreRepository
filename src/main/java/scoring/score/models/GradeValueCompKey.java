package scoring.score.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class GradeValueCompKey implements Serializable {
	private Integer grGrvlGrGrId;	
	private Integer grGrvlId;
	
}
