package com.jarjarspring.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jarjarspring.app.model.ImportModel;

public interface ImportRepository extends JpaRepository<ImportModel, Long> {

}
