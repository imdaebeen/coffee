public class ErrorCode {

        //400 INVALID_INPUT_VALUE "유효성 검증이 실패한 경우"
        //400 DUPLICATE_LOGIN_ID "계정명이 중복된 경우"
        //401 UNAUTHORIZED "인증에 실패한 경우"
        //403 ROLE_NOT_EXISTS "권한이 부족한 경우"
        //404 ACCOUNT_NOT_FOUND "계정을 찾을 수 없는 경우"
        //404 TOKEN_NOT_EXISTS "해당 KEY의 인증 토큰이 존재하지 않는 경우"
        //500 INTERNAL_SERVCER_ERROR "서버에서 처리 할 수 없는 경우"

        private final int status;
        private final String code;
        private final String description;
}