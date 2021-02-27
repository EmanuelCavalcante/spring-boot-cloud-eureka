package com.cavalcante.hrworker.repository;

import com.cavalcante.hrworker.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
