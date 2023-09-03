package com.example.BookSessionWithConsultant.Repositories;

import com.example.BookSessionWithConsultant.Models.Consultant;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ConsultantRepository {
    private final Map<Long, Consultant> consultants = new HashMap<>();
    private Long consultantIdCounter = 1L;

    public Consultant save(Consultant consultant) {
        consultant.setId(consultantIdCounter++);
        consultants.put(consultant.getId(), consultant);
        return consultant;
    }

    public Consultant findById(Long id) {
        return consultants.get(id);
    }

    public Map<Long, Consultant> getAllConsultants() {
        return consultants;
    }
}