package com.example.HospitalManagementSystem;

import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.deser.CreatorProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class PatientController {
    HashMap<Integer, Patient> patientObj =new HashMap<>();

    @PostMapping("/addPatientViaRequestParameter")
    public String addPatient(@RequestParam("patientId")Integer patientId,@RequestParam("name")String name, @RequestParam("disease")String disease,@RequestParam("age")Integer age){
        Patient patient=new Patient(patientId,name,disease,age);
        patientObj.put(patientId,patient);
        return "patient addded sucessfully";
    }
    @PostMapping("/addPatientViaRequestBody")
    public String addPatient(@RequestBody Patient patient){
            int key =patient.getPatientId();
            patientObj.put(key,patient);

        return "patient added successfully";
    }

    @GetMapping("/getPatientInfo")
    public Patient getPatientInformation(@RequestParam("patientId") Integer patientId) {
    return patientObj.get(patientId);
    }

//    @GetMapping("/getPatientInfo")
//    public Patient getPatient(@RequestParam("patientId")Integer patientId) {
//        Patient patient = patientObj.get(patientId);
//        return patient;
//    }


    @GetMapping("/getPatientByName")
    public Patient getPatientByName(@RequestParam("name")String name) {

        for (Patient p : patientObj.values()){
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    @GetMapping("/getAllPatients")
    public List<Patient> getAllPatients(){
        return new ArrayList<>(patientObj.values());
    }

    @GetMapping ("/getPatientsListGreaterThanAge")
    public  List<Patient> getPatientsListGreaterThanAge(@RequestParam("age")Integer age){
        List<Patient> patients=new ArrayList<>();
        for (Patient p: patientObj.values()){
            if(p.getAge()>age){
                patients.add(p);
            }
        }
        return patients;
    }
}
