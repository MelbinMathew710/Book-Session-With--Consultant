package com.example.BookSessionWithConsultant.Repositories;

import com.example.BookSessionWithConsultant.Models.Slot;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class SlotRepository {
    private final Map<Long, Slot> slots = new HashMap<>();
    private Long slotIdCounter = 1L;

    public Slot save(Slot slot) {
        slot.setId(slotIdCounter++);
        slots.put(slot.getId(), slot);
        return slot;
    }

    public List<Slot> findByConsultantAndStartTimeAfter(Long consultantId, LocalDateTime startTime) {
        List<Slot> result = new ArrayList<>();
        Map<Long, Slot> slots = getAllSlots() ;
        for (Slot slot : slots.values()) {
            if (slot.getConsultantId().equals(consultantId) &&
                    !slot.isBooked() &&
                    slot.getStartTime().isAfter(startTime)) {
                result.add(slot);
            }
        }
        return result;
    }

    public Map<Long, Slot> getAllSlots() {
        return slots;
    }


}