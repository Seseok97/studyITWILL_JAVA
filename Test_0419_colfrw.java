package collection_framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test_0419_colfrw {

	public static void main(String[] args) {
		/*
		 * Set계열 객체를 활용, 로또번호 생성기를 작성 (정렬은 선택사항!)
		 * 1. 이번주 로또 1등 당첨 번호를 Set객체 thisWeekLotto에 저장!
		 * 	> ex) "이번주 1등 당첨번호 : 1 2 3 4 11 22 " 출력
		 * 
		 * 2. Set타입 객체 myLotto 생성
		 * 3. 1~45사이의 중복되지않는 난수(로또번호) 6개를 Set 객체에 저장
		 * 	> ex) "나의 로또 번호: 10 21 35 45 1 2" 출력
		 * 
		 * 4. myLotto에 저장된 번호와 1등 당첨번호를 비교하여, 일치하는 번호 개수와 등수를 출력하라.
		 * 	> ex) 번호 3개 일치 시 "일치하는 번호 개수: 3개, (4등)" 
		 * 
		 */
		
		// 3. 난수발생 > Math.random() || Random() 클래스 활용
		//			   > 반복문을 통하여 Set 객체에 난수 저장.
		//				>> for문				  > 조건: 6번 반복해서 난수를 Set 객체에 저장.
		//										  > 주의사항! Set은 중복을 허용하지 않기 때문에, 중복이 발생하면 반복횟수만 증가하고 난수가 저장되지 않을 수 있다 !!
		//										  >           중복이 발생하면 제어변수를 -1 해야한다! > 조건문: contains() metnod || add() method
		//				>> while문 > 이쪽이 쉽다! > 조건: 로또번호 6개가 Set 객체에 저장되지 않으면 계속 반복.
		
		Random r = new Random();
		
		Set<Integer> thisWeekLotto = new TreeSet<Integer>(Arrays.asList(1,2,3,4,5,6)); // Arrays.asList() 로 입력가능!
//		thisWeekLotto.add(1);
//		thisWeekLotto.add(2);
//		thisWeekLotto.add(3);
//		thisWeekLotto.add(4);
//		thisWeekLotto.add(5);
//		thisWeekLotto.add(6);
		System.out.println("이번주 로또 1등 번호: "+thisWeekLotto);
		
		
		Set<Integer> myLotto = new HashSet<Integer>();
		
		// while
		while(myLotto.size() < 6) {
			myLotto.add(r.nextInt(45)+1);
		}
		System.out.println("while: "+myLotto);
		myLotto.clear();
		
		// for
		for(int i=0;i<6;i++) {
			int num = r.nextInt(45)+1;
			if(!(myLotto.contains(num))) { // myLotto에 num이 없을때
				myLotto.add(num);
			}else { // myLotto에 num이 있을때
				i -= 1;
			}// i-e end
			
			// 이거도 가능하다
//			if(!myLotto.add(num)) { // myLotto에 num을 추가하는 동작이 실패했을때!!!
//				i--;				// add는 중복이면 false를 반환하니까 가능한 동작!!
//			}
		}// for end
		
		// 이거도 가능하다
//		for(;true;) {
//			myLotto.add(r.nextInt(45)+1);
//			if(myLotto.size() == 6) break;
//		} // for end
		
		System.out.println("나의 로또번호(for): "+myLotto);
		
//		  4. myLotto에 저장된 번호와 1등 당첨번호를 비교하여, 일치하는 번호 개수와 등수를 출력하라.
//		  	> ex) 번호 3개 일치 시 "일치하는 번호 개수: 3개, (4등)" 
		
		int count = 0;
		// 향상된 for문 사용
		for(int number:myLotto) {
			if(thisWeekLotto.contains(number)) {
				count += 1;
			}// if end
		}// for end
		
		// toArray + for문 사용
		Object[] weekArr = thisWeekLotto.toArray();
		Object[] myLottoArr = myLotto.toArray();
		
		for(int i=0;i<myLottoArr.length;i++) {
			for(int j=0;j<weekArr.length;j++) {			
				if(weekArr[j].equals(myLottoArr[i])) {
//					count += 1;
				} // count if end
			} // weekArr for end
		}// myLottoArr for end
		
		System.out.print("일치하는 번호 개수: "+count+"개, ");
		
		switch (count) {
			case 0: 
			case 1: 
			case 2: System.out.println("꽝!");  break;
			case 3: System.out.println("4등!"); break;
			case 4: System.out.println("3등!"); break;
			case 5: System.out.println("2등!"); break;
			case 6: System.out.println("1등!"); break;
		} // s-c end
		
		
		// Iterator 사용!
		Iterator<Integer> ite = myLotto.iterator();
		// Set객체의 iterator() 메서드를 호출하여, Iterator(반복자) 인터페이스를 구현한 객체를 얻는다.
		while(ite.hasNext()) { // 꺼내올 데이터가 있으면 true, 없으면  false
			int num = ite.next(); // next() 메서드를 호출하여, 요소를 리턴
			// 꺼낸 번호와 당첨번호를 비교
			if(thisWeekLotto.contains(num)) {
				count++;
			}
		}// while end

		
	} // main() method end

}// public class end
