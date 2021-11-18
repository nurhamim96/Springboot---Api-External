package com.externalapi.rajaongkirapi.controllers;

import com.externalapi.rajaongkirapi.dtos.City;
import com.externalapi.rajaongkirapi.dtos.Province;
import com.externalapi.rajaongkirapi.services.RajaOngkirServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/raja-ongkir")
public class RajaOngkirControllers {

    @Autowired
    private RajaOngkirServices services;

    @GetMapping("/provinces/{id}")
    public ResponseEntity<Province> provinces(@PathVariable("id") int id){
        return services.getProvinceById(id);
    }

    @GetMapping("/cities")
    public ResponseEntity<City> cities(@RequestParam("id") int id, @RequestParam("provinceId") int provinceId) {
        return services.getCityById(id, provinceId);
    }

}
