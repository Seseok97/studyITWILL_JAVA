package for_;

public class Ex3_0209 {
	public static void main(String[] args) {
		//강사님께서 설명끊길수도있다고 하셔서 14일자 패키지에 미리 만들어둠 !! 0209
		
		//중첩 for문
		// > for문 내부에 또 다른 for 문을 기술하는 것.
		// > 바깥 for문과 안 for문으로 구분
		// >> 바깥 for문이 한바퀴 돌 때, 안 for문은 여러 바퀴 돌리는것이 가능 !
		// >>> 안 for문 반복 횟수 = 안 for문 횟수 * 밖 for문 횟수
		// ex) 시계 분침 > 60번 돌때 ... 시침 > 1번 >> 분침: 안for / 시침: 밖for
		//		초침 > 60 / 분침 > 1 >>> 시침 1 > 분침 60 > 초침 3600(분침60*초침60)
		
		//형태
//		for() { // 밖for
//			문장1
//			for() { // 안for
//				문장2
//				// 반복횟수 = 안for 반복횟수 * 밖for 반복횟수
//			}
//		}
		
		//밖for: i값이 1~3까지 1씩 증가하며 반복
		int i;
		int j; // 보통 i다음 제어변수 j씀(알파벳순)
		
		for(i=1;i<=3;i++) {
			System.out.println("i = "+i);
			for(j=1;j<=2;j++) {
				System.out.println(">> j = "+j);
				//반복횟수 = j(2회) * i(3회) = 6회
			}
			System.out.println("=> 안for 반복종료");
		}
		System.out.println("밖for 반복종료");
		
		System.out.println("===========================================");
		//0214
		//타이머(xx분xx초)
		// > 시hour: 0~23시
		// > 분min: 0~59분
		// > 초sec: 0~59초
		// <예시> 
		// 0분 0초
		// 0분 1초
		//   ...
		// 59분 59초
		
		int min ;
		int sec ;
		
		for(min=0;min<60;min++) {
			for(sec=0;sec<60;sec++) {
				System.out.println(min+"분 "+sec+"초");
			}
		} // 시간까지 넣으면 너무 많아져서 안함니다. syso문 안에 시간 넣고 for문 젤 밖에 하나 만들면 됨.
		// 출력문이 너무 길어 주석처리
		
		//구구단 2~9단 출력
		int dan;
		int su;
		
		for(dan=2;dan<=9;dan++) {
			System.out.println("< "+ dan +"  단 >");
			for(su=1;su<=9;su++) {
				System.out.println(dan+" * "+su+" = "+(dan*su));
				//System.out.printf("%d * %d = %d",dan,su,dan*su);
			}
			System.out.println();
			
		}
		
		System.out.println("===============================");
		
		//주사위 2개를 굴려, 주사위 눈의 합이 6일때 두 주사위의 값을 출력하자.
		//ex ) 주사위 1      주사위 2      합계
		//         1             5           6
		// 뭐 이런식 ..
		
		int d1;
		int d2;
		
		for(d1=1;d1<=6;d1++) {
			for(d2=1;d2<=6;d2++) {
				if(d1+d2==6) {
					System.out.printf(">>d1=%d, d2=%d, d1+d2=%d \n",d1,d2,d1+d2);
				}else {
					System.out.printf("d1=%d, d2=%d\n",d1,d2);
				}
			}
		}
		System.out.println("===============================");
		//방정식 4x+5y = 60의 해를 구하여 출력하라.
		// 단, x와 y는 0이상 10 이하이다.
		
		int x;
		int y;
		
		for(x=0;x<=10;x++) {
			for(y=0;y<=10;y++) {
				if((4*x)+(5*y)==60) {
					System.out.printf("x=%d,y=%d일때 4x+5y=60이다.\n",x,y);
				}
			}
		}
		System.out.println("===============================");
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
