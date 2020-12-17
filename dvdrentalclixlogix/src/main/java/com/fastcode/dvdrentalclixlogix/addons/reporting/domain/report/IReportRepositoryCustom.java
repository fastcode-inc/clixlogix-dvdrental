package com.fastcode.dvdrentalclixlogix.addons.reporting.domain.report;

import com.fastcode.dvdrentalclixlogix.addons.reporting.application.report.dto.ReportDetailsOutput;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IReportRepositoryCustom {
    Page<ReportDetailsOutput> getAllReportsByUserId(Long userId, String search, Pageable pageable) throws Exception;
}
