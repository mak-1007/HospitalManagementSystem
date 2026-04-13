package com.example.HospitalManagementSystem;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.Doc;
import java.util.HashMap;

@RestController
@RequestMapping("/Doctor")
public class DoctorController {
    HashMap<Integer, Doctor> DoctorDB = new HashMap<>();
    public Doctor add(@RequestBody Doctor doctor){
        int key = doctor.getDoctorId();
        DoctorDB.put(key,doctor);
        return doctor;
    }
}
