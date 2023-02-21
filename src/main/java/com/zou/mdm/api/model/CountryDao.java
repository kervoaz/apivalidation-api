package com.zou.mdm.api.model;

import com.zou.mdm.api.type.CountryBO;

import java.util.List;

public interface CountryDao {
    List<CountryBO> getCountries();
}
