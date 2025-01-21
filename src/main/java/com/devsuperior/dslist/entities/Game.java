package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name= "tb_game")
public class Game {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String title;
//    modificando o nome da coluna no banco ou referenciando caso seja diferente
    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platform;
    private Double score;
    private String platforms;
    private String imgUrl;
//    definindo manualmente qual tipo do campo
    @Column(columnDefinition = "TEXT")

    private String shortDescription;
    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Game(){};



    public Game(String title, Integer year, String genre, String platform, String imgUrl, String shortDescription, String longDescription) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platform = platform;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }
    public Double getScore() {
        return score;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatform() {
        return platform;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
