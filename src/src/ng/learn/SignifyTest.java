package ng.learn;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SignifyTest {
    public static void main(String[] args) {

        List<Review> reviewsList = new ArrayList<>();
        reviewsList.add(new Review("review test1", "NG1", "itunes", 4, "Need to be able to delete devices", "Amazon Alexa"));
        reviewsList.add(new Review("review test2", "NG2", "itunes", 5, "Need to be able to delete devices", "Amazon Alexa"));
        reviewsList.add(new Review("review test3", "NG1", "google", 3, "Need to be able to delete devices", "Amazon Alexa"));
        reviewsList.add(new Review("review test4", "NG2", "google", 4, "Need to be able to delete devices", "Amazon Alexa"));

        Map<Integer, Long> reviews = reviewsList.stream()
                .collect(Collectors.groupingBy(Review::getRating, Collectors.counting()));
        System.out.println(reviews);

        Map<String, List<Review>> result = reviewsList.stream()
                        .collect(Collectors.groupingBy(Review::getAuthor, Collectors.toList()));
        System.out.println(result);

        Map<String, List<String>> groupByAuthorWithReviewSourceList = reviewsList.stream()
                                                                            .collect(Collectors.groupingBy(
                                                                                    Review::getAuthor,
                                                                                    Collectors.mapping(Review::getReviewSource, Collectors.toList())));
        System.out.println(groupByAuthorWithReviewSourceList);

        List<Predicate> predicates = new ArrayList<>();
        if(!predicates.isEmpty()){
            System.out.println("predicates = " + predicates);
        } else{
            System.out.println("no predicates");
        }
        
    }
}
