package ru.practicum.dto.store;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.util.Collections;
import java.util.List;

@Getter
@ToString
@Setter
public class Pageable {
    @Min(value = 0)
    private Integer page = 0;
    @Min(value = 1)
    private Integer size = 1;
    private List<String> sort = Collections.emptyList();
    private String direction = "ASC";
}
