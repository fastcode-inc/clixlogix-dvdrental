package com.fastcode.dvdrentalclixlogix.application.core.actor;

import com.fastcode.dvdrentalclixlogix.application.core.actor.dto.*;
import com.fastcode.dvdrentalclixlogix.commons.search.SearchCriteria;
import java.util.*;
import org.springframework.data.domain.Pageable;

public interface IActorAppService {
    //CRUD Operations

    CreateActorOutput create(CreateActorInput actor);

    void delete(Integer id);

    UpdateActorOutput update(Integer id, UpdateActorInput input);

    FindActorByIdOutput findById(Integer id);

    List<FindActorByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;

    //Join Column Parsers

    Map<String, String> parseFilmActorsJoinColumn(String keysString);
}
