package com.example.HospitalManagementSystem;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Nurse")
public class NurseController {
    NurseService ns = new NurseService();

    //Add Nurse API

    @PostMapping("/add")
    public String add(@RequestBody Nurse nurse) {
        String ans = ns.addNurse(nurse);
        return ans;

    }
}
