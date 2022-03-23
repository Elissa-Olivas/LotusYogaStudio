package com.detroitlabs.LotusYogaStudio.Controllers;

import com.detroitlabs.LotusYogaStudio.data.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClassController {

    @Autowired
    private ClassesRepository classesRepository;


    //HOME PAGE
    @RequestMapping("/")
    public String displayHome() {
        return "home";
    }

    //CLASSES PAGE
    @RequestMapping("/classes")
    public String allClasses(ModelMap modelMap) {
        modelMap.put("classes", classesRepository.getAllClasses());
        return "classes";
    }


    //SCHEDULES PAGE
    @RequestMapping("/schedule")
    public String classSchedule(ModelMap modelMap) {
        modelMap.put("schedule", classesRepository.getAllClasses());  //not sure if this is right?
        return "schedule";
    }

    //INSTRUCTORS PAGE
    @RequestMapping("/instructors")
    public String allInstructors(ModelMap modelMap) {
        modelMap.put("instructors", classesRepository.getAllInstructors());
        return "instructors";
    }

    //CONTACT PAGE
    @RequestMapping("/contact")
    public String contactUs(ModelMap modelMap) {
        modelMap.put("contact", classesRepository.getCompanyInfo());
        return "contact";
    }

}
