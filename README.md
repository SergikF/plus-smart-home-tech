# Smart Home Technologies

**Спринт № 22.**  ( 9-gateway-microservices )

*Филипповских Сергей. Когорта 53.*

### Архитектура
| Модуль         | Описание                          |
|----------------|-----------------------------------|
| **`telemetry`**| Автоматизация сценариев умного дома |
| **`infra`**    | Центр управления сервисами (Spring Cloud) |
| **`commerce`** | Интернет-магазин устройств         |

---
## Технологии:

- Java 21
- Spring Boot 3.3.2
- PostgreSQL
- Spring Data JPA
- Hibernate ORM
- Apache Kafka
- Apache Avro
- Protocol Buffers
- gRPC
- Spring Cloud Config
- Spring Cloud Eureka
- Spring Cloud Feign
- Spring Cloud Gateway
- Spring Cloud Load Balancer

---
## API:

- [Витрина магазина](openapi/shopping-store.json)
- [Корзина покупателя](openapi/shopping-cart.json)
- [Склад магазина](openapi/warehouse.json)
- [Заказы](openapi/order.json)
- [Сервис оплаты](openapi/payment.json)
- [Сервис доставки](openapi/delivery.json)
---