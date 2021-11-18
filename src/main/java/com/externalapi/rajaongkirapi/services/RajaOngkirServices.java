package com.externalapi.rajaongkirapi.services;

import com.externalapi.rajaongkirapi.dtos.City;
import com.externalapi.rajaongkirapi.dtos.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RajaOngkirServices {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<Province> getProvinceById(int id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("key", "2b418779367d4fd5feaa292c5894b4d4");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<Province> response = restTemplate.exchange("https://api.rajaongkir.com/starter/province?id="+id, HttpMethod.GET, entity, Province.class);
        var province = response.getBody();
        return ResponseEntity.ok(province);
    }

    public ResponseEntity<City> getCityById(int id, int provinceId) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("key", "2b418779367d4fd5feaa292c5894b4d4");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<City> response = restTemplate.exchange("https://api.rajaongkir.com/starter/city?id="+id+"&province="+provinceId, HttpMethod.GET, entity, City.class);
        var city = response.getBody();
        return ResponseEntity.ok(city);
    }
}
