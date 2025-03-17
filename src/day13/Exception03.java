package day13;

public class Exception03 {

	public static void main(String[] args) { // 메인에서도 throws 할 수 있다.
		// 0으로 나누었을때 발생하는 예외 처리.
		// ex) num1 = 1, num2 = 3, op = '+' => 4
		// num1 = 3, num2 = 0, op '/' => 오류 메세지 출력
		// num1 = 3, num2 = 0, op '%' => 오류 메세지 출력
		
		
		Exception03 ex = new Exception03();
		// if 문으로 다른 char 값을 넣었을 때 나오는건 일단 패스
		int num1 = 3, num2 = 0;
		char op = '/';
		try { // try 구문에서 예외가 발생할 경우 그 이후는 실행하지 않는다. 
			// 실행해야 할 것이 있다면 예외가 발생할거같은 구문 이후에 두지말고 catch 에 넣어서 실행한다.
			double result = ex.op(num1, num2, op);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("연산식이 /,% 일때, num 에 0 넣음");
		}
		
	}
	/* 메서드에서 예외 발생시키기 : throw new 발생 시킬 수 있음.
	 * throws : 예외 떠넘기기 (예외를 나를 호출하는 다른 메서드로 넘김.)
	 * 예외를 발생시키게 되면 메서드 선언부 끝에 throws 를 적고, 발생할 수 있는
	 * 예외를 반드시 적어줘야 함.
	 * throws 는 예외적으로 RunTimeException 만 생략가능.
	 * 
	 * */
	
	/* 메서드 : 두 수를 입력받고, 연산자를 입력받아 4칙연산의 결과를 리턴하는 메서드
	 * 매개변수 : 두 정수, 연산자 => int num1 , int num2 , char op)
	 * 리턴타입 : double
	 * */
	
	public double op(int num1, int num2, char op) throws RuntimeException/*생략가능*/ {
		if((op == '/' || op == '%') && num2 == 0 ) {
			throw new RuntimeException("num2 는 0이 될수 없습니다."); // 예외 미리 발생시키기
		}
		switch(op) {
		case '+':
		return num1 + num2;
		case '-':
		return num1 - num2;
		case '*':
		return num1 * num2;
		// 여기서도 예외처리 가능~
		case '/':
		return num1 / num2;
		case '%':
		return num1 % num2;
		default :
			// 예외 미리 발생시키기
			throw new RuntimeException(op + "는 산술연산자가 아닙니다.");
		}
	}
	

}
