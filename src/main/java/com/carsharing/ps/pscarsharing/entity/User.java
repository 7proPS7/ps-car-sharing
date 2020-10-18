package com.carsharing.ps.pscarsharing.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Schema(
            description = "User name",
            example = "pawelS"
    )
    private String name;
}
