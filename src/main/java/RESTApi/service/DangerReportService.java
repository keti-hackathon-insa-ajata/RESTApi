package RESTApi.service;

import RESTApi.model.DangerReport;
import RESTApi.repository.DangerReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class DangerReportService {
    @Autowired
    private DangerReportRepository dangerReportRepository;

    public List<DangerReport> listAllDangerReports() {
        return dangerReportRepository.findAll();
    }

    public List<DangerReport> listAllDangerReportsByDanger(boolean dangerous) {
        return dangerReportRepository.findAllInfosByDanger(dangerous);
    }

    public void saveDangerReport(DangerReport dangerReport) {
        dangerReportRepository.save(dangerReport);
    }

//    public DangerReport getDangerReport(Integer id) {
//        return dangerReportRepository.findById(id).get();
//    }
//
//    public void deleteDangerReport(Integer id) {
//        dangerReportRepository.deleteById(id);
//    }
}