package com.example.managingsystem.form;

public class Pupil {

    String code;

    String name;

    public Pupil(
            String code,
            String name) {

        this.code = code;
        this.name = name;
    }

    public Pupil() {
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
