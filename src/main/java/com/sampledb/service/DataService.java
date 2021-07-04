package com.sampledb.service;

import com.sampledb.domain.Data;
import com.sampledb.repository.DataRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    private DataRepository dataRepository;

    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public Iterable<Data> list() {
        return dataRepository.findAll();
    }

    public Data save(Data data) {
        return dataRepository.save(data);
    }

    public void save(List<Data> datas) {
        dataRepository.save(datas);
    }
}
