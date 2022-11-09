package chap09.sec01.exam06;

/**
 * packageName : chap09.sec01.exam06
 * fileName : Button
 * author : ryujonghak
 * date : 2022/10/04
 * description : 중첩 인터페이스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class Button {
    OnClickListener onClickListener; // 일반 속성

//    Setter 함수
    void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

//    일반 함수
    void touch() {
        onClickListener.onClick();
    }

    //    공유 중첩 인터페이스
    static interface OnClickListener {
        void onClick();
    }
}
