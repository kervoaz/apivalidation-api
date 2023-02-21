package com.zou.mdm.api.service.impl;

import com.zou.mdm.api.model.CountryDao;
import com.zou.mdm.api.service.CountryService;
import com.zou.mdm.api.type.CountryBO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    final CountryDao countryDao;
    CountryServiceImpl(CountryDao countryDao){
        this.countryDao=countryDao;
    }
    @Override
    public List<CountryBO> getCountries() {
        return countryDao.getCountries();
    }
}
