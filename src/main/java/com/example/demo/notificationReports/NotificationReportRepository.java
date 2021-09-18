package com.example.demo.notificationReports;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationReportRepository extends JpaRepository<NotificationReport, Long> {
}