package com.example.springbootexception.exception;

import com.example.springbootexception.errorcode.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author 이승환
 * @since 2022-04-01
 * <p>
 * 발생한 예외를 처리해 줄 예외 클래스
 */
@Getter
@RequiredArgsConstructor
public class RestApiException extends RuntimeException {

    /**
     * NOTE :: 체크 예외가 아닌 언체크(RuntimeException) 예외를 상속받아 구현한 이유는?
     * <p>
     * 스프링의 선언적 트랜잭션(@Transactional)을 이용하는 경우에 체크 예외는
     * 기본적으로 롤백이 되지 않기 때문이다.
     * <p>
     * Spring은 내부적으로 발생한 예외를 확인하여 언체크 예외 이거나
     * 자동으로 롤백 시키도록 처리한다.
     * <p>
     * 롤백을 시키도록 처리한 이유는?
     * 체크 예외는 처리하지 않으면 컴파일 에러가 발생으로 조치를 강제화 되기 때문,
     * 언체크 예외는 애플리케이션 로직 상에서 조치가 강제화 되지 않기 때문에 롤백을 해야한다고 판단했기 때문.
     */

    private final ErrorCode errorCode;
}
