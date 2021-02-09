package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.service.NotebookService;
import ru.itsjava.service.NotebookServiceImpl;
import ru.itsjava.service.ProgrammerService;

@ComponentScan({"ru.itsjava"})
public class MyApp {

    public static void main(String[] args) {
                new AnnotationConfigApplicationContext(MyApp.class)
                        .getBean("programmerServiceImpl", ProgrammerService.class)
                        .printItems();
    }

}

//1. Удалить пакет configuration
//2. Проставить аннотацию @Service над реализациями сервисов