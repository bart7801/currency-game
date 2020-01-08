package com.bart.currencygame.gui;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import com.bart.currencygame.entity.CurrencyRank;
import com.bart.currencygame.repo.CurrencyRankRepo;

@Route("rank")
public class Rank extends VerticalLayout {

    @Autowired
    public Rank(CurrencyRankRepo currencyRankRepo) {
        Grid<CurrencyRank> grid = new Grid<>(CurrencyRank.class);
        grid.setItems(currencyRankRepo.findAll());
        add(grid);
    }
}
