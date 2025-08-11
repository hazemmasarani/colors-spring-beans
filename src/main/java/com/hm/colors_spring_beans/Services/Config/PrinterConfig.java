package com.hm.colors_spring_beans.Services.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hm.colors_spring_beans.Services.BluePrinter;
import com.hm.colors_spring_beans.Services.ColorPrinter;
import com.hm.colors_spring_beans.Services.GreenPrinter;
import com.hm.colors_spring_beans.Services.RedPrinter;
import com.hm.colors_spring_beans.Services.Impl.ColorPrinterImpl;
import com.hm.colors_spring_beans.Services.Impl.EnglishBluePrinter;
import com.hm.colors_spring_beans.Services.Impl.EnglishGreenPrinter;
import com.hm.colors_spring_beans.Services.Impl.EnglishRedPrinter;

@Configuration
public class PrinterConfig {
    
    @Bean
    public BluePrinter bluePrinter() {
        return new EnglishBluePrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new EnglishGreenPrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new EnglishRedPrinter();
    }

    @Bean
    ColorPrinter colorPrinter(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
        return new ColorPrinterImpl(redPrinter, greenPrinter, bluePrinter);
    }

}
