package com.example.managingsystem.service;

import com.example.managingsystem.form.Class;
import com.example.managingsystem.form.Pupil;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
public class ManagingService {
    Class schoolClass = new Class();

    public void insert(Pupil pupil) {
        schoolClass.getSchoolClass().add(pupil);
    }

    public void update(Pupil pupil) {
        schoolClass.getSchoolClass()
                .forEach(a -> {
                    if (a.getCode().equalsIgnoreCase(pupil.getCode())) {
                        System.out.println("Changing name from " + a.getName() + " to " + pupil.getName());
                        a.setName(pupil.getName());
                    }
                });
    }

    public void delete(String code) {
        schoolClass.setSchoolClass(
            schoolClass.getSchoolClass().stream().filter(a -> a.getCode().equals(code)).collect(toList())
        );
    }

    public Class fetchClass() {
        return schoolClass;
    }
}
