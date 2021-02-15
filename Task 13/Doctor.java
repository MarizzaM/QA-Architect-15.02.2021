package com.example;

import lombok.Getter;
import lombok.Setter;

public class Doctor {
    private @Getter final int m_doctor_id;
    private @Getter String m_doctor_name;
    private @Getter @Setter String m_hospital;

    public Doctor(int m_doctor_id, String m_doctor_name, String m_hospital) {
        this.m_doctor_id = m_doctor_id;
        this.m_doctor_name = m_doctor_name;
        this.m_hospital = m_hospital;
    }
}
