package pe.Ep3.Ep3.worldcup_service.application.Service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.Ep3.Ep3.worldcup_service.domain.entity.URL;
import pe.Ep3.Ep3.worldcup_service.domain.entity.player;
import pe.Ep3.Ep3.worldcup_service.domain.entity.stadium;
import pe.Ep3.Ep3.worldcup_service.infrastructure.Repository.playerRepository;
import pe.Ep3.Ep3.worldcup_service.infrastructure.Repository.stadiumRepository;
import pe.Ep3.Ep3.worldcup_service.infrastructure.request.playerRequest;
import pe.Ep3.Ep3.worldcup_service.domain.entity.country;
import pe.Ep3.Ep3.worldcup_service.infrastructure.Repository.countryCupRepository;
import pe.Ep3.Ep3.worldcup_service.infrastructure.response.BasicResponse;

import java.util.List;

@Log4j2
@Service
public class worldcupServiceImp implements worldcupService {
    @Autowired
    private playerRepository PlayerRepository;
    @Autowired
    private countryCupRepository countryCupRepository;
    @Autowired
    private stadiumRepository StadiumRepository;





   /* @Override
    public BasicResponse registrarCliente(playerRequest clientRequest , int ApiKey) {
        try {
            worldcup client=new worldcup();
            client.setApiKey(1234);

            if (ApiKey!= client.getApiKey()){
                return BasicResponse.whenError("apikey incorrecto");
            }else {
                clientRepository.save(this.buildClienteFromRequest(clientRequest));
                return BasicResponse.whenSuccess();
            }
        }catch (Exception ex)
        {
            return BasicResponse.whenError(ex.getMessage());
        }
    }*/

    @Override
    public List<country> getCountries() {
        List<country> myListCountries = countryCupRepository.findAll();
        return myListCountries;
    }

    @Override
    public List<player> getPlayers() {
        List<player> myListPlayers = PlayerRepository.findAll();
        return myListPlayers;
    }

    @Override
    public List<stadium> getStadium() {
        List<stadium> myListStadium = StadiumRepository.findAll();
        return myListStadium;
    }

    @Override
    public URL getURL() {
        URL URL = new URL("https://api/v1/worldcup/countries", "https://api/v1/worldcup/players", "https://api/v1/mundial/stadiums");
        return URL;
    }

    @Override
    public BasicResponse registerPlayer(playerRequest playerAdd) {
        try {
            if (playerAdd != null &&
                !playerAdd.getPlayer().equals("") &&
                    !playerAdd.getCountry().equals("")) {
                PlayerRepository.save(this.buildPlayerFromRequest(playerAdd));
                return BasicResponse.whenSuccess();
            } else {
                return BasicResponse.playerNull();
            }

        } catch (Exception e) {
            log.error(e.getMessage());
            return BasicResponse.whenError(e.getMessage());
        }


    }

    public player buildPlayerFromRequest(playerRequest request) {
        return player.builder()
                .Player(request.getPlayer())
                .country(request.getCountry())
                .age(request.getAge()).build();
    }
}
