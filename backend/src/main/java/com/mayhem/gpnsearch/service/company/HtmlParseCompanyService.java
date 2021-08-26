package com.mayhem.gpnsearch.service.company;

import com.mayhem.gpnsearch.model.Company;
import com.mayhem.gpnsearch.model.Okved;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class HtmlParseCompanyService implements CompanyService {

    @Override
    public int getCompaniesPagesAmount(Okved okved) {
        return 5;
    }

    @Override
    public List<Company> findCompanies(Okved okved, int page) {
        List<Company> companies = new ArrayList<>();
        companies.add(new Company(
                "ООО\"Test 1\"", "Иванов Иван Иванович",
                "г. Москва, ул. Пушкина, д. Колотушкина",
                "1000000000", "1000000000000", new Date(), new BigDecimal("10000"),
                new Okved(60000, "Добыча сырой нефти и природного газа")
                ));
        companies.add(new Company(
                "ООО\"Test 2\"", "Петров Петр Петрович",
                "г. Москва, ул. Пушкина, д. Колотушкина",
                "2000000000", "2000000000000", new Date(), new BigDecimal("20000"),
                new Okved(60000, "Добыча сырой нефти и природного газа")
        ));
        return companies;
    }

}
