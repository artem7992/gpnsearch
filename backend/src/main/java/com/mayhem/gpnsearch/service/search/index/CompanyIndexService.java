package com.mayhem.gpnsearch.service.search.index;

import com.mayhem.gpnsearch.model.Okved;

import java.util.List;

public interface CompanyIndexService {

    void indexCompanies(List<Okved> okveds);

}
