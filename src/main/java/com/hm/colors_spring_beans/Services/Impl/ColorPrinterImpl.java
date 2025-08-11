package com.hm.colors_spring_beans.Services.Impl;

import com.hm.colors_spring_beans.Services.BluePrinter;
import com.hm.colors_spring_beans.Services.ColorPrinter;
import com.hm.colors_spring_beans.Services.GreenPrinter;
import com.hm.colors_spring_beans.Services.RedPrinter;

public class ColorPrinterImpl implements ColorPrinter{
    
    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;

    public ColorPrinterImpl() {
        this.redPrinter = new EnglishRedPrinter();
        this.greenPrinter = new EnglishGreenPrinter();
        this.bluePrinter = new EnglishBluePrinter();
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append(redPrinter.print()).append("\n");
        sb.append(greenPrinter.print()).append("\n");
        sb.append(bluePrinter.print()).append("\n");
        return sb.toString();
    }

}
