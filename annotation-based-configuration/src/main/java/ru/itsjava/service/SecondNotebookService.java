package ru.itsjava.service;

import org.springframework.stereotype.Service;
import ru.itsjava.domain.Notebook;

@Service
public class SecondNotebookService  implements NotebookService{


    @Override
    public Notebook getNotebook() {
        return null;
    }
}
