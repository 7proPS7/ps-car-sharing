package com.carsharing.ps.pscarsharing.controller;

import com.carsharing.ps.pscarsharing.entity.User;
import com.carsharing.ps.pscarsharing.model.ErrorDetail;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
@Tag(name = "user", description = "The user API")
public class UserController {

    @Operation(summary = "Find all users", description = "Find all users", tags = "user")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "Success",
                            content = @Content(array = @ArraySchema(schema = @Schema(implementation = User.class)))),
                    @ApiResponse(responseCode = "400", description = "Bad request",
                            content = @Content(schema = @Schema(implementation = ErrorDetail.class))
                    )
            }
    )
    @GetMapping(name = "/all", produces = "application/json")
    public ResponseEntity<?> all() {
        return ResponseEntity.ok(new User(1, "DWA"));
    }

    @GetMapping(name = "/not-all")
    public ResponseEntity<?> notAll() {
        return ResponseEntity.ok(new User(1, "Jeden"));
    }
}
