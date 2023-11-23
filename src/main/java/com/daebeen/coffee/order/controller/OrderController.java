
@Tag(name = "order", description ="커피 주문/결제하기 API")
@RestController
@RequestMapping("/api/order")
public class OrderController{

    @Operation(summary = "주문/결제")
    @PostMapping("/")
    public String createOrder(){
        return "주문완료";
    }
}