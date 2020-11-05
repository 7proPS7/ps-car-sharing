package com.carsharing.ps.pscarsharing.playground.controller;

import com.carsharing.ps.pscarsharing.playground.model.BalanceBracketResponse;
import com.carsharing.ps.pscarsharing.playground.service.BalanceBracketService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/playground")
@Tag(name = "playground", description = "the playground API")
public class PlaygroundController {
    public static final String QUOTATION_MARK = "'";
    private final BalanceBracketService balanceBracketService;

    @Operation(summary = "Balance brackets or unbalanced",
            description = "Check if input has balanced or unbalanced brackets and print result", tags = "user")
    @ApiResponses(
            @ApiResponse(responseCode = "200", description = "Success",
                    content = @Content(array = @ArraySchema(
                            schema = @Schema(implementation = BalanceBracketResponse.class)))))
    @PostMapping(name = "/balanceBrackets", produces = "text/plain")
    public ResponseEntity<?> balancedBrackets(
            @Parameter(description = "input as balanced '1+(1)' or unbalanced brackets ')(1+'")
            @RequestParam String input) {
        return ResponseEntity.ok(QUOTATION_MARK + input + QUOTATION_MARK + " "
                + balanceBracketService.balance(input).getMessage());
    }
}
