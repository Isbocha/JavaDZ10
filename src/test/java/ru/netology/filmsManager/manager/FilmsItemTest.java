package ru.netology.filmsManager.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FilmsItemTest {
    FilmsItem film = new FilmsItem(1, 7, "img", "Фильм", "комедия");

    @Test
    public void testIDFilm() {
        Assertions.assertEquals(1, film.getId());
        Assertions.assertEquals(7, film.getFilmId());
        Assertions.assertEquals("img", film.getImageUrl());
        Assertions.assertEquals("Фильм", film.getName());
        Assertions.assertEquals("комедия", film.getGenre());
    }

    @Test
    public void setId() {
        FilmsItem film = new FilmsItem();
        film.setId(7);
        int expected = 7;
        int actual = film.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setFilmId() {
        FilmsItem film = new FilmsItem();
        film.setFilmId(257);
        int expected = 257;
        int actual = film.getFilmId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIMG() {
        FilmsItem film = new FilmsItem();
        film.setImageUrl("тут картинка");
        String expected = "тут картинка";
        String actual = film.getImageUrl();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setName() {
        FilmsItem film = new FilmsItem();
        film.setName("тут название");
        String expected = "тут название";
        String actual = film.getName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setGenre() {
        FilmsItem film = new FilmsItem();
        film.setGenre("тут жанр");
        String expected = "тут жанр";
        String actual = film.getGenre();
        Assertions.assertEquals(expected, actual);
    }
}