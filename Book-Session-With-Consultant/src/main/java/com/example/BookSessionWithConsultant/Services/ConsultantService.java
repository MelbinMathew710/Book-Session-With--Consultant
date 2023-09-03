package com.example.BookSessionWithConsultant.Services;

import com.example.BookSessionWithConsultant.Models.Consultant;
import com.example.BookSessionWithConsultant.Repositories.ConsultantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ConsultantService {
    @Autowired
    private ConsultantRepository consultantRepository;

    public Consultant saveConsultant(Consultant consultant) {
        return consultantRepository.save(consultant);
    }

    public Consultant getConsultantById(Long id) {
        return consultantRepository.findById(id);
    }

    public Map<Long, Consultant> getAllConsultants() {
        return consultantRepository.getAllConsultants();
    }
}