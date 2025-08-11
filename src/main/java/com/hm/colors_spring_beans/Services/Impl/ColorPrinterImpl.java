package com.hm.colors_spring_beans.Services.Impl;

import org.springframework.stereotype.Component;

import com.hm.colors_spring_beans.Services.BluePrinter;
import com.hm.colors_spring_beans.Services.ColorPrinter;
import com.hm.colors_spring_beans.Services.GreenPrinter;
import com.hm.colors_spring_beans.Services.RedPrinter;

@Component
public class ColorPrinterImpl implements ColorPrinter{
    
    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;

    public ColorPrinterImpl(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
        this.redPrinter = redPrinter;
        this.greenPrinter = greenPrinter;
        this.bluePrinter = bluePrinter;
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
