package ru.itsjava.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.itsjava.domain.Notebook;

@Service
public class NotebookServiceImpl implements NotebookService {


    @Override
    public Notebook getNotebook() {
        return new Notebook("Mac");
    }
}
