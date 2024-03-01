package com.reactiveprogramming.reactive_programming;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;
import java.util.Locale;

public class ReactiveTutorial {

    private Mono<String> testMono(){
        return Mono.justOrEmpty("Java Reactive Programming");
    }
    private Flux<String> testFlux(){
       List<String> programmingLanguages = List.of("Java", "C#","Go");
        return Flux.fromIterable(programmingLanguages);
    }

    private Flux<String> testMap(){
        List<String> programmingLanguages = List.of("java", "C#","go");
       Flux<String> flux = Flux.fromIterable(programmingLanguages);
       return flux.map(String::toUpperCase);
    }


    private Flux<String> testFlatMap(){
        List<String> programmingLanguages = List.of("java", "C#","go");
        Flux<String> flux = Flux.fromIterable(programmingLanguages);
        return flux.flatMap(s -> Mono.justOrEmpty(s.toLowerCase(Locale.ROOT)));
    }


    private Flux<String> testDelay(){
        List<String> programmingLanguages = List.of("java", "C#","go");
        Flux<String> flux = Flux.fromIterable(programmingLanguages)
                .delayElements(Duration.ofSeconds(1)).log();
        return flux.skip(Duration.ofSeconds(2));
    }
    private Flux<Integer> testConcat(){
        Flux<Integer> flux = Flux.range(1,20);
        Flux<Integer> flux2 = Flux.range(10,40);
        return Flux.concat(flux, flux2);
    }

    private Flux<Integer> testMerge(){
        Flux<Integer> flux = Flux.range(50,90)
                .delayElements(Duration.ofMillis(100));
        Flux<Integer> flux2 = Flux.range(10,30)
                .delayElements(Duration.ofMillis(100));
        return Flux.merge(flux, flux2);
    }
    public static void main(String[] args) throws InterruptedException {
        ReactiveTutorial reactiveTutorial = new ReactiveTutorial();
        /*
        reactiveTutorial.testMono().subscribe(System.out::println);
        reactiveTutorial.testFlux().subscribe(System.out::println);
        reactiveTutorial.testMap().subscribe(System.out::println);
        reactiveTutorial.testFlatMap().subscribe(System.out::println);
        reactiveTutorial.testDelay().subscribe(System.out::println);
         */
       // reactiveTutorial.testConcat().subscribe(System.out::println);

        reactiveTutorial.testMerge().subscribe(System.out::println);


        Thread.sleep(10_000);

    }
}
