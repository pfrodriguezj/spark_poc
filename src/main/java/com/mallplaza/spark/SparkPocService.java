package com.mallplaza.spark;

import java.util.List;

public interface SparkPocService {

    Country save(Country country);

    void deleteCountry(Country country);

    Country getCountry(Integer id);

    List getCountries();
}
