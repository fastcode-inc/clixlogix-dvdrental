package com.fastcode.dvdrentalclixlogix.application.core.language.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateLanguageOutput {

    private Integer languageId;
    private LocalDateTime lastUpdate;
    private String name;
}
