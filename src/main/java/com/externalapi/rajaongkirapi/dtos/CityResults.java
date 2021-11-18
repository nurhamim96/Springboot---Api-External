package com.externalapi.rajaongkirapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class CityResults {
    private String city_id;
    private String province_id;
    private String province;
    private String type;
    private String city_name;
    private String postal_code;
}
