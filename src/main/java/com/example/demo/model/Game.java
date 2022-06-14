package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String gameName;
    private String description;
    private String developer;
    private double price;
    private Date relaseDate;
    private String category;
    private String language;
    private String systemRequirements;

    public Game() {
    }

    public Game(int id, String name, String description, String developer, double price, Date release_date, String category, String lang, String systemRequirements) {
        this.id = id;
        this.gameName = name;
        this.description=description;
        this.developer=developer;
        this.price=price;
        this.relaseDate =release_date;
        this.category=category;
        this.language=lang;
        this.systemRequirements = systemRequirements;
    }


    public int getId() {
        return id;
    }

    public String getGameName() {
        return gameName;
    }

    public String getDescription() {
        return description;
    }

    public String getDeveloper() {
        return developer;
    }

    public double getPrice() {
        return price;
    }

    public Date getRelaseDate() {
        return relaseDate;
    }

    public String getCategory() {
        return category;
    }

    public String getLanguage() {
        return language;
    }

    public String getSystemRequirements() {
        return systemRequirements;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRelaseDate(Date relaseDate) {
        this.relaseDate = relaseDate;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setSystemRequirements(String systemRequirements) {
        this.systemRequirements = systemRequirements;
    }



}
