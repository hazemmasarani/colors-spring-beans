package com.hm.colors_spring_beans;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hm.colors_spring_beans.Services.ColorPrinter;
import com.hm.colors_spring_beans.Services.Impl.ColorPrinterImpl;

@SpringBootApplication
@Slf4j
public class ColorsSpringBeansApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ColorsSpringBeansApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		final ColorPrinter colorPrinter = new ColorPrinterImpl();
		log.info("ColorPrinter instance created: " + colorPrinter.print());
	}

}
