package com.example.demo.notificationReports;

// import com.example.demo.notificationReports.NotificationReport;
// import com.example.demo.notificationReports.NotificationReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// import javax.transaction.Transactional;
import java.util.List;

@RestController
public class NotificationReportController {
    private final NotificationReportService notificationReportService;

    @Autowired
    public NotificationReportController(NotificationReportService notificationReportService) {
        this.notificationReportService = notificationReportService;
    }

    @GetMapping("/notificationReports")
    public List<NotificationReport> getNotificationReport(){
        return notificationReportService.getNotificationReports();
    }
    @PostMapping("notificationReports")
    public void registerNewNotificationReport(@RequestBody NotificationReport notificationReport){
        notificationReportService.addNewNotificationReport(notificationReport);
    }
    @DeleteMapping(path="/notificationReport/{notificationReportId}")
    public void deleteNotificationReport(@PathVariable("notificationReportId") Long id){
        notificationReportService.deleteNotificationReport(id);
    }

}