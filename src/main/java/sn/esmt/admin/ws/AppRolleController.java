package sn.esmt.admin.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.admin.dao.AppRolleRepository;
import sn.esmt.admin.entities.AppRolleEntity;

import java.util.List;

@RestController
@RequestMapping(value = "/rolles")
@AllArgsConstructor
public class AppRolleController {

    private AppRolleRepository appRolleRepository;

    @PostMapping(path = "/save")
    public AppRolleEntity save(@RequestBody AppRolleEntity appRolleEntity){
        return appRolleRepository.save(appRolleEntity);

    }

    @GetMapping(path = "/all")
    public List<AppRolleEntity> getAll() {

        return appRolleRepository.findAll();
    }
    @GetMapping(path = "/login")
    public AppRolleEntity login(@RequestParam int id){
        return appRolleRepository.findById(id);
    }



}
