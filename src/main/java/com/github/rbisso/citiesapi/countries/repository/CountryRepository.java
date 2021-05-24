package com.github.rbisso.citiesapi.countries.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.rbisso.citiesapi.countries.Country;


public interface CountryRepository extends JpaRepository<Country, Long> {
}
