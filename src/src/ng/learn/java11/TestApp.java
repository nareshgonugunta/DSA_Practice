package ng.learn.java11;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestApp {

    public static void main(String[] args) throws IOException {
        /*
        1. Sting methods
            -> isBlank()
            -> repeat()
            -> lines()
            -> stripLeading()
            -> stripTrailing()
        2. Var in Lamda
            var is not a keyword, it is introduced in java10. can bes used in loops, but we can not assign null value
        */
        // 3- Collections to Array
        List<String> namesList = Arrays.asList("Naresh", "Naidu");
        String[] namesArray = namesList.toArray(new String[namesList.size()]);
        // OR
        namesArray = namesList.toArray(new String[0]);
        for (String name : namesArray){
            System.out.println("Name : "+name);
        }
        namesArray = namesList.toArray(String[]::new);
        for (String name : namesArray){
            System.out.println("Name : "+name);
        }

        //4. File-API
        Path filePath = Paths.get("C:\\Users\\91863\\Naresh\\Intellij_DEV\\DSA_Practice\\src\\TEST1.txt");
        String fileContent = Files.readString(filePath, StandardCharsets.UTF_8);
        System.out.println(fileContent);

        // 5. Write into text file
        String fileContectOne = "New Content";
        Files.writeString(filePath, fileContectOne, StandardCharsets.UTF_8);
        System.out.println("success");

        fileContent = Files.readString(filePath, StandardCharsets.UTF_8);
        System.out.println(fileContent);

        //6. Not into Predicate
        System.out.println("===========Not into Predicate============");
        List<String> tutorialList = Arrays.asList("java", " ", "HTML", "\n");
        List<String> tutorials = tutorialList.stream()
                .filter(Predicate.not(String::isBlank))
                .toList();
        tutorials.forEach(System.out::println);

        //7. Optional isEmpty
        System.out.println("=============Optional isEmpty=======================");
        String name = null;
        System.out.println(!Optional.ofNullable(name).isPresent());
        System.out.println(Optional.ofNullable(name).isEmpty());

        name = "Naresh";
        System.out.println(!Optional.ofNullable(name).isPresent());
        System.out.println(Optional.ofNullable(name).isEmpty());

        //8. Standard HttpClient
        System.out.println("============Standard HttpClient==============");
        HttpClient httpClient =  HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        try{
            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create("https://www.google.com"))
                    .build();

            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status Code: "+response.statusCode());
            System.out.println("Headers: "+response.headers().allValues("content-type"));
            System.out.println("Body: "+response.body());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //9. Nest-Based access control
        System.out.println("==============Nest-Based access control==============");


    }
}
