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
- [ ] 테스트 클래스 위치를 실제 클래스와 맞추기
- [ ] 커스텀 구분자의 sum test
- [ ] 오타수정
- [x] InputParser object클래스
- [x] domain 에서 view 패키지 참조 수정