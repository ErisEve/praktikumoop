package com.example.demo.notificationReports;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NotificationReportRepository extends JpaRepository<NotificationReport, Long> {
    List<NotificationReport> findByIdCandidate(Long idCandidate);
}