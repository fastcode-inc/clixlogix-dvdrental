package com.fastcode.dvdrentalclixlogix.addons.docmgmt.application.file;

import com.fastcode.dvdrentalclixlogix.addons.docmgmt.application.file.dto.*;
import com.fastcode.dvdrentalclixlogix.commons.search.SearchCriteria;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface IFileAppService {
    //CRUD Operations

    CreateFileOutput create(CreateFileInput file);

    void delete(Long id);

    UpdateFileOutput update(Long id, UpdateFileInput input);

    FindFileByIdOutput findById(Long id);

    List<FindFileByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
}
