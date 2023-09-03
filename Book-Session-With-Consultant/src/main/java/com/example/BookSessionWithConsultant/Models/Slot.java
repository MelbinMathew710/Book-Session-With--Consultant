package com.example.BookSessionWithConsultant.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Slot {
    private Long id;
    private Long consultantId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean booked;
}