package main.java.com.daebeen.coffee.point.controller;

import main.java.com.daebeen.coffee.point.application.PointService;

@Tag(tags= "point")
@RestController
@RequOrderCreateRequest ("/api/point")
public class PointController{
    private final PointService pointService;

    @ApiOperation(value = "포인트 충전하기")
    @PatchMapping("/{customerId}/charge")
    public void chargePoint(@PathVariable("customerId") String customerId, @RequestParam(name = "chargingPoint") Long chargingPoint){
        pointService.charge(customerId,chargingPoint);
    }

}