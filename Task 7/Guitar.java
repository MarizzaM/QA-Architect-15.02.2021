package com.example;

import lombok.Getter;
import lombok.Setter;

public class Guitar {
    private @Getter final String m_brand;
    private @Getter final boolean m_is_electric;
    private @Getter final int m_number_of_strings;
    private @Getter @Setter float m_price;
    private @Getter boolean m_is_tuned;

    public Guitar(String m_brand, boolean m_is_electric, int m_number_of_strings, float m_price, boolean m_is_tuned) {
        this.m_brand = m_brand;
        this.m_is_electric = m_is_electric;
        this.m_number_of_strings = m_number_of_strings;
        this.m_price = m_price;
        this.m_is_tuned = m_is_tuned;
    }

    public Guitar(String m_brand, boolean m_is_electric) {
        this(m_brand, m_is_electric, 6, 50, false);
    }

    public Guitar(String m_brand) {
        this(m_brand, false, 6, 50, false);
    }

    public void tuneGuitar(){
        m_is_tuned = true;
        System.out.println("The guitar is tuned!");
    }
}
