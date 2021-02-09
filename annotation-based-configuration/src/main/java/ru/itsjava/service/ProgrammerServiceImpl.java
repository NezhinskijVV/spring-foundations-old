package ru.itsjava.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProgrammerServiceImpl implements ProgrammerService{
    private final NotebookService notebookService;

    public ProgrammerServiceImpl(@Qualifier("notebookServiceImpl") NotebookService notebookService) {
        this.notebookService = notebookService;
    }

    @Override
    public void printItems() {
        System.out.println("Мой кабинет состоит из: " + notebookService.getNotebook());
    }

    @Override
    public String toString() {
        return "ProgrammerServiceImpl{" +
                "notebookService=" + notebookService +
                '}';
    }
}
