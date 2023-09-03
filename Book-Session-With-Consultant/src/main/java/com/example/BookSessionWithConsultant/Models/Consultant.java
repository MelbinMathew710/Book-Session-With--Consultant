package com.example.BookSessionWithConsultant.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Consultant extends User {
    private int experience;
    private String areaOfExpertise;
    private List<Slot> slots;
}