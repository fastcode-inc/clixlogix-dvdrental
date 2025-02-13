package com.fastcode.dvdrentalclixlogix.application.core.category;

import com.fastcode.dvdrentalclixlogix.application.core.category.dto.*;
import com.fastcode.dvdrentalclixlogix.commons.search.SearchCriteria;
import java.util.*;
import org.springframework.data.domain.Pageable;

public interface ICategoryAppService {
    //CRUD Operations

    CreateCategoryOutput create(CreateCategoryInput category);

    void delete(Integer id);

    UpdateCategoryOutput update(Integer id, UpdateCategoryInput input);

    FindCategoryByIdOutput findById(Integer id);

    List<FindCategoryByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;

    //Join Column Parsers

    Map<String, String> parseFilmCategorysJoinColumn(String keysString);
}
