package com.yedam.exam;

import java.util.Scanner;

public class ExeStore {

	Scanner sc = new Scanner(System.in); // sc가 뭔지? 뜻은?
	boolean run = true;
	Goods[] gdsAry = null;

	int menuNo;
	int mostExpencive = 0;
	int allPrice = 0;

	public ExeStore() {
		while (run) {// 초기메뉴 무한루프로 돌리기

			showMenu(); // 역할이?
			System.out.println("select Menu : ");
			menuNo = Integer.parseInt(sc.nextLine());// 입력문자 숫자로변경

			switch (menuNo) {
			case 1:
				setSize();
				break;
			case 2:
				goodsAdd();
				break;
			case 3:
				allGdsInfo();
				break;
			case 4:
				analysis();
				break;
			case 5:
				PrintAnalysis();
				break;
			case 6:
				run = false;
				break;
			default:
				System.out.println("입력값을 확인해주세요");

			}

		}

	}

	public void showMenu() { // 퍼블릭 이유 : 이 파일에 접근할 수 있어야하니까, 보이드는 ON,OFF에 리턴값 없어도되니까
		System.out.println("==============================================================================");
		System.out.println("| 1. 상품등록갯수설정 | 2. 상품정보입력 | 3. 모든상품조회 | 4. 상품분석 | 5. 분석조회 | 6. 종료 |");
		System.out.println("==============================================================================");
	}

	public void setSize() {
		System.out.println("등록하고자 하는 물품의 개수 > ");
		int count = Integer.parseInt(sc.nextLine());
		gdsAry = new Goods[count];// new쓴 이유가 어레이 새로운거로 담기위해인지? 카운트는 왜쓰는건지?
	}

	public void goodsAdd() {
		for (int i = 0; i < gdsAry.length; i++) {
			Goods goods = new Goods();
			System.out.println("상품 이름 > ");
			String pName = sc.nextLine();// sc.넥스트라인이 뭔지? p네임은 어디쓰이는지?
			goods.setpName(pName);// 스텝네임??

			System.out.println("상품 수량 > ");
			int stocks = Integer.parseInt(sc.nextLine());
			goods.setStocks(stocks);
			System.out.println("상품 가격 > ");

			int price = Integer.parseInt(sc.nextLine());
			goods.setPrice(price);
			System.out.println((i + 1) + "/" + gdsAry.length + "번째 상품 정보 입력 완료-");
			System.out.println();
			gdsAry[i] = goods; // 설명이 필요할듯함 [사과],[배],[바나나] 이거 맞는지?
		}
	}

	public void allGdsInfo() {
		for (int i = 0; i < gdsAry.length; i++) {
			gdsAry[i].getInfo();// 이거로서 어떻게 보여지는건지??
			System.out.println("\t---\t---\t---\t---");
		}
	}

	public void analysis() {
		for (int i = 0; i < gdsAry.length; i++) {
			if (mostExpencive < gdsAry[i].getPrice()) {
				mostExpencive = gdsAry[i].getPrice();
			}
		}

		for (int i = 0; i < gdsAry.length; i++) {
			if (mostExpencive == gdsAry[i].getPrice()) {// getPrice어디서계속 나오는건지 확인해보기
				continue;
			} else {
				allPrice += (gdsAry[i].getPrice() * gdsAry[i].getStocks());// 곱셈식 왜있는건지??
			}
		}
		System.out.println("가장 비싼 상품을 찾았고, 이 상품을 제외한 상품들의 총 가격이 계산되었습니다.");
	}

	public void PrintAnalysis() {
		for (int i = 0; i < gdsAry.length; i++) {
			if (mostExpencive == gdsAry[i].getPrice()) {
				System.out.println(gdsAry[i].getpName() + "이(가) 가장 비쌉니다.");
			}
		}
		System.out.println("가장 비싼 상품을 제외한 상품들의 총 가격 : " + allPrice);
	}


}
