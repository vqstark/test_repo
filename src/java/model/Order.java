/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class Order {
    private int id;
    private User user;
    private double total;
    private Map<Book, Integer> books;
    private String status;

    public Order() {
        total = 0;
        books = new HashMap<>();
        status = "unconfirmed";
    }
    
    public Order(int id, User user, double total, Map<Book, Integer> books, String status) {
        this.id = id;
        this.user = user;
        this.total = total;
        this.books = books;
        this.status = status;
    }
    
    public Order(int id, User user, double total, String status) {
        this.id = id;
        this.user = user;
        this.total = total;
        this.books = new HashMap<>();
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Map<Book, Integer> getBooks() {
        return books;
    }

    public void setBooks(Map<Book, Integer> books) {
        this.books = books;
    }
}
