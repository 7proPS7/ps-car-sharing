package com.carsharing.ps.pscarsharing.playground.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BalanceBracketResponse {
    BALANCE_BRACKET("Has balanced brackets"),
    UNBALANCE_BRACKET("Has unbalanced brackets");

    private final String message;
}
