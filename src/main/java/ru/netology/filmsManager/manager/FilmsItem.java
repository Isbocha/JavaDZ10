package ru.netology.filmsManager.manager;
public class FilmsItem {
    private int id;
    private int filmId;
    private String imageUrl;
    private String Name;
    private String genre;

    public FilmsItem() {
    }

    public FilmsItem(int id, int filmId, String imageUrl, String name, String genre) {
        this.id = id;
        this.filmId = filmId;
        this.imageUrl = imageUrl;
        Name = name;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
