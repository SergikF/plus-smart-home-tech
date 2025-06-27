package ru.practicum.collector.client;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.practicum.collector.enums.hub.HubEventType;
import ru.practicum.collector.enums.sensor.SensorEventType;
import ru.practicum.collector.events.hub.HubEvent;
import ru.practicum.collector.events.sensor.SensorEvent;
import ru.practicum.collector.handlers.hub.HubEventHandler;
import ru.practicum.collector.handlers.sensor.SensorEventHandler;

import java.util.Map;

@Service
@Slf4j
@RequiredArgsConstructor
public class CollectorClientImpl implements CollectorClient {
    private final Map<SensorEventType, SensorEventHandler> sensorEventHandlers;
    private final Map<HubEventType, HubEventHandler> hubEventHandlers;

    @Override
    public void collectSensorEvent(SensorEvent sensorEvent) {
        SensorEventHandler handler = sensorEventHandlers.get(sensorEvent.getType());
        if (handler == null) {
            log.warn("Нет handler для SensorEventType: {}", sensorEvent.getType());
            return;
        }
        try {
            handler.handle(sensorEvent);
        } catch (Exception e) {
            log.error("Ошибка при обработке sensorEvent: {}", sensorEvent, e);
        }
    }

    @Override
    public void collectHubEvent(HubEvent hubEvent) {
        HubEventHandler handler = hubEventHandlers.get(hubEvent.getType());
        if (handler == null) {
            log.warn("Нет handler для HubEventType: {}", hubEvent.getType());
            return;
        }
        try {
            handler.handle(hubEvent);
        } catch (Exception e) {
            log.error("Ошибка при обработке hubEvent: {}", hubEvent, e);
        }
    }
}
