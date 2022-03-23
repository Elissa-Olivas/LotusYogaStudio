package com.detroitlabs.LotusYogaStudio.data;

import com.detroitlabs.LotusYogaStudio.Model.Classes;
import com.detroitlabs.LotusYogaStudio.Model.Company;
import com.detroitlabs.LotusYogaStudio.Model.Instructors;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassesRepository {

    //NEED TO ADD PIC ID FOR CONSTRUCTORS
    private static final List<Classes> ALL_CLASSES = Arrays.asList(
            new Classes("Beginner Yoga", "Unroll your mat for an invigorating full body flow. Explore the fundamental principles and postures of Vinyasa yoga. Enjoy a set series yoga class to work every muscle, linking breath to movement at a moderate intuitive pace.", "Low", "None", "08:00 am", "NEED TO ADD ID"),
            new Classes("Beginner Yoga", "Unroll your mat for an invigorating full body flow. Explore the fundamental principles and postures of Vinyasa yoga. Enjoy a set series yoga class to work every muscle, linking breath to movement at a moderate intuitive pace.", "Low", "None", "02:45 pm", ""),
            new Classes("Beginner Yoga", "Unroll your mat for an invigorating full body flow. Explore the fundamental principles and postures of Vinyasa yoga. Enjoy a set series yoga class to work every muscle, linking breath to movement at a moderate intuitive pace.", "Low", "None", "03:00 pm", ""),
            new Classes("Hot Yoga 1", "Turn stress into sweat. This signature class strengthens, balances and detoxifies your entire body and mind as you move through more challenging postures and connected breath. Set to an energizing playlist, you’ll power up your practice like never before.", "Medium", "Low", "09:00 am", ""),
            new Classes("Hot Yoga 1", "Turn stress into sweat. This signature class strengthens, balances and detoxifies your entire body and mind as you move through more challenging postures and connected breath. Set to an energizing playlist, you’ll power up your practice like never before.", "Medium", "Low", "07:15 am", ""),
            new Classes("Hot Yoga 1", "Turn stress into sweat. This signature class strengthens, balances and detoxifies your entire body and mind as you move through more challenging postures and connected breath. Set to an energizing playlist, you’ll power up your practice like never before.", "Medium", "Low", "03:45 pm", ""),
            new Classes("Hot Yoga 1", "When muscle meets yoga, Yoga Sculpt is born. Boost metabolism and build lean muscle mass as you move to upbeat tracks. You’ll combine free weights with CorePower Yoga 2 sequencing and cardio to intensify each yoga pose while mixing in strength-training moves like squats, lunges and bicep curls.", "Medium", "Low", "06:00 am", ""),
            new Classes("Hot Yoga 1", "When muscle meets yoga, Yoga Sculpt is born. Boost metabolism and build lean muscle mass as you move to upbeat tracks. You’ll combine free weights with CorePower Yoga 2 sequencing and cardio to intensify each yoga pose while mixing in strength-training moves like squats, lunges and bicep curls.", "Medium", "Low", "08:30 am", ""),
            new Classes("Hot Yoga 1", "When muscle meets yoga, Yoga Sculpt is born. Boost metabolism and build lean muscle mass as you move to upbeat tracks. You’ll combine free weights with CorePower Yoga 2 sequencing and cardio to intensify each yoga pose while mixing in strength-training moves like squats, lunges and bicep curls.", "Medium", "Low", "06:00 pm", ""));


    public static List<Classes> getAllClasses() {
        return ALL_CLASSES;
    }


    //LIST OF INSTRUCTORS - NEED PIC ID
    private static final List<Instructors> ALL_INSTRUCTORS = Arrays.asList(
            new Instructors("Ellie May", "# of years practicing yoga: 21. # of years teaching yoga: 17. Favorite style(s) of yoga to practice/teach: vinyasa flow and one on one yoga therapy", "PICID"),
            new Instructors("John", "# of years practicing yoga: 13. # of years teaching yoga: 9. Favorite style(s) of yoga to practice/teach: ashtanga & vinyasa", "PICID"),
            new Instructors("Leilani Marie", "# of years practicing yoga: 12. # of years teaching yoga: 3. Favorite style(s) of yoga to practice/teach: Practice: Vinyasa Flow, Hatha, Yin Yoga and Restorative Yoga", "PICID"));


    public static List<Instructors> getAllInstructors() {
        return ALL_INSTRUCTORS;
    }

    //COMPANY INFO
    private Company companyInfo = new Company("Lotus Yoga", "719-123-4567", "123 Vinyasa circ, Colorado Springs, CO 80910", "lotus_Yoga@lotusyogastudio.com");


    public Company getCompanyInfo() {
        return companyInfo;
    }


    //CREATE OTHER METHODS
    //Method classByName - call class by the name
    public List<Classes> listClassByName(String name) {
        List<Classes> classByName = new ArrayList<>();
        for(Classes className: ALL_CLASSES) {
            if (className.getNameOfClass().equals(name)) {
                classByName.add(className);
            }
        }
        return classByName;
    }

    //        Method classByTime - call class by the time
    public List<Classes> listClassByTime(String timeOfClass) {
        List<Classes> classByTime = new ArrayList<>();
        for(Classes classTime: ALL_CLASSES) {
            if (classTime.getTimeOfClass().equals(timeOfClass)) {
                classByTime.add(classTime);
            }
        }
        return classByTime;
    }
    //method for class by Day?????


    //        Method classByInstructor - call class by instructor that teaches it
    public List<Instructors> listClassByInstructor(String name) {
        List<Instructors> classByInstructor = new ArrayList<>();
        for(Instructors classInstructors: ALL_INSTRUCTORS) {
            if (classInstructors.getNameOfInstructor().equals(name)) {
                classByInstructor.add(classInstructors);
            }
        }
        return classByInstructor;
    }

}
