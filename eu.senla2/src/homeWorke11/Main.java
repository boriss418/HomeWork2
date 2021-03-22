package homeWorke11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("CPU1", "CPU2", "CPU3", "CPU4", "CPU5", "CPU6", "CPU7", "CPU8", "CPU9", "CPU10");
        List<Integer> frequency = Arrays.asList(1000, 1250, 1500, 1750, 2000, 2250, 2500, 2750, 3000, 3300);

        List<Object> cpu = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            CPU cpu1 = new CPU(name.get(i), frequency.get(i));
            cpu.add(cpu1);
        }
        System.out.println(cpu);
        System.out.println(frequency.stream().count());
        System.out.println(name.stream().anyMatch("CPU3"::equals));
        System.out.println(name.stream().noneMatch("CPU6"::equals));
        System.out.println(name.stream().allMatch((s)-> s.contains("C")));
        System.out.println(frequency.stream().min(Integer::compareTo).get());
        System.out.println(name.stream().max(String::compareTo).get());
        System.out.println(frequency.stream().reduce((s1,s2)->s1+s2).orElse(0));

        System.out.println("filter: " + name.stream().filter("CPU2" ::equals).count());
        System.out.println("skip + peek + limit: ");
        cpu.stream().skip(2).peek((e) -> System.out.print(","+e)).limit(4).collect(Collectors.toList());

        Stream<Object> streamFromCollectionName = cpu.stream();
        System.out.println(streamFromCollectionName);

        Stream<Object> frequency1 = Stream.of(cpu.get(2), cpu.get(0), cpu.get(2), cpu.get(2), cpu.get(7), cpu.get(3), cpu.get(0));
        System.out.println("Stream.of + distinct()+ map + sorted(): " + frequency1.distinct().map((e)-> e +"map").sorted().collect(Collectors.toList()));

        String[] names = {"CPU1", "CPU2", "CPU3", "CPU4", "CPU5"};
        Stream<String> streamFromArays = Arrays.stream(names);
        System.out.println("Arrays: " + streamFromArays.findFirst());

        String path = "/Users/37529/IdeaProjects/untitled2/collectionCPU";

        try {
            Stream<String> collection = Files.lines(Paths.get(path));
            System.out.println("создание стрима из файла: " + collection.findFirst());
        } catch (IOException e) {
            e.printStackTrace();
        }

        IntStream streamFromString = "247".chars();
        System.out.println("стрим из строки:  " + streamFromString.findFirst());

        Stream<Object> cpu1 = Stream.builder().add(cpu.get(2)).add(cpu.get(3)).build();
        System.out.println("Stream.builder: " + cpu1.collect(Collectors.toList()));

        Stream<Object> stream = cpu.parallelStream();
        System.out.println("parallelStream: " + stream.collect(Collectors.toList()));

//        Stream<Integer> streamFromIterate = Stream.iterate(frequency.get(2), n -> n + 1);
//        streamFromIterate.forEach(System.out::println);

//        Stream<String> streamFromGenerate = Stream.generate(() -> name.get(1));
//        streamFromGenerate.forEach(System.out::println);

        System.out.println(frequency.stream().mapToInt((e)-> Integer.parseInt(String.valueOf(e))).toArray());


    }
}
