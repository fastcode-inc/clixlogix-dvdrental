package com.fastcode.dvdrentalclixlogix.addons.reporting.application.report.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetRoleOutput {

    private Long id;
    private String displayName;
    private String name;
    private Long reportId;
    private Boolean editable;
}
