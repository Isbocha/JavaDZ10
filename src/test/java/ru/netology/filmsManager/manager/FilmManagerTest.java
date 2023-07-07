package ru.netology.filmsManager.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    FilmManager manager = new FilmManager();
    FilmsItem film1 = new FilmsItem(1, 10, "img", "Фильм 1", "боевик");
    FilmsItem film2 = new FilmsItem(2, 20, "img", "Фильм 2", "мультфильм");
    FilmsItem film3 = new FilmsItem(3, 30, "img", "Фильм 3", "комедия");
    FilmsItem film4 = new FilmsItem(4, 40, "img", "Фильм 4", "ужасы");
    FilmsItem film5 = new FilmsItem(5, 50, "img", "Фильм 5", "детектив");
    FilmsItem film6 = new FilmsItem(6, 60, "img", "Фильм 6", "мелодрама");
    FilmsItem film7 = new FilmsItem(7, 70, "img", "Фильм 7", "триллер");
    FilmsItem film8 = new FilmsItem(8, 88, "img", "Фильм 8", "фантастика");

    @BeforeEach
    public void setup() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
    }

    @Test
    public void findEmptyArrayTest() { // пустой массив
        FilmManager film = new FilmManager();
        // FilmsItem[] items = {};
        FilmsItem[] expected = {};
        FilmsItem[] actual = film.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findNotEmptyArrayTest() { // не пустой массив с 1 позицией
        FilmManager newManager = new FilmManager();
        newManager.add(film7);
        FilmsItem[] expected = {film7};
        FilmsItem[] actual = newManager.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findNotEmptyArrayTest2() { // не пустой массив с 2 позициими
        FilmManager newManager = new FilmManager();
        newManager.add(film2);
        newManager.add(film5);
        FilmsItem[] expected = {film2, film5};
        FilmsItem[] actual = newManager.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllArrayTest() { // весь массив в порядке очередности
        FilmsItem[] expected = {film1, film2, film3, film4, film5, film6, film7, film8};
        FilmsItem[] actual = manager.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReversedAllItems() { //  фильмы из массиыв в обратном порядке
        FilmsItem[] expected = {film8, film7, film6, film5, film4, film3, film2, film1};
        FilmsItem[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReversedLastItems() { //  последние 5 фильмов в обратном порядке
        FilmsItem[] expected = {film8, film7, film6, film5, film4};
        FilmsItem[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReversedLastItems2() { //  заданное колличество фильмов в обратном порядке
        FilmManager newManager = new FilmManager(6);
        newManager.add(film1);
        newManager.add(film2);
        newManager.add(film3);
        newManager.add(film4);
        newManager.add(film5);
        newManager.add(film6);
        newManager.add(film7);
        newManager.add(film8);
        FilmsItem[] expected = {film8, film7, film6, film5, film4, film3};
        FilmsItem[] actual = newManager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReversedLastItems3() { //  максимальное колличество фильмов массива в обратном порядке
        FilmManager newManager = new FilmManager(6);
        newManager.add(film1);
        newManager.add(film2);
        newManager.add(film3);
        newManager.add(film4);
        newManager.add(film5);
        FilmsItem[] expected = {film5, film4, film3, film2, film1};
        FilmsItem[] actual = newManager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}