package ru.itsjava.dao;

import org.springframework.stereotype.Repository;
import ru.itsjava.domain.Film;

@Repository
public class FilmDaoImplSimple implements FilmDao{

    @Override
    public Film getFilmById(long filmId) {
        System.out.println("It's DAO");
        return new Film("Back to the future", 1985);
    }
}
