package com.hm.colors_spring_beans.Services.Impl;

import org.springframework.stereotype.Component;

import com.hm.colors_spring_beans.Services.GreenPrinter;

@Component
public class EnglishGreenPrinter implements GreenPrinter{
    
    @Override
    public String print() {
        return "Green";
    }
}
