package pe.Ep3.Ep3.worldcup_service.domain.entity;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
@EntityScan
@Entity(name="countries")
@Table(
        name="tbl_countries"
)
@Data
@NoArgsConstructor
@Getter
@Setter
public class country {


        @Id
        @SequenceGenerator(
                name="countries_sequence",
                sequenceName = "countries_sequence",
                allocationSize = 1
        )
        @GeneratedValue(
                strategy = GenerationType.SEQUENCE,
                generator = "countries_sequence"
        )
    private long id;
    private String country;
    private String continent;
    private String groups;

}
