package by.clevertec;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MainTest extends BaseTest {

  private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
  private final PrintStream originalOutput = System.out;

  @BeforeEach
  public void setUp() throws Exception {
    System.setOut(new PrintStream(outputStream));
  }

  @AfterEach
  public void cleanUp() {
    System.setOut(originalOutput);
  }

  @Test
  public void task1Test_should_PrintResult() throws Exception {
    Main.task1();
    String expectedResult = readResultFile(TASK_1_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task2Test_should_PrintResult() throws Exception {
    Main.task2();
    String expectedResult = readResultFile(TASK_2_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task3Test_should_PrintResult() throws Exception {
    Main.task3();
    String expectedResult = readResultFile(TASK_3_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task4Test_should_PrintResult() throws Exception {
    Main.task4();
    String expectedResult = readResultFile(TASK_4_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task5Test_should_PrintResult() throws Exception {
    Main.task5();
    String expectedResult = readResultFile(TASK_5_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task6Test_should_PrintResult() throws Exception {
    Main.task6();
    String expectedResult = readResultFile(TASK_6_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task7Test_should_PrintResult() throws Exception {
    Main.task7();
    String expectedResult = readResultFile(TASK_7_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task8Test_should_PrintResult() throws Exception {
    Main.task8();
    String expectedResult = readResultFile(TASK_8_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task9Test_should_PrintResult() throws Exception {
    Main.task9();
    String expectedResult = readResultFile(TASK_9_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task10Test_should_PrintResult() throws Exception {
    Main.task10();
    String expectedResult = readResultFile(TASK_10_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task11Test_should_PrintResult() throws Exception {
    Main.task11();
    String expectedResult = readResultFile(TASK_11_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task12Test_should_PrintResult() throws Exception {
    Main.task12();
    String expectedResult = readResultFile(TASK_12_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task13Test_should_PrintResult() throws Exception {
    Main.task13();
    String expectedResult = readResultFile(TASK_13_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task14Test_should_PrintResult() throws Exception {
    Main.task14();
    String expectedResult = readResultFile(TASK_14_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task15Test_should_PrintResult() throws Exception {
    Main.task15();
    String expectedResult = readResultFile(TASK_15_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task16Test_should_PrintResult() throws Exception {
    Main.task16();
    String expectedResult = readResultFile(TASK_16_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task17Test_should_PrintResult() throws Exception {
    Main.task17();
    String expectedResult = readResultFile(TASK_17_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task18Test_should_PrintResult() throws Exception {
    Main.task18();
    String expectedResult = readResultFile(TASK_18_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task19Test_should_PrintResult() throws Exception {
    Main.task19();
    String expectedResult = readResultFile(TASK_19_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task20Test_should_PrintResult() throws Exception {
    Main.task20();
    String expectedResult = readResultFile(TASK_20_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task21Test_should_PrintResult() throws Exception {
    Main.task21();
    String expectedResult = readResultFile(TASK_21_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test
  public void task22Test_should_PrintResult() throws Exception {
    Main.task22();
    String expectedResult = readResultFile(TASK_22_RESULT);
    String actualResult = outputStream.toString();

    assertThat(actualResult).isEqualTo(expectedResult);
  }
}
