package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        movieReview movieReview1 = new movieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";

        movieReview movieReview2 = new movieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";

        movieReview[] movieReviews = {movieReview1, movieReview2};
        for (movieReview movieReview : movieReviews) {
            System.out.println("영화 제목: " + movieReview.title + ", 리뷰: "+movieReview.review);
        }
    }
}
