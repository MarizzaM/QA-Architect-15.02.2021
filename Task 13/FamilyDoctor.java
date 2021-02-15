package com.example;

import lombok.Getter;
import lombok.Setter;

public class FamilyDoctor {
    private @Getter @Setter boolean m_is_occupied;
    private @Getter String m_clinic;

    void acceptClient(){
        if (m_is_occupied)
            System.out.println("The doctor is busy");
        else {
            m_is_occupied = true;
            System.out.println("Welcome!");
        }
    }

    void finishAppointment(){
        m_is_occupied = true;
    }
}
