package pe.Ep3.Ep3.worldcup_service.infrastructure.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.Ep3.Ep3.worldcup_service.domain.entity.URL;
import pe.Ep3.Ep3.worldcup_service.domain.entity.country;
import pe.Ep3.Ep3.worldcup_service.application.Service.worldcupService;
import pe.Ep3.Ep3.worldcup_service.domain.entity.player;
import pe.Ep3.Ep3.worldcup_service.domain.entity.stadium;
import pe.Ep3.Ep3.worldcup_service.infrastructure.request.playerRequest;
import pe.Ep3.Ep3.worldcup_service.infrastructure.response.BasicResponse;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class worldcupController {
    @Autowired
    private worldcupService worldcupService;

    @GetMapping
    @RequestMapping("/worldcup")
    public URL getRes()
    {
        return worldcupService.getURL();
    }

    @GetMapping
    @RequestMapping("/worldcup/countries")
    public List<country> getCountry()
    {
        return worldcupService.getCountries();
    }
    @GetMapping
    @RequestMapping("/worldcup/players")
    public List<player> getPlayers()
    {
        return worldcupService.getPlayers();
    }
    @GetMapping
    @RequestMapping("/worldcup/stadium")
    public List<stadium> getStadium()
    {
        return worldcupService.getStadium();
    }

    @PostMapping
    @RequestMapping("/mundial/jugadores/add")
    public BasicResponse addJugador (@RequestBody playerRequest request)  {
        return worldcupService.registerPlayer(request);
    }

    //api/v1/mundial/jugadores/add

  /*  @PostMapping
    @RequestMapping("/addCliente")
    public  BasicResponse addCliente (@RequestBody playerRequest request, @RequestParam int ApiKey)
    {
        BasicResponse response=clientService.registrarCliente(request,ApiKey);
       return response;
    }*/
}
