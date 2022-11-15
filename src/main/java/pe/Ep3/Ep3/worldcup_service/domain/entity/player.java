package pe.Ep3.Ep3.worldcup_service.domain.entity;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@EntityScan
@Entity(name="player")
@Table(
        name="tbl_player"
)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class player {
    @Id
    @SequenceGenerator(
            name="player_sequence",
            sequenceName = "player_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "player_sequence"
    )
    private long id;
    private String Player;
    private String country;
    private int age;
}
