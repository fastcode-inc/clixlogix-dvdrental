package com.fastcode.dvdrentalclixlogix.application.core.authorization.userrole.dto;

import java.time.*;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateUserroleInput {

    @NotNull(message = "roleId Should not be null")
    private Long roleId;

    @NotNull(message = "userId Should not be null")
    private Long userId;

    private Long versiono;
}
