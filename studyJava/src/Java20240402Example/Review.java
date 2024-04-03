package Java20240402Example;

public class Review {
//    1) public class Review {  // 클래스 만들기
//        reviewId rating  // 1~10점
//        text  // 리뷰텍스트
//        loginId  // 유저의 아이디
//        lectureId  // 강의 아이디
//    }
//    2) public boolean createReview(유저아이디, 강의아이디, 점수, 리뷰평)
//        단, 내부 기능이 필요 ** 아래의 에러 경우에는 메서드가 False를 리턴
//        Review 객체가 정상적으로 생성되는 경우에만 True 리턴함!!! => 생성객체는 ArrayList로 관리
//        2-1) 점수는 1~10점 사이. 점수는 필수
//        2-2) 한명의 유저가 하나의 강의에 한번 리뷰를 남길 수 있음
//        2-3) 수강하지 않은 과목에는 리뷰를 남길 수 없음
//
//    예) createReview("hero11", 1, 10, "좋은 강의였어요"); // 객체생성하고 True 리턴
//    createReview("hero11", 1, 100, "좋은 강의였어요"); // 점수에러이므로 False 리턴
//    createReview("tommy", 3, 5, "그저그럼");  // tommy는 3번 강의를 수강안하므로 False 리턴
}
