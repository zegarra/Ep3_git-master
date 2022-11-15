package pe.Ep3.Ep3.worldcup_service.application.Service;

import pe.Ep3.Ep3.worldcup_service.domain.entity.URL;
import pe.Ep3.Ep3.worldcup_service.domain.entity.country;
import pe.Ep3.Ep3.worldcup_service.domain.entity.player;
import pe.Ep3.Ep3.worldcup_service.domain.entity.stadium;
import pe.Ep3.Ep3.worldcup_service.infrastructure.request.playerRequest;
import pe.Ep3.Ep3.worldcup_service.infrastructure.response.BasicResponse;

import java.util.List;

public interface worldcupService {

    public List<country> getCountries();
    public List<player> getPlayers();
    public List<stadium> getStadium();
    public URL getURL();
    public BasicResponse registerPlayer(playerRequest playerRequest);
}
