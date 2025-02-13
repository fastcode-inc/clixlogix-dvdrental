package com.fastcode.dvdrentalclixlogix.application.core.inventory.dto;

import java.time.*;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateInventoryInput {

    @NotNull(message = "inventoryId Should not be null")
    private Integer inventoryId;

    @NotNull(message = "lastUpdate Should not be null")
    private LocalDateTime lastUpdate;

    @NotNull(message = "storeId Should not be null")
    private Short storeId;

    private Short filmId;
    private Long versiono;
}
