package com.fastcode.dvdrentalclixlogix.application.core.inventory.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FindInventoryByIdOutput {

    private Integer inventoryId;
    private LocalDateTime lastUpdate;
    private Short storeId;
    private Short filmId;
    private Integer filmDescriptiveField;
    private Long versiono;
}
