package com.detroitlabs.LotusYogaStudio.Controllers;

import com.detroitlabs.LotusYogaStudio.Model.Classes;
import com.detroitlabs.LotusYogaStudio.Model.Images;
import com.detroitlabs.LotusYogaStudio.data.ClassesRepository;
import com.detroitlabs.LotusYogaStudio.data.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
    @RequestMapping("/classes") //not able to get images to work
    public String allClasses(ModelMap modelMap) {
        List<Classes> classes = classesRepository.getAllClasses();
        modelMap.put("classes", classes);
        return "classes";
    }


    //SCHEDULES PAGE
    @RequestMapping("/schedule") // images dosent work
    public String classSchedule(ModelMap modelMap) {
        List<Classes> schedule = classesRepository.getAllClasses();
        List<Images> images = imageRepository.getALL_Images();
        modelMap.put("schedule", schedule);
        modelMap.put("image", images);
        return "schedule";
    }

    //INSTRUCTORS PAGE
    @RequestMapping("/instructors") //cant get photos to appear
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
