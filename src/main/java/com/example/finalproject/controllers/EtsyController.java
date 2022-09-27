package com.example.finalproject.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.finalproject.repositories.EtsyRepository;
import com.example.finalproject.entities.Etsy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EtsyController {

    // Property to hold Etsy Repository
    public EtsyRepository Etsys;

    // Receive Etsy Repository via Dependency Injection
    public EtsyController(EtsyRepository Etsys){
        this.Etsys = Etsys;
    }

    // get request to /etsy
    @CrossOrigin // Enable CORS <-
    @GetMapping("/etsy")
    public List<Etsy> index(){
        return Etsys.findAll();
    }

    // get request to /etsy/:id
    @CrossOrigin // Enable CORS <-
    @GetMapping("/etsy/{id}")
    public Optional<Etsy> show(@PathVariable Integer id){
        return Etsys.findById(id);
    }

    @CrossOrigin // Enable CORS <-
    @PostMapping("/etsy")
    public List<Etsy> create(@RequestBody Etsy newEtsy){
        Etsys.save(newEtsy); // Create the New Etsy
        return Etsys.findAll();
    }

    @CrossOrigin // Enable CORS <-
    @PutMapping("/etsy/{id}")
    public List<Etsy> update(@RequestBody Etsy fixEtsy, @PathVariable Integer id){
        // Find Etsy by it's then use map to update it
        Etsys.findById(id).map(Etsy -> {

        Etsy.setCategory(fixEtsy.getCategory());
        Etsy.setTitle(fixEtsy.getTitle());
        Etsy.setImage(fixEtsy.getImage());
        Etsy.setPrice(fixEtsy.getPrice());
        Etsy.setDescription(fixEtsy.getDescription());
        Etsys.save(Etsy);
        return Etsy;

        });

        // return all Etsys
        return Etsys.findAll();
    }

    @CrossOrigin // Enable CORS <-
    @DeleteMapping("/etsy/{id}")
    public List<Etsy> destroy(@PathVariable Integer id){
        Etsys.deleteById(id);
        return Etsys.findAll();
    }

}
