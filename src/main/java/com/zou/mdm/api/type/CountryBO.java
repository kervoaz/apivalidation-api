package com.zou.mdm.api.type;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class CountryBO {
    @NotNull String name;
    @NotNull String internalCode;
    @NotNull String unlocode;
}
