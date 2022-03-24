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
            new Classes("Beginner Yoga", "Unroll your mat for an invigorating full body flow. Explore the fundamental principles and postures of Vinyasa yoga. Enjoy a set series yoga class to work every muscle, linking breath to movement at a moderate intuitive pace.", "Low", "None", "beginneryoga"),
            new Classes("Hot Yoga 1", "Turn stress into sweat. This signature class strengthens, balances and detoxifies your entire body and mind as you move through more challenging postures and connected breath. Set to an energizing playlist, you’ll power up your practice like never before.", "Medium", "Low", "mediumyoga"),
            new Classes("Hot Yoga 2", "When muscle meets yoga, Yoga Sculpt is born. Boost metabolism and build lean muscle mass as you move to upbeat tracks. You’ll combine free weights with CorePower Yoga 2 sequencing and cardio to intensify each yoga pose while mixing in strength-training moves like squats, lunges and bicep curls.", "High", "medium", "advancedyoga"));


    public static List<Classes> getAllClasses() {
        return ALL_CLASSES;
    }


    //LIST OF INSTRUCTORS
    private static final List<Instructors> ALL_INSTRUCTORS = Arrays.asList(
            new Instructors("Karina Mirski", "# of years practicing yoga: 21. # of years teaching yoga: 17. Favorite style(s) of yoga to practice/teach: vinyasa flow and one on one yoga therapy", "femaleyogateacher1"),
            new Instructors("Simon Park", "# of years practicing yoga: 13. # of years teaching yoga: 9. Favorite style(s) of yoga to practice/teach: ashtanga & vinyasa", "maleyogateacher"),
            new Instructors("Leilani Marie", "# of years practicing yoga: 12. # of years teaching yoga: 3. Favorite style(s) of yoga to practice/teach: Practice: Vinyasa Flow, Hatha, Yin Yoga and Restorative Yoga", "femaleyogateacher2"));


    public static List<Instructors> getAllInstructors() {
        return ALL_INSTRUCTORS;
    }

    //COMPANY INFO
    private Company companyInfo = new Company("Lotus Yoga Studio", "719-123-4567", "123 Vinyasa cir., Colorado Springs, CO 80910", "lotus_Yoga@lotusyogastudio.com");


    public Company getCompanyInfo() {
        return companyInfo;
    }


    //test methods
    public List<Classes> returnPicID(String picID) {
        List<Classes> picIDSearch = new ArrayList<>();
        for (Classes classes : ALL_CLASSES) {
            if (classes.getPicID().equals(picID)) {
                picIDSearch.add(classes);
            }
        }
        return picIDSearch;
    }


    public List<Classes> searchByName(String nameOfClass) {
        List<Classes> nameOfClassSearch = new ArrayList<>();
        for (Classes classes : ALL_CLASSES) {
            if (classes.getNameOfClass().equals(nameOfClass)) {
                nameOfClassSearch.add(classes);
            }
        }
        return nameOfClassSearch;
    }

}
