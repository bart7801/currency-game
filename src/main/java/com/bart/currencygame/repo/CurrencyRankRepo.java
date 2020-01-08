package com.bart.currencygame.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bart.currencygame.entity.CurrencyRank;

@Repository
public interface CurrencyRankRepo extends JpaRepository<CurrencyRank, Long> {
}
