package com.yedam.chapter11;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		// HashMap -> Key , Value 데이터를 저장
		HashMap<Key, String> hashmap = new HashMap<>();

		// 열쇠는 new Key(1) 받을 데이터는 홍길동 put으로 보관
		// new Key(1) -> 1
		hashmap.put(new Key(1), "홍길동");

//		Key k1 = new Key(1);
//		Key k2 = new Key(1); 대충 이런의미

		// get으로 꺼내옴 키는 new Key(1)
		// new Key(1) -> 2
		String value = hashmap.get(new Key(1));
		System.out.println(value);

		// 이대로 해보면 null임 왜냐?? 위와 아래 new Key(1)가 다르기 떄문임

		Key key = new Key(1);
		System.out.println(key.toString());

	}
}
