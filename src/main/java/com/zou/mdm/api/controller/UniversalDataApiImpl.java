package com.zou.mdm.api.controller;

import com.zou.mdm.api.mapper.CountryMapper;
import com.zou.mdm.api.service.CountryService;
import com.zou.mdm.controller.UniversalDataApi;
import com.zou.mdm.type.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UniversalDataApiImpl implements UniversalDataApi {
final CountryService countryService;
final CountryMapper countryMapper;

    public UniversalDataApiImpl(CountryService countryService, CountryMapper countryMapper) {
        this.countryService = countryService;
        this.countryMapper =countryMapper;
    }

    @Override
    public ResponseEntity<Object> getCountriesByContinentUsingGET(String continent, Integer page) {
        return null;
    }
    @Override
    public ResponseEntity<List<Country>> getCountriesUsingGET(Integer page) {
        List<Country> countries= countryMapper.asView(countryService.getCountries());
//       List<CountryBO> countries= countryService.getCountries();
        return new ResponseEntity<>(countries,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Object> getCountryByIdUsingGET(Integer id) {
        return null;
    }
}
