package com.fastcode.dvdrentalclixlogix.application.core.authorization.user.dto;

import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class UpdatePasswordInput {

    @NotNull
    @Length(min = 8, max = 128, message = "password must be between 8 and 128 characters")
    String oldPassword;

    @NotNull
    @Length(min = 8, max = 128, message = "password must be between 8 and 128 characters")
    String newPassword;
}
