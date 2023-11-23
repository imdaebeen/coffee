public enum CoffeeError {
        INVALID_INPUT_VALUE("입력값이 잘못되었습니다.")
        DUPLICATE_LOGIN_ID("고객아이디가 중복되었습니다.")
        CUSTOMER_NOT_FOUND("고객을 찾을 수 없습니다.")
        INSUFFICIENT_USER_POINT("포인트가 부족합니다.")
        INTERNAL_SERVER_ERR("서버 오류가 발생하였습니다.")

        private String description;
}