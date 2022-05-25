# 1단계 - 문자열 덧셈 계산기

## 기능 요구 사항
- 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)  
- 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.  
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.

## 프로그래밍 요구사항
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
- 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
- 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메서드)를 분리하면 된다.
- 함수(또는 메서드)의 길이가 10라인을 넘어가지 않도록 구현한다.
- 함수(또는 메서드)가 한 가지 일만 잘 하도록 구현한다.


## step1
### 1차 todo list
- [x] 쉼표 또는 콜론을 기준으로 구분한다
- [x] 구분된 숫자들의 합을 반환한다
- [x] 숫자이외의 값을 전달하면 런타임익셉션 예외발생
- [x] 음수를 전달하면 런타임 익셉션 예외발생
- [x] 커스텀 구분자를 지정할 수 있다
- [x] 빈 문자열, null일 경우 0을 반환한다

### 2차 todo list
- [x] 디렉토리 구조 잡기
- [x] test클래스와 실제 클래스 명 일치
- [x] object 사용 고려하기
- [x] 상수들 선언으로 사용

### 3차 todo list
- [x] 테스트 클래스 위치를 실제 클래스와 맞추기
- [x] 커스텀 구분자의 sum test
- [x] 오타수정
- [x] InputParser object클래스
- [x] domain 에서 view 패키지 참조 수정


# 2단계 - 로또(자동)

## 기능 요구사항
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1000원이다.

## 프로그래밍 요구 사항
- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
- 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
- UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
- 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
- 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메서드)를 분리하면 된다.
- 함수(또는 메서드)의 길이가 15라인을 넘어가지 않도록 구현한다.
- 함수(또는 메서드)가 한 가지 일만 잘 하도록 구현한다.
- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.

### 1차 todo list
- [x] 중복없는 6개의 수를 1~45에서 랜덤하게 뽑는다
- [x] 구매금액을 입력받는다
- [x] 1000원당 한줄의 랜덤수 뽑는다
- [x] 지난 주 당첨번호를 입력받는다
- [x] 3~6개 일치하는 케이스가 몇갠지 센다
- [x] 총 구매금액 대비 수익률을 계산한다
- [x] 역할별 패키지 분리
- [x] 랜덤 로또숫자를 출력할 수 있다.
- [x] 변수명 정리
- [x] 테스트케이스 추가
- [x] 매직넘버 정리
- [x] 린트 정리

### 2차 todo list
- [x] 상태없는 클래스 object 클래스 변경
- [x] 테스트 클래스의 위치를 프로덕션과 일치시키기
- [x] InputValidator 테스트 추가
- [x] VO객체공부, 머니 객체를 VO로 변경해보기
- [x] LottoMakerImpl의 네이밍 고민해보기
- [x] 중첩 List를 객체로 한번 래핑
- [x] boughtLottos 불변리스트로
- [x] LottoPrizeInfo의 테스트 추가
- [x] LottoResult의 default count를 0으로 설정
- [x] LottoResult의 prize 카운트를 내부에서 제어하기
- [x] LottoResult의 돈 증가를 하나의 기능으로 제공하기
- [x] 통합도메인테스트 외에 각 클래스기능별 테스트도 고려해보기

### 3차 todo list
- [x] 린트 확인
- [x] 로또번호들도 VO객체로?
- [x] UserMoney inline class 고려
- [x] 테스트 이름 수정