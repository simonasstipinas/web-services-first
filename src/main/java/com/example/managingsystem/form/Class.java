package com.example.managingsystem.form;

import java.util.ArrayList;
import java.util.List;

public class Class {

    List<Pupil> schoolClass = new ArrayList<>();

    public Class() {
        schoolClass.add(new Pupil("CLASSCODE1", "SIMONAS"));
        schoolClass.add(new Pupil("CLASSCODE2", "KRISTUPAS"));
    }

    public List<Pupil> getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(List<Pupil> schoolClass) {
        this.schoolClass = schoolClass;
    }
}

