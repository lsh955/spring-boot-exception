package com.example.springbootexception.errorcode;

import org.springframework.http.HttpStatus;

/**
 * @author 이승환
 * @since 2022-04-01
 * <p>
 * 클라이언트에게 내려줄 에러코드를 정의
 */
public interface ErrorCode {

    String name();  // 에러이름

    HttpStatus getHttpStatus(); // HTTP 상태

    String getMessage();    // 에러메시지
}
