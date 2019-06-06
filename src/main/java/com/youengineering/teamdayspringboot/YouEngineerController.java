package com.youengineering.teamdayspringboot;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class YouEngineerController {

    private final YouEngineerRepository youEngineerRepository;

    public YouEngineerController(YouEngineerRepository youEngineerRepository) {
        this.youEngineerRepository = youEngineerRepository;
    }

    @GetMapping("/youEngineers")
    public List<YouEngineer> getYouEngineers() {
        return (List<YouEngineer>) youEngineerRepository.findAll();
    }

}
