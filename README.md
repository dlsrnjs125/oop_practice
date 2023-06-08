# oop_practice
## < 테스트 코드 작성 이유? >
- 문서화 역할
- 코드에 결함을 발견하기 위함
- 리팩토링 시 (심리적) 안전성 확보
- 테스트 하기 쉬운 코드를 작성하다 보면 더 낮은 결합도의 설계를 얻을 수 있다.

### TDD
- Test Driven Development : 테스트 주도 개발
- 프로덕션 코드보다 테스트 코드를 먼저 작성하는 개발 방법
- TFD(Test Firest Development) + 리팩터링
- 기능 동작을 검증(메소드 단위

### BDD
- Behavior Driven Development(행위 주도 개발)
- 시나리오 기반으로 테스트 코드를 작성하는 개발 구조
- 하나의 시나리오는 Given, When, Then 구조를 가짐

## 비밀번호 유효성 검증기
- 요구사항
    - 비밀번호는 최소 8자 이상 12자 이하여야 한다.
    - 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalAgumentException 예외 발생
    - 경계조건에 대해 테스트 코드를 작성해야 한다.

## 사칙연산 계산기 구현
- 요구사항
    - 간단한 사칙연산을 할 수 있다.
    - 양수로만 계산할 수 있다.
    - 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.
    - MVC 패턴 (Model-View-Controller) 기반으로 구현한다.
