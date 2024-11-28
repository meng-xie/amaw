package org.example.amaw.spark;

//import org.apache.spark.SparkConf;
//import org.apache.spark.api.java.JavaPairRDD;
//import org.apache.spark.api.java.JavaRDD;
//import org.apache.spark.api.java.JavaSparkContext;
//import scala.Tuple2;
import java.util.Arrays;

public class Myspark {

    public static void main(String[] args) {
//        SparkConf conf = new SparkConf().setAppName("DataReadExample").setMaster("local");
//        JavaSparkContext sc = new JavaSparkContext(conf);
//
//        JavaRDD<String> lines = sc.textFile("data.txt");
//
//       // lines.foreach(line -> System.out.println(line));
//
//        JavaRDD<String> words = lines.flatMap(line -> Arrays.asList(line.split(" ")).iterator());
//
//        JavaPairRDD<String, Integer> wordCounts = words.mapToPair(word -> new Tuple2<>(word, 1))
//                .reduceByKey((count1, count2) -> count1 + count2);
//
//        wordCounts.foreach(wordCount -> System.out.println(wordCount._1() + ": " + wordCount._2()));

    }

}
