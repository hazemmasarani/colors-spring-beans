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
import com.hm.colors_spring_beans.Services.Impl.SpanishBluePrinter;
import com.hm.colors_spring_beans.Services.Impl.SpanishRedPrinter;
import com.hm.colors_spring_beans.Services.Impl.SpanishGreenPrinter;

@Configuration
public class PrinterConfig {
    
    @Bean
    public BluePrinter bluePrinter() {
        return new SpanishBluePrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new SpanishGreenPrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new SpanishRedPrinter();
    }

    @Bean
    ColorPrinter colorPrinter(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
        return new ColorPrinterImpl(redPrinter, greenPrinter, bluePrinter);
    }

}
