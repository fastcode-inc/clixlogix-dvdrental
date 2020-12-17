package com.fastcode.dvdrentalclixlogix.addons.reporting.domain.dashboard;

import com.fastcode.dvdrentalclixlogix.addons.reporting.application.dashboard.dto.DashboardDetailsOutput;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IDashboardRepositoryCustom {
    Page<DashboardDetailsOutput> getAllDashboardsByUserId(Long userId, String search, Pageable pageable);

    Page<DashboardDetailsOutput> getAvailableDashboardsByUserId(
        Long userId,
        Long reportId,
        String search,
        Pageable pageable
    );
}
