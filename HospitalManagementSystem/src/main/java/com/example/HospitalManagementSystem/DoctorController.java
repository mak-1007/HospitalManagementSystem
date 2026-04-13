package com.example.HospitalManagementSystem;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/Doctor")
public class DoctorController {
    HashMap<Integer, Doctor> DoctorDB = new HashMap<>();
//    @PostMapping("/addDoctor")
//    public Doctor addDoctor(@RequestBody Doctor doctor){
//        int doctorId = doctor.getname();
//        return doctor;
//    }
}
