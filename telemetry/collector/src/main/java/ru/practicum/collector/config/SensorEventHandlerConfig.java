package ru.practicum.collector.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.practicum.collector.enums.sensor.SensorEventType;
import ru.practicum.collector.handlers.sensor.*;

import java.util.HashMap;
import java.util.Map;

@Configuration
@RequiredArgsConstructor
public class SensorEventHandlerConfig {
    private final ClimateSensorHandler climateHandler;
    private final LightSensorHandler lightHandler;
    private final MotionSensorHandler motionHandler;
    private final SwitchSensorHandler switchHandler;
    private final TemperatureSensorHandler temperatureHandler;

    @Bean
    public Map<SensorEventType, SensorEventHandler> getSensorEventHandlers() {
        Map<SensorEventType, SensorEventHandler> sensorEventHandlers = new HashMap<>();

        return Map.of(
                SensorEventType.SWITCH_SENSOR_EVENT,      switchHandler,
                SensorEventType.CLIMATE_SENSOR_EVENT,     climateHandler,
                SensorEventType.LIGHT_SENSOR_EVENT,       lightHandler,
                SensorEventType.MOTION_SENSOR_EVENT,      motionHandler,
                SensorEventType.TEMPERATURE_SENSOR_EVENT, temperatureHandler
        );

    }
}
