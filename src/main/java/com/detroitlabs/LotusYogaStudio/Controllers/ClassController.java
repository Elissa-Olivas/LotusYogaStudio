package com.detroitlabs.LotusYogaStudio.Controllers;

import com.detroitlabs.LotusYogaStudio.Model.Classes;
import com.detroitlabs.LotusYogaStudio.Model.Day;
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
    @RequestMapping("/classes") //not able to get images to work
    public String allClasses(ModelMap modelMap) {
        List<Classes> classes = classesRepository.getAllClasses();
        //Images classImages = imageRepository.setPic();
        modelMap.put("classes", classes);
        //modelMap.put("classimage", classImages);
        return "classes";
    }

    //CLASS DETAILS PAGE
    @RequestMapping("/classes/{nameOfClass}") //dosent work
    public String allClasses(@PathVariable String nameOfClass, ModelMap modelMap) {
        Classes classes = classesRepository.listClassByName(nameOfClass);
//        Images images= imageRepository.setPic(classes.getPicID());
        modelMap.put("classes", classes);
//        modelMap.put("classimage", images);
        return "class-details";
    }
    //SCHEDULES PAGE
    @RequestMapping("/schedule") // dosent work
    public String classSchedule(ModelMap modelMap) {
        List<Classes> schedule = classesRepository.getAllClasses();
        List<Day> days = classesRepository.getAllDays();
        modelMap.put("schedule", schedule);
        modelMap.put("day", days);
        return "schedule";
    }

    //INSTRUCTORS PAGE
    @RequestMapping("/instructors") //cant get photos to appear
    public String allInstructors(ModelMap modelMap) {
        modelMap.put("instructors", classesRepository.getAllInstructors());
//        modelMap.put("images", imageRepository.setPic();
        return "instructors";
    }

    //CONTACT PAGE
    @RequestMapping("/contact")
    public String contactUs(ModelMap modelMap) {
        modelMap.put("contact", classesRepository.getCompanyInfo());
        return "contact";
    }

}
