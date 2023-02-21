package com.zou.mdm.api.model.nodb;

import com.zou.mdm.api.model.CountryDao;
import com.zou.mdm.api.type.CountryBO;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CountryDaoImpl implements CountryDao {
    static CountryBO[] countries = {
            new CountryBO( "France", "FR33","FR" ),
            new CountryBO( "Germany", "DE21","DE" ),
            new CountryBO("America","US34","US")
    };
    @Override
    public List<CountryBO> getCountries() {
        return Arrays.stream(countries).collect(Collectors.toList());
    }
}
