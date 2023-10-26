package by.clevertec;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.stream.Collectors;

public class BaseTest {

  protected static final String TASK_1_RESULT = "task1result.txt";
  protected static final String TASK_2_RESULT = "task2result.txt";
  protected static final String TASK_3_RESULT = "task3result.txt";
  protected static final String TASK_4_RESULT = "task4result.txt";
  protected static final String TASK_5_RESULT = "task5result.txt";
  protected static final String TASK_6_RESULT = "task6result.txt";
  protected static final String TASK_7_RESULT = "task7result.txt";
  protected static final String TASK_8_RESULT = "task8result.txt";
  protected static final String TASK_9_RESULT = "task9result.txt";
  protected static final String TASK_10_RESULT = "task10result.txt";
  protected static final String TASK_11_RESULT = "task11result.txt";
  protected static final String TASK_12_RESULT = "task12result.txt";
  protected static final String TASK_13_RESULT = "task13result.txt";
  protected static final String TASK_14_RESULT = "task14result.txt";
  protected static final String TASK_15_RESULT = "task15result.txt";
  protected static final String TASK_16_RESULT = "task16result.txt";
  protected static final String TASK_17_RESULT = "task17result.txt";
  protected static final String TASK_18_RESULT = "task18result.txt";
  protected static final String TASK_19_RESULT = "task19result.txt";
  protected static final String TASK_20_RESULT = "task20result.txt";
  protected static final String TASK_21_RESULT = "task21result.txt";
  protected static final String TASK_22_RESULT = "task22result.txt";

  protected String readResultFile(String filePath) throws Exception {
    filePath = BaseTest.class.getClassLoader().getResource(filePath).toURI().getPath();

    return new BufferedReader(new FileReader(filePath)).lines()
        .collect(Collectors
            .joining(System.lineSeparator()));
  }
}
