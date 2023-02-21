package com.zou.mdm.api.mapper;

import com.zou.mdm.api.type.CountryBO;
import com.zou.mdm.type.Country;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryMapper {
    List<Country> asView(List<CountryBO> in);
    @Mapping(target= "code", source="unlocode")
    Country asView(CountryBO in);
}
