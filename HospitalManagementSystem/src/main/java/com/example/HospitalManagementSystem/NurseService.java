package com.example.HospitalManagementSystem;

import org.springframework.stereotype.Service;

@Service
public class NurseService {
    NurseRepositiory nurseRepositiory=new NurseRepositiory();
    public String addNurse(Nurse nurse){
        if(nurse.getnurseId()<0){
            return "enter the valid Id ";
        }
        if(nurse.getname().equals(null)){
            return "return should not be null";
        }
        String ans = nurseRepositiory.addNurse(nurse);
        return ans;
    }

//    @GetMapping("/getList")
//    public List<Nurse> getAllNurses(){
//       return
//    }

}
