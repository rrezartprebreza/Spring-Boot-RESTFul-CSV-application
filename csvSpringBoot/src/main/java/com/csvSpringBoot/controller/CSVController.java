package com.csvSpringBoot.controller;

import com.csvSpringBoot.dao.Country;
import com.csvSpringBoot.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CSVController {
    @Autowired
    private ICountryService countryService;

    @RequestMapping("/countries")
    public List<Country> listCountries() {

        return countryService.findAll();
    }
}
