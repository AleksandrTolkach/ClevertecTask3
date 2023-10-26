package by.clevertec.collector;

import by.clevertec.model.Car;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CarsCollector implements Collector<Car, Map<String, Integer>, Map<String, Double>> {

      private static final String COUNTRY_1 = "Туркменистан";
      private static final String COUNTRY_2 = "Узбекистан";
      private static final String COUNTRY_3 = "Казахстан";
      private static final String COUNTRY_4 = "Кыргызстан";
      private static final String COUNTRY_5 = "Россия";
      private static final String COUNTRY_6 = "Монголия";

  public static CarsCollector toPriceMap() {
    return new CarsCollector();
  }

  @Override
  public Supplier<Map<String, Integer>> supplier() {
    return () -> {
      Map<String, Integer> countryMap = new HashMap<>();
      countryMap.put(COUNTRY_1, 0);
      countryMap.put(COUNTRY_2, 0);
      countryMap.put(COUNTRY_3, 0);
      countryMap.put(COUNTRY_4, 0);
      countryMap.put(COUNTRY_5, 0);
      countryMap.put(COUNTRY_6, 0);
      return countryMap;
    };
  }

  @Override
  public BiConsumer<Map<String, Integer>, Car> accumulator() {
    return (countryMassAvMap, car) -> {
      if (car.getCarMake().equals("Jaguar") || car.getColor().equals("White")) {
        countryMassAvMap.put(COUNTRY_1, countryMassAvMap.get(COUNTRY_1) + car.getMass());
      } else if (car.getMass() < 1500
          && car.getCarMake().matches("BMW|Lexus|Chrysler|Toyota")) {
        countryMassAvMap.put(COUNTRY_2, countryMassAvMap.get(COUNTRY_2) + car.getMass());
      } else if (car.getColor().equals("Black") && car.getMass() > 4000
          || car.getCarMake().matches("GMC|Dodge")) {
        countryMassAvMap.put(COUNTRY_3, countryMassAvMap.get(COUNTRY_3) + car.getMass());
      } else if (car.getReleaseYear() < 1982 || car.getCarMake().matches("Civic|Cherokee")) {
        countryMassAvMap.put(COUNTRY_4, countryMassAvMap.get(COUNTRY_4) + car.getMass());
      } else if (!car.getColor().matches("Yellow|Red|Green|Blue") || car.getPrice() > 40000) {
        countryMassAvMap.put(COUNTRY_5, countryMassAvMap.get(COUNTRY_5) + car.getMass());
      } else if (car.getVin().endsWith("59")) {
        countryMassAvMap.put(COUNTRY_6, countryMassAvMap.get(COUNTRY_6) + car.getMass());
      }
    };
  }

  @Override
  public BinaryOperator<Map<String, Integer>> combiner() {
    return null;
  }

  @Override
  public Function<Map<String, Integer>, Map<String, Double>> finisher() {
    return map -> {
      Map<String, Double> priceMap = new HashMap<>();
      map.forEach((key, value) -> priceMap.put(key, value / 1000D * 7.14));
      return priceMap;
    };
  }

  @Override
  public Set<Characteristics> characteristics() {
    return Set.of(Characteristics.UNORDERED);
  }
}
