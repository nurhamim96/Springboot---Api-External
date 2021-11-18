package com.externalapi.rajaongkirapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusProvince {
    private Status status;
    private ProvenceResults results;

}
