package com.medapp.utils;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.medapp.modal.ConcernTopics;
import com.medapp.modal.Doctor;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AppUtils {


    public static LayoutInflater getInflater(ViewGroup parent) {
        return LayoutInflater.from(parent.getContext());
    }

    @Nullable
    public static List<ConcernTopics> getList() {
        List<ConcernTopics> concernTopicsList = new ArrayList<>();
        concernTopicsList.add(new ConcernTopics("Women's health"));
        concernTopicsList.add(new ConcernTopics("Skin & Hair"));
        concernTopicsList.add(new ConcernTopics("Child Specialist"));
        concernTopicsList.add(new ConcernTopics("General Physician"));
        concernTopicsList.add(new ConcernTopics("Dental Care"));
        concernTopicsList.add(new ConcernTopics("Ear Nose Throat"));
        concernTopicsList.add(new ConcernTopics("Homeopathy"));
        concernTopicsList.add(new ConcernTopics("Sex Specialist"));
        concernTopicsList.add(new ConcernTopics("Eye Specialist"));
        concernTopicsList.add(new ConcernTopics("Digestive Issue"));
        concernTopicsList.add(new ConcernTopics("Mental Wellness"));
        concernTopicsList.add(new ConcernTopics("Physiotherapy"));
        concernTopicsList.add(new ConcernTopics("Diabetes Management"));
        concernTopicsList.add(new ConcernTopics("Brain and Nerves"));
        concernTopicsList.add(new ConcernTopics("General Surgery"));
        concernTopicsList.add(new ConcernTopics("Lungs and Breathing"));
        concernTopicsList.add(new ConcernTopics("Heart"));
        concernTopicsList.add(new ConcernTopics("Cancer"));
        return concernTopicsList;
    }

    @Nullable
    public static List<Doctor> getDemoDocList() {
        List<Doctor> doctors = new ArrayList<>();
        for (int a = 0; a < 5; a++) {
            doctors.add(new Doctor("Hari Prasad", "Speciality"));
        }
        return doctors;
    }
}
