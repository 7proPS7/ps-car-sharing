package com.carsharing.ps.pscarsharing.playground.controller;

import com.carsharing.ps.pscarsharing.playground.model.BalanceBracketResponse;
import org.springframework.stereotype.Service;

@Service
public class BalanceBracketService {

    public BalanceBracketResponse balance(String input) {
        return BalanceBracketResponse.BALANCE_BRACKET;
    }
}
