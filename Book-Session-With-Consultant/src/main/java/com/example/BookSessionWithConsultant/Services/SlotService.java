package com.example.BookSessionWithConsultant.Services;

import com.example.BookSessionWithConsultant.Models.Slot;
import com.example.BookSessionWithConsultant.Repositories.SlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SlotService {
    @Autowired
    private SlotRepository slotRepository;

    public Slot createSlot(Slot slot) {
        return slotRepository.save(slot);
    }

    public List<Slot> getAvailableSlots(Long consultantId, LocalDateTime startTime) {
        return slotRepository.findByConsultantAndStartTimeAfter(consultantId, startTime);
    }

}