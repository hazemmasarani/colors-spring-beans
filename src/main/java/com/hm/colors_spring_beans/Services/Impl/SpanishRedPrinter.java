package com.hm.colors_spring_beans.Services.Impl;

import com.hm.colors_spring_beans.Services.RedPrinter;

public class SpanishRedPrinter implements RedPrinter {
    @Override
    public String print() {
        return "Rojo"; // Spanish for Red
    }
}
