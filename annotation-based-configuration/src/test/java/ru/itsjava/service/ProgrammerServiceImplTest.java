package ru.itsjava.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@DisplayName("Класс ProgrammerServiceImpl:")
public class ProgrammerServiceImplTest {

    NotebookService notebookService = Mockito.mock(NotebookServiceImpl.class);


    @DisplayName(" должен иметь корректный toString")
    @Test
    public void shouldHaveCorrectToString(){
        Mockito.when(notebookService.toString()).thenReturn("note");
        ProgrammerServiceImpl programmerService =
                new ProgrammerServiceImpl(notebookService);

        Assertions.assertEquals("ProgrammerServiceImpl{" +
            "notebookService=note}",programmerService.toString());
    }

}
