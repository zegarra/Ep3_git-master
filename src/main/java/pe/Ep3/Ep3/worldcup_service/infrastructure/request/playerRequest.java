package pe.Ep3.Ep3.worldcup_service.infrastructure.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class playerRequest {
    private String Player;
    private String country;
    private int age;
}
