package com.spring.microservicos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.microservicos.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
