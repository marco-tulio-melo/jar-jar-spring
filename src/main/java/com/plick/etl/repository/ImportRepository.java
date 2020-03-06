package com.plick.etl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.plick.etl.model.ImportModel;

public interface ImportRepository extends JpaRepository<ImportModel, Long> {

}