package com.carsharing.ps.pscarsharing.playground.controller;

import com.carsharing.ps.pscarsharing.playground.model.BalanceBracketResponse;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BalanceBracketServiceTest {
    private final BalanceBracketService balanceBracketService = new BalanceBracketService();

    @Test
    public void givenBalancedBracketInput_whenBalance_thenReturnBalanceBracketsResponse() {
        //given
        String balancedBracketsInput = "()(())";
        //when
        BalanceBracketResponse response = balanceBracketService.balance(balancedBracketsInput);
        //then
        assertThat(response).isEqualTo(BalanceBracketResponse.BALANCE_BRACKET);
        assertThat(response.getMessage()).isEqualTo("Has balanced brackets");
    }

    @Test
    public void givenUnBalancedBracketInput_whenBalance_thenReturnUnBalanceBracketsResponse() {
        //given
        String balancedBracketsInput = "))(())((";
        //when
        BalanceBracketResponse response = balanceBracketService.balance(balancedBracketsInput);
        //then
        assertThat(response).isEqualTo(BalanceBracketResponse.UNBALANCE_BRACKET);
        assertThat(response.getMessage()).isEqualTo("Has unbalanced brackets");
    }

    @Test
    public void givenNullInput_whenBalance_thenReturnUnBalanceBracketsResponse() {
        //given
        //when
        BalanceBracketResponse response = balanceBracketService.balance(null);
        //then
        assertThat(response).isEqualTo(BalanceBracketResponse.UNBALANCE_BRACKET);
        assertThat(response.getMessage()).isEqualTo("Has unbalanced brackets");
    }

    @Test
    public void givenInputWithoutBrackets_whenBalance_thenReturnUnBalanceBracketsResponse() {
        //given
        //when
        BalanceBracketResponse response = balanceBracketService.balance("123456");
        //then
        assertThat(response).isEqualTo(BalanceBracketResponse.UNBALANCE_BRACKET);
        assertThat(response.getMessage()).isEqualTo("Has unbalanced brackets");
    }
}
