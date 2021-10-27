package RESTApi.controller;

import RESTApi.model.DangerReport;

import RESTApi.service.DangerReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/dangerReports")
public class DangerReportController {
    @Autowired
    DangerReportService dangerReportService;

    @GetMapping("")
    public List<DangerReport> list(@RequestParam(required = false) Integer dangerous) {
        if (dangerous != null)
            return dangerReportService.listAllDangerReportsByDanger(dangerous);
        else
            return dangerReportService.listAllDangerReports();
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<DangerReport> get(@PathVariable Integer id) {
//        try {
//            DangerReport dangerReport = dangerReportService.getDangerReport(id);
//            return new ResponseEntity<DangerReport>(dangerReport, HttpStatus.OK);
//        } catch (NoSuchElementException e) {
//            return new ResponseEntity<DangerReport>(HttpStatus.NOT_FOUND);
//        }
//    }

    @PostMapping("")
    public void add(@RequestBody DangerReport dangerReport) {
        dangerReportService.saveDangerReport(dangerReport);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<?> update(@RequestBody DangerReport dangerReport, @PathVariable Integer id) {
//        try {
//            DangerReport existDangerReport = dangerReportService.getDangerReport(id);
//            dangerReport.setId(id);
//            dangerReportService.saveDangerReport(dangerReport);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (NoSuchElementException e) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }

//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Integer id) {
//
//        dangerReportService.deleteDangerReport(id);
//    }
}
