package com.example.springbootexception.errorcode;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * @author 이승환
 * @since 2022-04-01
 * <p>
 * 특정(User) 도메인에 대해 사용되는 용도
 */
@Getter
@RequiredArgsConstructor
public enum UserErrorCode implements ErrorCode {

    INACTIVE_USER(HttpStatus.FORBIDDEN, "User is inactive");

    private final HttpStatus httpStatus;
    private final String message;
}
