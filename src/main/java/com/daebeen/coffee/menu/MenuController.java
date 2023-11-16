
@Api(tage="menu")
@RestController
@RequestMapping("/api/menu")
public class MenuController{

    @ApiOperation(value= "커피 메뉴 목록 조회 API")
    @GetMapping("/")
    public String getAllMenu(){
        return "Americano";
    }

    @ApiOperation(value = "인기메뉴 목록 조회")
    @GetMapping("/popular")
    public String getPopularMenu(){
        return "Americano";
    }
}