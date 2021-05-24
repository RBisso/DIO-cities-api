package com.github.rbisso.citiesapi.states.repository;

import com.github.rbisso.citiesapi.states.State;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long>{
}