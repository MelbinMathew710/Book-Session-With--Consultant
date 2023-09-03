package com.example.BookSessionWithConsultant.Controllers;

import com.example.BookSessionWithConsultant.Models.Slot;
import com.example.BookSessionWithConsultant.Services.SlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping("slots")
public class SlotController {
    @Autowired
    private SlotService slotService;

    @PostMapping("/create")
    public ResponseEntity<Slot> createSlot(@RequestBody Slot slot) {
        Slot createdSlot = slotService.createSlot(slot);
        return ResponseEntity.ok(createdSlot);
    }

    @GetMapping("/available")
    public ResponseEntity<List<Slot>> getAvailableSlots(
            @RequestParam Long consultantId,
            @RequestParam String startTime) {

        LocalDateTime startTimeDateTime = LocalDateTime.parse(startTime); // Parsing startTime to LocalDateTime
        List<Slot> availableSlots = slotService.getAvailableSlots(consultantId, startTimeDateTime);
        return ResponseEntity.ok(availableSlots);
    }
}