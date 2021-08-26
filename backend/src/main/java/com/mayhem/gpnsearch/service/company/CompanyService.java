package com.mayhem.gpnsearch.service.company;

import com.mayhem.gpnsearch.model.Company;
import com.mayhem.gpnsearch.model.Okved;

import java.util.List;

public interface CompanyService {

    int getCompaniesPagesAmount(Okved okved);

    List<Company> findCompanies(Okved okved, int page);

}
