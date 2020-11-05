package com.carsharing.ps.pscarsharing.playground.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BalanceBracketResponse {
    BALANCE_BRACKET("Has balanced bracket"),
    UNBALANCE_BRACKET("Has unbalanced bracket");

    private final String message;
}
