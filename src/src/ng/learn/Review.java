package ng.learn;

//import javax.persistence.*;

import java.time.Instant;

public class Review {
    private String review;
    private String author;
    private String reviewSource;
    private int rating;
    private String title;
    private String productName;
    private Instant reviewedDate;

    public Review() {}

    public Review(String review, String author, String reviewSource, int rating, String title, String productName) {
        this.review = review;
        this.author = author;
        this.reviewSource = reviewSource;
        this.rating = rating;
        this.title = title;
        this.productName = productName;
    }

    public String getReview() { return review; }
    public void setReview(String review) { this.review = review; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public String getReviewSource() { return reviewSource; }
    public void setReviewSource(String reviewSource) { this.reviewSource = reviewSource; }
    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public Instant getReviewedDate() { return reviewedDate; }
    public void setReviewedDate(Instant reviewedDate) { this.reviewedDate = reviewedDate; }

    @Override
    public String toString() {
        return "Review{" +
                ", review='" + review + '\'' +
                ", author='" + author + '\'' +
                ", reviewSource='" + reviewSource + '\'' +
                ", rating=" + rating +
                ", title='" + title + '\'' +
                ", productName='" + productName + '\'' +
                ", reviewedDate=" + reviewedDate +
                '}';
    }
}
