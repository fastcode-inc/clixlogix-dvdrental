package com.fastcode.dvdrentalclixlogix.application.core.filmactor.dto;

import java.time.*;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateFilmActorInput {

    @NotNull(message = "actorId Should not be null")
    private Short actorId;

    @NotNull(message = "filmId Should not be null")
    private Short filmId;

    @NotNull(message = "lastUpdate Should not be null")
    private LocalDateTime lastUpdate;
}
