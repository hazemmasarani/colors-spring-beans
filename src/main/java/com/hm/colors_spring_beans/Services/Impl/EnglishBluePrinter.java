package com.hm.colors_spring_beans.Services.Impl;

import org.springframework.stereotype.Component;

import com.hm.colors_spring_beans.Services.BluePrinter;

@Component
public class EnglishBluePrinter implements BluePrinter {
    @Override
    public String print() {
        return "Blue";
    }
}
