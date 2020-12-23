package dev.alvarocar.msscbeerservice.model.dto;

import dev.alvarocar.msscbeerservice.model.constants.EBeerStyle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Beer {

    private UUID id;
    private Integer version;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;

    private String name;
    private EBeerStyle style;

    private Long upc;
    private BigDecimal price;
    private Integer quantityOnHand;
}
