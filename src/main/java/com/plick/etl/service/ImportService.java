package com.plick.etl.service;

import java.util.List;

import com.plick.etl.model.ImportModel;
import com.plick.etl.repository.ImportRepository;

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