package com.fastcode.dvdrentalclixlogix.application.core.authorization.tokenverification;

import com.fastcode.dvdrentalclixlogix.domain.core.authorization.tokenverification.TokenverificationEntity;

public interface ITokenVerificationAppService {
    TokenverificationEntity findByTokenAndType(String token, String type);

    TokenverificationEntity generateToken(String type, Long userId);

    TokenverificationEntity findByUserIdAndType(Long userId, String type);

    void deleteToken(TokenverificationEntity entity);
}
