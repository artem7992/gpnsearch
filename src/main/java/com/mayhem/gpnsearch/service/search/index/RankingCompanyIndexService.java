package com.mayhem.gpnsearch.service.search.index;

import com.mayhem.gpnsearch.model.Company;
import com.mayhem.gpnsearch.model.Okved;
import com.mayhem.gpnsearch.service.company.CompanyService;
import com.mayhem.gpnsearch.service.rank.RankService;
import com.mayhem.gpnsearch.service.search.SearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankingCompanyIndexService implements CompanyIndexService {

    private static final Logger logger = LoggerFactory.getLogger(RankingCompanyIndexService.class);

    private final CompanyService companyService;
    private final SearchService searchService;
    private final RankService rankService;

    @Autowired
    public RankingCompanyIndexService(CompanyService companyService, SearchService searchService, RankService rankService) {
        this.companyService = companyService;
        this.searchService = searchService;
        this.rankService = rankService;
    }

    public void indexCompanies(List<Okved> okveds) {
        logger.info("Started index companies for okveds: " + okveds);
        for (Okved okved: okveds) {
            indexCompaniesByOkved(okved);
        }
        logger.info("Finished index companies for okveds: " + okveds);
    }

    private void indexCompaniesByOkved(Okved okved) {
        logger.info("Started index companies for okved: " + okved);
        int pages = companyService.getCompaniesPagesAmount(okved);
        logger.info("Found " + pages + " companies pages");
        for (int page = 1; page <= pages; page++) {
            List<Company> companies = companyService.findCompanies(okved, page);
            logger.info("Found " + companies.size() + " companies on page: " + page);
            rankingCompanies(companies);
        }
        logger.info("Finished index companies for okved: " + okved);
    }

    private void rankingCompanies(List<Company> companies) {
        for (Company company: companies) {
            Company rankedCompany = rankService.fillWithRankInfo(company);
            searchService.save(rankedCompany);
            logger.info("Company saved to search service: " + rankedCompany);
        }
    }

}
