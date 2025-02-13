package com.fastcode.dvdrentalclixlogix.application.core.customer;

import com.fastcode.dvdrentalclixlogix.application.core.customer.dto.*;
import com.fastcode.dvdrentalclixlogix.commons.search.SearchCriteria;
import java.util.*;
import org.springframework.data.domain.Pageable;

public interface ICustomerAppService {
    //CRUD Operations

    CreateCustomerOutput create(CreateCustomerInput customer);

    void delete(Integer id);

    UpdateCustomerOutput update(Integer id, UpdateCustomerInput input);

    FindCustomerByIdOutput findById(Integer id);

    List<FindCustomerByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
    //Relationship Operations

    GetAddressOutput getAddress(Integer customerid);

    //Join Column Parsers

    Map<String, String> parsePaymentsJoinColumn(String keysString);

    Map<String, String> parseRentalsJoinColumn(String keysString);
}
