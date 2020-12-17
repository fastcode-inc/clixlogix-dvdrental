package com.fastcode.dvdrentalclixlogix.addons.reporting.application.reportversion;

import com.fastcode.dvdrentalclixlogix.addons.reporting.application.reportversion.dto.*;
import com.fastcode.dvdrentalclixlogix.addons.reporting.domain.reportversion.ReportversionId;
import com.fastcode.dvdrentalclixlogix.commons.search.SearchCriteria;
import java.util.List;
import java.util.Map;
import org.springframework.data.domain.Pageable;

public interface IReportversionAppService {
    CreateReportversionOutput create(CreateReportversionInput report);

    void delete(ReportversionId id);

    UpdateReportversionOutput update(ReportversionId id, UpdateReportversionInput input);

    FindReportversionByIdOutput findById(ReportversionId id);

    List<FindReportversionByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;

    GetUserOutput getUser(ReportversionId reportid);

    List<FindReportversionByIdOutput> findByUserId(Long userId);

    Map<String, String> parsedashboardversionreportJoinColumn(String keysString);
}
