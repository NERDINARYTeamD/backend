package com.presenty.backend.error.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import static jakarta.servlet.http.HttpServletResponse.*;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    HANDLE_INTERNAL_SERVER_ERROR(SC_INTERNAL_SERVER_ERROR, "서버에 문제가 발생했습니다."),
    HANDLE_ACCESS_DENIED(SC_FORBIDDEN, "접근이 허용되지 않습니다."),
    HANDLE_UNAUTHORIZED(SC_UNAUTHORIZED, "인증되지 않은 사용자입니다."),
    INVALID_INPUT_VALUE(SC_BAD_REQUEST, "유효하지 않은 입력 값입니다."),
    INVALID_TYPE_VALUE(SC_BAD_REQUEST,  "유효하지 않은 타입입니다."),

    ENTITY_NOT_FOUND(SC_NOT_FOUND, "존재하지 않는 자원입니다."),
    ENTITY_ACCESS_DENIED(SC_FORBIDDEN, "접근이 허용되지 않는 리소스입니다."),
    ;

    private final int status;

    private final String message;
}
