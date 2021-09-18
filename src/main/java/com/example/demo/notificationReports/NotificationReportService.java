package com.example.demo.notificationReports;

// import com.example.demo.notificationReports.NotificationReport;
// import com.example.demo.notificationReports.NotificationReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
// import java.util.Optional;

@Service
public class NotificationReportService {
    private final NotificationReportRepository notificationReportRepository;

    @Autowired
    public NotificationReportService(NotificationReportRepository notificationReportRepository) {
        this.notificationReportRepository = notificationReportRepository;
    }
    public List<NotificationReport> getNotificationReports(){
        return notificationReportRepository.findAll();
    }

    public void addNewNotificationReport(NotificationReport notificationReport) {
        notificationReportRepository.save(notificationReport);
    }

    public void deleteNotificationReport(Long id) {
        boolean b = notificationReportRepository.existsById(id);
        if(!b){
            throw new IllegalStateException("NotificationReport doesn't exists");
        }
        notificationReportRepository.deleteById(id);
    }
}