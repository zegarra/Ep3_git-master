package pe.Ep3.Ep3.worldcup_service.domain.entity;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@EntityScan
@Entity(name="stadium")
@Table(
        name="tbl_stadium"
)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class stadium {

    @Id
    @SequenceGenerator(
            name="stadium_sequence",
            sequenceName = "stadium_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "stadium_sequence"
    )
    private long id;
    private String stadium;
    private String city;
}
