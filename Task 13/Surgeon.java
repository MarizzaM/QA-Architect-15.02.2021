package com.example;

import lombok.Getter;
import lombok.Setter;

public class Surgeon extends Doctor{
    private @Getter @Setter String m_department;
    private @Getter @Setter int m_yearsOfExperience;

    public Surgeon(int m_doctor_id, String m_doctor_name, String m_hospital, String m_department, int m_yearsOfExperience) {
        super(m_doctor_id, m_doctor_name, m_hospital);
        this.m_department = m_department;
        this.m_yearsOfExperience = m_yearsOfExperience;
    }

    void operate(){
        System.out.println(String.format("Starting to operate " +
                "in the department %s %d years ago", m_department, m_yearsOfExperience));
    }
}
