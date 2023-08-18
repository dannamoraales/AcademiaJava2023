package com.luv2code.springboot.cruddemo.rest;

import com.luv2code.springboot.cruddemo.entity.Coffee;
import com.luv2code.springboot.cruddemo.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CoffeeRestController {

    private CoffeeService coffeeService;

    @Autowired
    public CoffeeRestController(CoffeeService theCoffeeService) {
    	coffeeService = theCoffeeService;
    }

    @GetMapping("/employees")
    public List<Coffee> findAll() {
        return coffeeService.findAll();
    }

    @GetMapping("/coffees/{coffeeId}")
    public Coffee getCoffee(@PathVariable int coffeeId) {

        Coffee theCoffee = coffeeService.findById(coffeeId);

        if (theCoffee == null) {
            throw new RuntimeException("Coffee id not found - " + coffeeId);
        }

        return theCoffee;
    }


    @PostMapping("/coffees")
    public Coffee addCoffee(@RequestBody Coffee theCoffee) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        theCoffee.setId(0);

        Coffee dbEmployee = coffeeService.save(theCoffee);

        return dbEmployee;
    }


    @PutMapping("/coffees")
    public Coffee updateEmployee(@RequestBody Coffee theCoffee) {

    	Coffee dbEmployee = coffeeService.save(theCoffee);

        return dbEmployee;
    }


    @DeleteMapping("/coffees/{coffeeId}")
    public String deleteEmployee(@PathVariable int coffeeId) {

    	Coffee tempCoffee = coffeeService.findById(coffeeId);

        // throw exception if null

        if (tempCoffee == null) {
            throw new RuntimeException("Coffee id not found - " + coffeeId);
        }

        coffeeService.deleteById(coffeeId);

        return "Deleted coffee id - " + coffeeId;
    }

}














