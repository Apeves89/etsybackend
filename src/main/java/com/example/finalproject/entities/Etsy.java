package com.example.finalproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etsy {

    //**************************************** */
    //  Entity Properties
    //**************************************** */

    @Id //Denotes this property as the id/primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //auto generates
    public Integer id;

    public String category;

    public String title;

    public String image;

    public String price;

    public String description;

    //**************************************** */
    //  Constructors
    //**************************************** */

    public Etsy(){

    }

    public Etsy(String title, String category, String image, String price, String description){
        this.category = category;
        this.title = title;
        this.image = image;
        this.image = price;
        this.image = description;

    }

    //**************************************** */
    //  GETTERS AND SETTERS
    //**************************************** */

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getCategory(){
        return this.category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getImage(){
        return this.image;
    }

    public void setImage(String image){
        this.image = image;
    }

    public String getPrice(){
        return this.price;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
