package pe.Ep3.Ep3.worldcup_service.domain.entity;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class URL {
    private String country ;
    private String  players ;
    private String stadium ;

}
