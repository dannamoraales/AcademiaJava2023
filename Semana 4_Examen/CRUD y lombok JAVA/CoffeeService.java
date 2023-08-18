package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.entity.Coffee;

import java.util.List;

public interface CoffeeService {

    List<Coffee> findAll();

    Coffee findById(int theId);

    Coffee save(Coffee theEmployee);

    void deleteById(int theId);

}
