package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.CoffeeRepository;
import com.luv2code.springboot.cruddemo.entity.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoffeeServiceImpl implements CoffeeService {

    private CoffeeRepository coffeeRepository;

    @Autowired
    public CoffeeServiceImpl(CoffeeRepository theCoffeeRepository) {
        coffeeRepository = theCoffeeRepository;
    }

    @Override
    public List<Coffee> findAll() {
        return coffeeRepository.findAll();
    }

    @Override
    public Coffee findById(int theId) {
        Optional<Coffee> result = coffeeRepository.findById(theId);

        Coffee theCoffee = null;

        if (result.isPresent()) {
            theCoffee = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find coffee id - " + theId);
        }

        return theCoffee;
    }

    @Override
    public Coffee save(Coffee theEmployee) {
        return coffeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        coffeeRepository.deleteById(theId);
    }
}






