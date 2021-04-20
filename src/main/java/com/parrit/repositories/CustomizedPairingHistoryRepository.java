package com.parrit.repositories;

import com.parrit.entities.PairingArrangement;
import com.parrit.entities.Project;

import java.sql.Timestamp;
import java.util.List;

public interface CustomizedPairingHistoryRepository {
    List<PairingArrangement> findByProjectAndTimestampAfterOrderByTimestampDesc(Project project, Timestamp timestamp);

}
