package com.example.BookSessionWithConsultant.Controllers;

import com.example.BookSessionWithConsultant.Models.Consultant;
import com.example.BookSessionWithConsultant.Services.ConsultantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/consultants")
public class ConsultantController {
    @Autowired
    private ConsultantService consultantService;

    @PostMapping("/register")
    public ResponseEntity<Consultant> registerConsultant(@RequestBody Consultant consultant) {
        Consultant registeredConsultant = consultantService.saveConsultant(consultant);
        return ResponseEntity.ok(registeredConsultant);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Consultant> getConsultantById(@PathVariable Long id) {
        Consultant consultant = consultantService.getConsultantById(id);
        return ResponseEntity.ok(consultant);
    }

    @GetMapping("/all")
    public ResponseEntity<Map<Long, Consultant>> getAllConsultants() {
        Map<Long, Consultant> consultants = consultantService.getAllConsultants();
        return ResponseEntity.ok(consultants);
    }
}