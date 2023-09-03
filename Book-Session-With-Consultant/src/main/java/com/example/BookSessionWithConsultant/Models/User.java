package com.example.BookSessionWithConsultant.Models;

import com.example.BookSessionWithConsultant.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String email;
    private String phoneNo;
    private int age;
    private Role role;
}