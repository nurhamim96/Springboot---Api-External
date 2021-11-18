package com.externalapi.rajaongkirapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusCity {
    private Status status;
    private CityResults results;
}
