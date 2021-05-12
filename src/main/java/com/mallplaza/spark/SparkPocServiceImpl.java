package com.mallplaza.spark;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SparkPocServiceImpl implements SparkPocService {

    @Override
    public Country save(Country country) {
        System.out.println("save country");
        return null;
    }

    @Override
    public void deleteCountry(Country country) {
        System.out.println("delete country");
    }

    @Override
    public Country getCountry(Integer id) {
        System.out.println("get country");
        return new Country(1, "ANDORRA", "AND");
    }

    @Override
    public List getCountries() {
        System.out.println("get countries");
        Country c1 = new Country(1, "ANDORRA", "AND");
        Country c2 = new Country(2, "CUBA", "CUB");
        Country c3 = new Country(3, "GHANA", "GHA");
        return List.of(c1, c2, c3);
    }

    /*
    private CountryRepository countryRepository;

    public SparkPocServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public Country save(Country country) {
        return countryRepository.save(country);
    }

    public void deleteCountry(Country country) {
        countryRepository.delete(country);
    }

    public Country getCountry(Integer id) {
        return countryRepository.findOne(id);
    }

    public List getCountries() {
        return (List) countryRepository.findAll();
    }
    */

}
