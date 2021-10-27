package RESTApi.repository;

import RESTApi.model.DangerReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DangerReportRepository extends JpaRepository<DangerReport, Integer>{

    @Query(value = "SELECT * FROM DANGERREPORTS", nativeQuery = true)
    List<DangerReport> findAllInfos();

    @Query(value = "SELECT * FROM DANGERREPORTS WHERE DANGEROUS = ?1", nativeQuery = true)
    List<DangerReport> findAllInfosByDanger(int dangerous);
}
