package springboot1.class1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="description",nullable = false)
    private String description;

    @Column(name="author",nullable = false)
    private String author;

    @Column(name="rating",nullable = false)
    private double rating;

    @Column(name="is_published",nullable = false)
    private boolean is_published;

    public Course() {
    }

    public Course(long id, String name, String description, String author, double rating, boolean is_published) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.author = author;
        this.rating = rating;
        this.is_published = is_published;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isPublished() {
        return is_published;
    }

    public void setPublished(boolean is_published) {
        this.is_published = is_published;
    }

    @Override
    public String toString() {
        return String.format("Course [id=%s, name=%s, description=%s, author=%s, rating=%s, is_published=%s]", id,
                name, description, author, rating, is_published);
    }
}