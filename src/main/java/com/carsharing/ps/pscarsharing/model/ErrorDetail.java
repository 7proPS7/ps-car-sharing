package com.carsharing.ps.pscarsharing.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetail {
    @Schema(
            description = "HTTP status error code",
            example = "400"
    )
    private String errorCode;

    @Schema(
            description = "HTTP error description and details",
            example = "Member not exists in Database"
    )
    private String errorDescription;
}
