package com.example.managingsystem.controller;


import com.example.managingsystem.form.Class;
import com.example.managingsystem.form.Pupil;
import com.example.managingsystem.service.ManagingService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ManagingController {

    private final ManagingService managingService;

    public ManagingController(ManagingService managingService) {
        this.managingService = managingService;
    }

    @PostMapping
    public void insert(@RequestBody Pupil pupil) {
        managingService.insert(pupil);
    }

    @PutMapping
    public void update(@RequestBody Pupil pupil) {
        managingService.update(pupil);
    }

    @DeleteMapping
    public void delete(@RequestParam String code) {
        managingService.delete(code);
    }

    @GetMapping
    public Class fetchClass() {
        return managingService.fetchClass();
    }

}
