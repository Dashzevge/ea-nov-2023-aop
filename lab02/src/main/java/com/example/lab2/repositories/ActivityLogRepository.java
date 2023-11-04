package com.example.lab2.repositories;

import com.example.lab2.entities.ActivityLog;
import org.springframework.data.repository.ListCrudRepository;

public interface ActivityLogRepository  extends ListCrudRepository<ActivityLog, Long> {
}
