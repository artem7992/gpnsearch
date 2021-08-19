package com.mayhem.gpnsearch.service.search.index.jmx;

import com.mayhem.gpnsearch.model.Okved;
import com.mayhem.gpnsearch.service.search.index.CompanyIndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@ManagedResource(objectName = "gpnsearch:service=company")
public class CompanyIndexJmxService {

    private static final Logger logger = LoggerFactory.getLogger(CompanyIndexJmxService.class);

    private final CompanyIndexService companyIndexService;

    @Autowired
    public CompanyIndexJmxService(CompanyIndexService companyIndexService) {
        this.companyIndexService = companyIndexService;
    }

    @ManagedOperation()
    public void indexCompanies() {
        List<Okved> okveds = new ArrayList<>();
        okveds.add(new Okved(60000, "Добыча сырой нефти и природного газа в России"));
        okveds.add(new Okved(62000, "Добыча природного газа и газового конденсата в России"));
        companyIndexService.indexCompanies(okveds);
    }

}
