package com.csvSpringBoot.service;

import com.csvSpringBoot.dao.Country;

import java.util.ArrayList;

public interface ICountryService {
    public ArrayList<Country> findAll();
}
