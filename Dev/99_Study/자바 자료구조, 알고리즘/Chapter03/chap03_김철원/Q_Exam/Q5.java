package com.example.jpaexam.controller.exam06;

import java.util.Scanner;

// TODO: 정렬해주는 부분이 들어가야함.

/**
 * packageName : com.example.jpaexam.controller.exam06
 * fileName : q5
 * author : 김철원
 * date : 2022-10-20
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * —————————————————————————————
 * 2022-10-20 김철원 최초 생성
 */
public class Q5 {
    static int binSearchX(int[] a, int n, int key) {
        int pl = 0; // 검색 범위 첫 인덱스
        int pr = n - 1; // 검색 범위 끝 인덱스

        do {
            int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
            if (a[pc] == key) { // 검색한 값이 배열안에 있으면 실행이 됩니더.
                while (a[pc - 1] == key) { // 앞번호의 인덱스랑 key값이랑 맞는지 확인
                    pc--; // 맞은면 인덱스 값이 1씩 작아짐
                }
                return pc; // 위의 while 반복문이 종료 되면 pc에 값이 리턴 됨
            } else if (a[pc] < key)
                pl = pc + 1; // 검색 범위를 뒤쪽 절반으로 좁힘
            else
                pr = pc - 1; // 검색 범위를 앞쪽 절반으로 좁힘
        } while (pl <= pr);

        return -1; // 배열안에 찾는 값이 없으면 -1을 리턴함
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("요솟수 값 입력: ");
        int n = scanner.nextInt();

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

        int b = binSearchX(a, n, key);

        if (b == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + b + "]에 있습니다.");
        }
    }
}
