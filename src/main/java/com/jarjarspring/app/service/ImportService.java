package com.jarjarspring.app.service;

import java.util.List;

import com.jarjarspring.app.model.ImportModel;
import com.jarjarspring.app.repository.ImportRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImportService {

    @Autowired
    ImportRepository importRepository;

    List<ImportModel> findAll() {
        return importRepository.findAll();
    }

    ImportModel findById(Long Id) {
        return importRepository.findById(Id).get();
    }

    ImportModel save(ImportModel importModel) {
        return importRepository.save(importModel);
    }
}
