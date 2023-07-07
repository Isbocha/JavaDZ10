package ru.netology.filmsManager.manager;

public class FilmManager {
    private FilmsItem[] items = new FilmsItem[0];
    private int limit;

    public FilmManager() {
        this.limit = 5;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void add(FilmsItem item) {
        FilmsItem[] tmp = new FilmsItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public FilmsItem[] getItems() {
        return items;
    }

    public FilmsItem[] findAll() {
        FilmsItem[] all = getItems();
        FilmsItem[] reversed = new FilmsItem[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }


    public FilmsItem[] findLast() {
        int resultLength;
        if (items.length < limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        FilmsItem[] reversed = new FilmsItem[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed;
    }
}
