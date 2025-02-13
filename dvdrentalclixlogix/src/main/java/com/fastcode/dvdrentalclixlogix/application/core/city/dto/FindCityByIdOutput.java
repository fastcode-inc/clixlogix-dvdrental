package com.fastcode.dvdrentalclixlogix.application.core.city.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FindCityByIdOutput {

    private String city;
    private Integer cityId;
    private LocalDateTime lastUpdate;
    private Short countryId;
    private Integer countryDescriptiveField;
    private Long versiono;
}
