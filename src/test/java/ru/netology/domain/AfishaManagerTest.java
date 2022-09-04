package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {

    AfishaManager afisha = new AfishaManager(10);

    @Test
    public void shouldAddNewMovie() {

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5"};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddAndFindAll() {

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastUnderLimit() {

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");

        String[] expected = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastAboveLimit() {

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");
        afisha.add("Movie 6");
        afisha.add("Movie 7");
        afisha.add("Movie 8");
        afisha.add("Movie 9");
        afisha.add("Movie 10");
        afisha.add("Movie 11");

        String[] expected = {"Movie 11", "Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
