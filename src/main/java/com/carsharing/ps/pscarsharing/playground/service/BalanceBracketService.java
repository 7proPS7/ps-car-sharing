package com.carsharing.ps.pscarsharing.playground.service;

import com.carsharing.ps.pscarsharing.playground.model.BalanceBracketResponse;
import org.springframework.stereotype.Service;

import java.util.Deque;
import java.util.LinkedList;

@Service
public class BalanceBracketService {

    public BalanceBracketResponse balance(String input) {
        if (input == null)
            return BalanceBracketResponse.UNBALANCE_BRACKET;

        Deque<Character> brackets = new LinkedList<>();
        for (char character : input.toCharArray()) {
            if (character == '(')
                brackets.addFirst(character);
            else {
                if (!brackets.isEmpty()
                        && ((brackets.peekFirst() == '(' && character == ')')))
                    brackets.removeFirst();
                else return BalanceBracketResponse.UNBALANCE_BRACKET;
            }
        }
        return BalanceBracketResponse.BALANCE_BRACKET;
    }
}
