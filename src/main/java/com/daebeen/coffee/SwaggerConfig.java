@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI coffeeOpenApi() {
        return new OpenAPI()
                .addServersItem(new Server().url("/"))
                .components(new Components())
                .info(
                        new Info()
                                .title("coffee_order_system")
                                .description("커피 주문 시스템 API 목록")
                                .version("v.0.0.1")
                )

    }
}