package com.fastcode.dvdrentalclixlogix.application.core.authorization.userpermission.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateUserpermissionOutput {

    private Long permissionId;
    private Boolean revoked;
    private Long userId;
    private String permissionDescriptiveField;
    private String userDescriptiveField;
}
