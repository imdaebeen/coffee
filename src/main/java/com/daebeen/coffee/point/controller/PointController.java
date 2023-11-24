package com.daebeen.coffee.point.controller;

import com.daebeen.coffee.point.application.PointService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/point")
@RequiredArgsConstructor
public class PointController{
    private final PointService pointService;

    @PatchMapping("/{customerId}/charge")
    public void chargePoint(@PathVariable("customerId") Long customerId, @RequestParam(name = "chargingPoint") Long chargingPoint){
        pointService.charge(customerId,chargingPoint);
    }

}