package com.detroitlabs.LotusYogaStudio.Controllers;

import com.detroitlabs.LotusYogaStudio.Model.Classes;
import com.detroitlabs.LotusYogaStudio.Model.Images;
import com.detroitlabs.LotusYogaStudio.data.ClassesRepository;
import com.detroitlabs.LotusYogaStudio.data.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClassController {

    @Autowired
    private ClassesRepository classesRepository;

    @Autowired
    private ImageRepository imageRepository;


    //HOME PAGE
    @RequestMapping("/")
    public String displayHome() {
        return "home";
    }

    //CLASSES PAGE
    @RequestMapping("/classes")
    public String allClasses(ModelMap modelMap) {
        List<Classes> classes = classesRepository.getAllClasses();
        //Images classImages = imageRepository.setPic();
        modelMap.put("classes", classes);
        //modelMap.put("classimage", classImages);
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
