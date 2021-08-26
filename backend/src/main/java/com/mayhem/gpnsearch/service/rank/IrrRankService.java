package com.mayhem.gpnsearch.service.rank;

import com.mayhem.gpnsearch.model.Company;
import org.springframework.stereotype.Service;

@Service
public class IrrRankService implements RankService {

    @Override
    public Company fillWithRankInfo(Company company) {
        return company;
    }

}
