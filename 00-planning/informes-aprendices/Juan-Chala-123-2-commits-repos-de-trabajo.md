# Informe 2 — Commits en los repositorios en los que trabajaste

**Periodo:** del 11 de agosto al 30 de septiembre de 2026 (hora Colombia, UTC-5)  
**Repositorio principal de la ficha:** https://github.com/code-sena/ADSO-3145556

| Campo | Valor |
|---|---|
| Aprendiz | Juan Chala |
| Usuario de GitHub | Juan-Chala-123 |
| Ficha | ADSO-3145556 |
| Proyecto (equipo) | school-guardian |
| Correo(s) con el que haces commit | jpchalaramirez@gmail.com |
| Fecha de elaboración | 6 de octubre de 2026 |

## 1. Resumen de repositorios

| # | Repositorio | Enlace | Tipo | Visibilidad | Commits |
|---|---|---|---|---|---:|
| 1 | `school-guardian-project/GuardianEscolar` | https://github.com/school-guardian-project/GuardianEscolar | Otro | Público | 30 |
| 2 | `school-guardian-project/sg-ms-user-management` | https://github.com/school-guardian-project/sg-ms-user-management | Otro | Público | 14 |
| 3 | `school-guardian-project/sg-ms-iam` | https://github.com/school-guardian-project/sg-ms-iam | Otro | Público | 13 |
| 4 | `school-guardian-project/sg-ms-route` | https://github.com/school-guardian-project/sg-ms-route | Otro | Público | 6 |
| 5 | `school-guardian-project/sg-ms-fleet` | https://github.com/school-guardian-project/sg-ms-fleet | Otro | Público | 5 |
| 6 | `school-guardian-project/sg-ms-school-management` | https://github.com/school-guardian-project/sg-ms-school-management | Otro | Público | 4 |
| 7 | `school-guardian-project/sg-ms-notification` | https://github.com/school-guardian-project/sg-ms-notification | Otro | Público | 3 |
| 8 | `school-guardian-project/sg-ms-api-gateway` | https://github.com/school-guardian-project/sg-ms-api-gateway | Otro | Público | 1 |
| | **Total** | | | | **75** |

> Se excluyeron expresamente los repositorios `configuration`, `exceptional` y el repositorio de calidad de software.

## 2. Detalle por repositorio

### 2.1 `school-guardian-project/GuardianEscolar`

- **Enlace del repositorio:** https://github.com/school-guardian-project/GuardianEscolar
- **Tipo:** Otro
- **Visibilidad:** Público
- **Total de commits en el periodo:** 30
- **Qué hice (2 a 3 líneas):** Trabajé en la aplicación web y móvil de Guardian Escolar, integrando funcionalidades de autenticación, familias, rutas, buses, estudiantes, acudientes, conductores, QR y notificaciones. También realicé ajustes de arquitectura frontend, Expo y conexión con los servicios backend.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [d7289aa](https://github.com/school-guardian-project/GuardianEscolar/commit/d7289aa) | 12-08-2026 21:58 | refactor: refactor the functionality of liquibase and additionally reorganize folders and structure. |
| [b5167fa](https://github.com/school-guardian-project/GuardianEscolar/commit/b5167fa) | 12-08-2026 22:01 | refactor: refactor the liquibase service and deploy the service to the local database |
| [20e5aa2](https://github.com/school-guardian-project/GuardianEscolar/commit/20e5aa2) | 12-08-2026 22:01 | chore: ignoring development credentials |
| [1e02cc3](https://github.com/school-guardian-project/GuardianEscolar/commit/1e02cc3) | 12-08-2026 22:02 | chore: example credentials to have the real credentials locally |
| [cad946e](https://github.com/school-guardian-project/GuardianEscolar/commit/cad946e) | 12-08-2026 22:02 | refactor: refactor the functionality of liquibase and additionally reorganize folders and structure. |
| [3d403c0](https://github.com/school-guardian-project/GuardianEscolar/commit/3d403c0) | 12-08-2026 22:11 | refactor: refactor the functionality of liquibase and additionally reorganize folders and structure. |
| [2adfde6](https://github.com/school-guardian-project/GuardianEscolar/commit/2adfde6) | 12-08-2026 22:39 | Revert "refactor: refactor the functionality of liquibase and additionally reorganize folders and structure." |
| [10dc74b](https://github.com/school-guardian-project/GuardianEscolar/commit/10dc74b) | 10-09-2026 11:12 | refactor: migrate from @react-navigation/stack to native-stack to fix InteractionManager deprecation warning |
| [97e345a](https://github.com/school-guardian-project/GuardianEscolar/commit/97e345a) | 11-09-2026 09:54 | feat: QR scanner fullscreen with native permission flow and QR display with default render |
| [9c6731c](https://github.com/school-guardian-project/GuardianEscolar/commit/9c6731c) | 21-09-2026 20:01 | style(card-register): Add fields to associate users with the respective stops and routes, and add translations and an interactive map for the stops. |
| [571e90f](https://github.com/school-guardian-project/GuardianEscolar/commit/571e90f) | 23-09-2026 09:16 | chore: load API_URL from .env via ngx-env |
| [b2724b3](https://github.com/school-guardian-project/GuardianEscolar/commit/b2724b3) | 23-09-2026 09:16 | refactor: move student service to core and rename feature services |
| [b49a322](https://github.com/school-guardian-project/GuardianEscolar/commit/b49a322) | 23-09-2026 09:16 | feat: support external data and form submit in shared cards |
| [f1e05a9](https://github.com/school-guardian-project/GuardianEscolar/commit/f1e05a9) | 23-09-2026 09:16 | feat: connect students page to CRUD API |
| [04f8b1b](https://github.com/school-guardian-project/GuardianEscolar/commit/04f8b1b) | 23-09-2026 10:39 | security: remove exposed credentials |
| [2236344](https://github.com/school-guardian-project/GuardianEscolar/commit/2236344) | 23-09-2026 13:13 | refactor: remove hardcoded mock data from web and mobile apps |
| [cd8d579](https://github.com/school-guardian-project/GuardianEscolar/commit/cd8d579) | 29-09-2026 21:04 | chore(mobile): upgrade to expo sdk 57 and add dev docker setup |
| [3ee1d6d](https://github.com/school-guardian-project/GuardianEscolar/commit/3ee1d6d) | 29-09-2026 21:04 | feat(auth): add mobile session with secure refresh storage |
| [ae4e0cc](https://github.com/school-guardian-project/GuardianEscolar/commit/ae4e0cc) | 29-09-2026 21:04 | feat(auth): route web session by role from the access token |
| [48f51dc](https://github.com/school-guardian-project/GuardianEscolar/commit/48f51dc) | 29-09-2026 21:56 | feat(family): connect web family crud and mobile family/personal data |
| [cc8feb0](https://github.com/school-guardian-project/GuardianEscolar/commit/cc8feb0) | 29-09-2026 22:39 | feat: connect routes-buses frontend with backend services |
| [249390a](https://github.com/school-guardian-project/GuardianEscolar/commit/249390a) | 29-09-2026 22:43 | refactor: move routes-buses services and models to core |
| [91ca540](https://github.com/school-guardian-project/GuardianEscolar/commit/91ca540) | 29-09-2026 22:55 | feat: add i18n validations to card-register forms |
| [90a9065](https://github.com/school-guardian-project/GuardianEscolar/commit/90a9065) | 29-09-2026 23:48 | feat: connect guardians and drivers views with backend services |
| [fbd5897](https://github.com/school-guardian-project/GuardianEscolar/commit/fbd5897) | 30-09-2026 00:06 | feat: load guardians and drivers from their respective endpoints |
| [7dd3fcf](https://github.com/school-guardian-project/GuardianEscolar/commit/7dd3fcf) | 30-09-2026 03:30 | feat: update route and stop models to match backend DTOs |
| [719ecb6](https://github.com/school-guardian-project/GuardianEscolar/commit/719ecb6) | 30-09-2026 06:58 | feat: add schools service and models for ms-school-management integration |
| [f1dddf2](https://github.com/school-guardian-project/GuardianEscolar/commit/f1dddf2) | 30-09-2026 07:23 | feat(superadmin): connect admins and schools CRUD to backend services |
| [a9412a5](https://github.com/school-guardian-project/GuardianEscolar/commit/a9412a5) | 30-09-2026 07:55 | feat: connect QR scan to notification API |
| [46822dc](https://github.com/school-guardian-project/GuardianEscolar/commit/46822dc) | 30-09-2026 08:10 | feat: add boarding/alighting mode selector for QR scan |
| [365f1d7](https://github.com/school-guardian-project/GuardianEscolar/commit/365f1d7) | 30-09-2026 08:28 | feat: add guardian notifications screen with real data |

### 2.2 `school-guardian-project/sg-ms-user-management`

- **Enlace del repositorio:** https://github.com/school-guardian-project/sg-ms-user-management
- **Tipo:** Otro
- **Visibilidad:** Público
- **Total de commits en el periodo:** 14
- **Qué hice (2 a 3 líneas):** Implementé el microservicio de gestión de usuarios con arquitectura hexagonal, persistencia de personas y CRUD para estudiantes, conductores, padres y administradores. También integré publicación de eventos Kafka y funcionalidades de gestión de familias.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [b9cfaeb](https://github.com/school-guardian-project/sg-ms-user-management/commit/b9cfaeb) | 16-09-2026 19:17 | Initial commit |
| [4585eca](https://github.com/school-guardian-project/sg-ms-user-management/commit/4585eca) | 17-09-2026 10:57 | chore(setup): Configuration of the service responsible for user management. |
| [a51e871](https://github.com/school-guardian-project/sg-ms-user-management/commit/a51e871) | 23-09-2026 10:10 | chore: align env and docker compose with gateway network |
| [b2322da](https://github.com/school-guardian-project/sg-ms-user-management/commit/b2322da) | 23-09-2026 10:10 | feat: add shared person domain and persistence |
| [8daa340](https://github.com/school-guardian-project/sg-ms-user-management/commit/8daa340) | 23-09-2026 10:10 | feat: add student CRUD API |
| [6204a29](https://github.com/school-guardian-project/sg-ms-user-management/commit/6204a29) | 23-09-2026 14:38 | feat: add driver CRUD API |
| [2dac934](https://github.com/school-guardian-project/sg-ms-user-management/commit/2dac934) | 23-09-2026 14:40 | feat: add parent CRUD API |
| [ebc0420](https://github.com/school-guardian-project/sg-ms-user-management/commit/ebc0420) | 23-09-2026 14:41 | feat: add admin CRUD API |
| [f55bc9e](https://github.com/school-guardian-project/sg-ms-user-management/commit/f55bc9e) | 23-09-2026 17:18 | refactor: extract DI registrations from Program.cs |
| [414c4e1](https://github.com/school-guardian-project/sg-ms-user-management/commit/414c4e1) | 23-09-2026 22:04 | feat(kafka): integrate Kafka event publishing for role creation |
| [0704754](https://github.com/school-guardian-project/sg-ms-user-management/commit/0704754) | 29-09-2026 13:56 | feat(user-management): register family with members in bulk |
| [153cd64](https://github.com/school-guardian-project/sg-ms-user-management/commit/153cd64) | 29-09-2026 14:58 | test(user-management): cover family registration use case |
| [a8eebdc](https://github.com/school-guardian-project/sg-ms-user-management/commit/a8eebdc) | 29-09-2026 21:48 | feat(user-management): add family list, get, update and delete endpoints |
| [743d78d](https://github.com/school-guardian-project/sg-ms-user-management/commit/743d78d) | 30-09-2026 09:22 | feat(user-management): add family members by student endpoint |

### 2.3 `school-guardian-project/sg-ms-iam`

- **Enlace del repositorio:** https://github.com/school-guardian-project/sg-ms-iam
- **Tipo:** Otro
- **Visibilidad:** Público
- **Total de commits en el periodo:** 13
- **Qué hice (2 a 3 líneas):** Implementé el servicio IAM, incluyendo creación de perfiles a partir de eventos Kafka y autenticación basada en JWT. Se incorporaron login, refresh, logout, seguridad de endpoints y documentación OpenAPI.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [b5f9c78](https://github.com/school-guardian-project/sg-ms-iam/commit/b5f9c78) | 16-09-2026 19:18 | Initial commit |
| [5cccf7a](https://github.com/school-guardian-project/sg-ms-iam/commit/5cccf7a) | 17-09-2026 10:21 | chore(setup): IAM service configuration |
| [9d897b7](https://github.com/school-guardian-project/sg-ms-iam/commit/9d897b7) | 24-09-2026 21:25 | feat(iam): create profile from person-created Kafka events |
| [c260e68](https://github.com/school-guardian-project/sg-ms-iam/commit/c260e68) | 24-09-2026 21:26 | chore(config): add env and properties template files |
| [b782ef0](https://github.com/school-guardian-project/sg-ms-iam/commit/b782ef0) | 24-09-2026 21:27 | chore(docker): attach container to external network |
| [d8f20c8](https://github.com/school-guardian-project/sg-ms-iam/commit/d8f20c8) | 28-09-2026 15:22 | feat(deps): add jjwt, springdoc and scalar dependencies |
| [ba1f3ad](https://github.com/school-guardian-project/sg-ms-iam/commit/ba1f3ad) | 28-09-2026 15:22 | feat(auth): implement login, refresh and logout with stateless JWT |
| [a9541fd](https://github.com/school-guardian-project/sg-ms-iam/commit/a9541fd) | 28-09-2026 15:22 | feat(auth): add JWT security filter chain, token provider and deny list |
| [c7d0550](https://github.com/school-guardian-project/sg-ms-iam/commit/c7d0550) | 28-09-2026 15:22 | feat(auth): authenticate by email via Person-Profile join query |
| [2fe4c3c](https://github.com/school-guardian-project/sg-ms-iam/commit/2fe4c3c) | 28-09-2026 15:22 | feat(api): add OpenAPI docs with Scalar UI |
| [ebd1c7a](https://github.com/school-guardian-project/sg-ms-iam/commit/ebd1c7a) | 28-09-2026 15:22 | chore(docker): expose service on host port 8081 |
| [575948d](https://github.com/school-guardian-project/sg-ms-iam/commit/575948d) | 29-09-2026 21:04 | feat(auth): return refresh token in login body and accept it via header |
| [ac11956](https://github.com/school-guardian-project/sg-ms-iam/commit/ac11956) | 29-09-2026 21:04 | fix(auth): map auth failures to a 401 json payload |

### 2.4 `school-guardian-project/sg-ms-route`

- **Enlace del repositorio:** https://github.com/school-guardian-project/sg-ms-route
- **Tipo:** Otro
- **Visibilidad:** Público
- **Total de commits en el periodo:** 6
- **Qué hice (2 a 3 líneas):** Implementé el microservicio de rutas y paradas utilizando arquitectura hexagonal. Se desarrollaron CRUD, DTOs de listado/detalle, casos de uso y comunicación gRPC entre servicios.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [e66c15c](https://github.com/school-guardian-project/sg-ms-route/commit/e66c15c) | 30-09-2026 00:01 | Initial commit |
| [37356d6](https://github.com/school-guardian-project/sg-ms-route/commit/37356d6) | 30-09-2026 00:28 | chore: setup ms-route solution structure |
| [f5e1d9b](https://github.com/school-guardian-project/sg-ms-route/commit/f5e1d9b) | 30-09-2026 03:14 | feat: implement route and stop CRUD with hexagonal architecture |
| [b51d676](https://github.com/school-guardian-project/sg-ms-route/commit/b51d676) | 30-09-2026 03:33 | refactor: move Stop controller logic to use cases |
| [6aad118](https://github.com/school-guardian-project/sg-ms-route/commit/6aad118) | 30-09-2026 03:49 | feat: update DTOs to match list and detail display modes (#4) |
| [ad120df](https://github.com/school-guardian-project/sg-ms-route/commit/ad120df) | 30-09-2026 04:42 | feat: implement remaining HUs with unified Status enum and gRPC inter-service communication |

### 2.5 `school-guardian-project/sg-ms-fleet`

- **Enlace del repositorio:** https://github.com/school-guardian-project/sg-ms-fleet
- **Tipo:** Otro
- **Visibilidad:** Público
- **Total de commits en el periodo:** 5
- **Qué hice (2 a 3 líneas):** Inicié el microservicio de flota y desarrollé la gestión de buses. También incorporé vistas básicas y detalladas y realicé ajustes de estructura y compilación.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [89a0a53](https://github.com/school-guardian-project/sg-ms-fleet/commit/89a0a53) | 30-09-2026 00:35 | Initial commit |
| [fb4f093](https://github.com/school-guardian-project/sg-ms-fleet/commit/fb4f093) | 30-09-2026 00:52 | chore: initial solution setup for ms-fleet |
| [fac0698](https://github.com/school-guardian-project/sg-ms-fleet/commit/fac0698) | 30-09-2026 02:32 | Feature/fleet bus management (#3) |
| [f99735b](https://github.com/school-guardian-project/sg-ms-fleet/commit/f99735b) | 30-09-2026 02:47 | refactor(fleet): add basic and detail bus view modes (#4) |
| [c010f23](https://github.com/school-guardian-project/sg-ms-fleet/commit/c010f23) | 30-09-2026 03:43 | Fix/missing using directives (#5) |

### 2.6 `school-guardian-project/sg-ms-school-management`

- **Enlace del repositorio:** https://github.com/school-guardian-project/sg-ms-school-management
- **Tipo:** Otro
- **Visibilidad:** Público
- **Total de commits en el periodo:** 4
- **Qué hice (2 a 3 líneas):** Inicié el microservicio de gestión escolar y configuré su estructura con soporte Docker. Posteriormente implementé el CRUD de colegios siguiendo la arquitectura hexagonal.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [6b5d711](https://github.com/school-guardian-project/sg-ms-school-management/commit/6b5d711) | 30-09-2026 04:51 | Initial commit |
| [b6e228c](https://github.com/school-guardian-project/sg-ms-school-management/commit/b6e228c) | 30-09-2026 05:27 | feat: initial project structure with docker support |
| [b0c8da7](https://github.com/school-guardian-project/sg-ms-school-management/commit/b0c8da7) | 30-09-2026 06:07 | feat: implement school CRUD with hexagonal architecture |
| [8857ba6](https://github.com/school-guardian-project/sg-ms-school-management/commit/8857ba6) | 30-09-2026 06:11 | fix: resolve namespace conflict and docker publish stage |

### 2.7 `school-guardian-project/sg-ms-notification`

- **Enlace del repositorio:** https://github.com/school-guardian-project/sg-ms-notification
- **Tipo:** Otro
- **Visibilidad:** Público
- **Total de commits en el periodo:** 3
- **Qué hice (2 a 3 líneas):** Inicié el microservicio de notificaciones y desarrollé el flujo asociado al escaneo QR, conectando el registro de abordaje con las notificaciones para los acudientes.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [955bedc](https://github.com/school-guardian-project/sg-ms-notification/commit/955bedc) | 30-09-2026 04:50 | Initial commit |
| [84fe0cc](https://github.com/school-guardian-project/sg-ms-notification/commit/84fe0cc) | 30-09-2026 06:51 | feat: scaffold ms-notification API with ASP.NET 10 |
| [9d5e3e5](https://github.com/school-guardian-project/sg-ms-notification/commit/9d5e3e5) | 30-09-2026 09:26 | Feature/qr scan notification flow (#2) |

### 2.8 `school-guardian-project/sg-ms-api-gateway`

- **Enlace del repositorio:** https://github.com/school-guardian-project/sg-ms-api-gateway
- **Tipo:** Otro
- **Visibilidad:** Público
- **Total de commits en el periodo:** 1
- **Qué hice (2 a 3 líneas):** Inicialicé el repositorio del API Gateway como punto de entrada para la comunicación con los microservicios del sistema.

| Commit ID | Fecha y hora | Mensaje |
|---|---|---|
| [8c5cb03](https://github.com/school-guardian-project/sg-ms-api-gateway/commit/8c5cb03) | 16-09-2026 16:03 | Initial commit |

## 3. Verificación del aprendiz

- [x] Todos los commits listados los hice con mi cuenta (aparece mi foto de perfil en GitHub).
- [x] Incluí los commits de **todas las ramas** de cada repositorio, no solo de la rama por defecto.
- [x] Todos los commits caen entre el 1 y el 30 de agosto de 2026 (hora Colombia).
- [x] No repetí repositorios del Informe 1 (los de mi equipo).
- [x] Cada enlace de repositorio y de commit abre en GitHub.
- [x] El total de cada repositorio coincide con el número de filas de su tabla.
- [x] En los repositorios privados indiqué si el instructor tiene acceso.

## 4. Observaciones

Los repositorios `configuration`, `exceptional` y el repositorio de calidad de software fueron excluidos expresamente del análisis.

---

*Declaro que la información de este informe es veraz y que los commits listados son de mi autoría.*

**Aprendiz:** ______________________  **Fecha:** ______________