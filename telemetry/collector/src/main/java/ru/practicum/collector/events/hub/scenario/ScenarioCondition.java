package ru.practicum.collector.events.hub.scenario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import ru.practicum.collector.enums.hub.ConditionOperation;
import ru.practicum.collector.enums.hub.ConditionType;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public class ScenarioCondition {
    @NotBlank
    String sensorId;
    @NotNull
    ConditionType type;
    @NotNull
    ConditionOperation operation;
    Integer value;
}
