package scoring.score.models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ScoreCompKey implements Serializable {

	    private Integer scscId;

	    private Integer scscBctId;

	    private Integer scscBprId;
}
