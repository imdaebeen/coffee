

@Tag(tags= "point")
@RestController
@RequOrderCreateRequest estMapping("/api/point")
public class PointController{

    @ApiOperation(value = "포인트 충전하기")
    @PostMapping("/")
    public String chargePoint(){
        return "충전완료";
    }
}