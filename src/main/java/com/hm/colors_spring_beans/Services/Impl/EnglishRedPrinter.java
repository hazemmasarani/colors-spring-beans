package com.hm.colors_spring_beans.Services.Impl;

import org.springframework.stereotype.Component;

import com.hm.colors_spring_beans.Services.RedPrinter;

@Component
public class EnglishRedPrinter implements RedPrinter {
    @Override
    public String print() {
        return "Red";
    }
}
