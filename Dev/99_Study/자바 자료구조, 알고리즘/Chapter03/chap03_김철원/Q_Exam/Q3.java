package com.example.jpaexam.controller.exam06;

import java.util.Scanner;

/**
 * packageName : com.example.jpaexam.controller.exam06
 * fileName : Q3
 * author : 김철원
 * date : 2022-10-20
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * —————————————————————————————
 * 2022-10-20 김철원 최초 생성
 */
public class Q3 {
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int num = 0; // idx배열에 쓰일 인덱스 번호 선언

        for (int i = 0; i < n; i++) {
            if (a[i] == key) { // 찾는 값이 배열안에 있으면 실행됨
                idx[num] = i; // 인덱스 번호를 idx배열에 순서대로 입력
                num++; // 인덱스 번호 증가
            }
        }

        return num; // num 값이 0 이면 찾는 값과 일치하는게 없다는 뜻임
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("요솟수 값 입력: ");
        int n = scanner.nextInt(); // 요솟수 입력 받기

        int[] a = new int[n]; // 입력받은 요솟수 크기만큼의 배열 만들기
        int count = 0; // 배열 인덱스에 쓰일 번호 만들기
        while (count < n) { // 조건 : 요솟수 길이보다 count의 값이 작을때
            System.out.print("a[" + count + "]" + "배열의 요소를 입력하세요: ");
            int t = scanner.nextInt(); // 배열안에 들어갈 숫자 입력을 반복문으로 받기
            a[count] = t;
            count++;
        }

        System.out.print("검색할 값: ");
        int key = scanner.nextInt();
        int[] idx = new int[99]; // 배열의 크기는 고정이 되어 있어서 미리 크게 잡아둠

        int resulte = searchIdx(a, n, key, idx);

        if (resulte == 0) { // 검색 성공여부를 확인하는 if문
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(resulte); // 반환값 출력

            // for (int i =0; i<resulte;i++) {
            // System.out.print(idx[i]); // idx 안에 있는 값 출력 하는 로직
            // }
        }
    }
}
