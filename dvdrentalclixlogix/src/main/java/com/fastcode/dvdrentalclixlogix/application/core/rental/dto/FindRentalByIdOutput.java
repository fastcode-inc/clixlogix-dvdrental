package com.fastcode.dvdrentalclixlogix.application.core.rental.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FindRentalByIdOutput {

    private LocalDateTime lastUpdate;
    private LocalDateTime rentalDate;
    private Integer rentalId;
    private LocalDateTime returnDate;
    private Short customerId;
    private Integer customerDescriptiveField;
    private Integer inventoryId;
    private Integer inventoryDescriptiveField;
    private Short staffId;
    private Integer staffDescriptiveField;
    private Long versiono;
}
