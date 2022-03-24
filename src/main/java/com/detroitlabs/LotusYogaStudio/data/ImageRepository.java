package com.detroitlabs.LotusYogaStudio.data;

import com.detroitlabs.LotusYogaStudio.Model.Images;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ImageRepository {


    private static final List<Images> ALL_Images = Arrays.asList(
            new Images("beginneryoga", "beginner"),
            new Images("mediumyoga", "medium"),
            new Images("advancedyoga", "advanced"),
            new Images("femaleyogateacher1", "teacher1"),
            new Images("femaleyogateacher2", "teacher2"),
            new Images("maleyogateacher", "teacher3"));


    public static List<Images> getALL_Images() {
        return ALL_Images;
    }

    //find by name
    public Images setPic(String picId) {
        for (Images images: ALL_Images) {
            if (images.getPicID().equals(picId)) {
                return images;
            }
        }
        return null;
    }


}
