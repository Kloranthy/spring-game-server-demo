package io.github.kloranthy.counter;

import java.util.HashMap;

/**
 */
public class CounterService {
  private HashMap<String, Counter> countersById;

  public CounterService() {
    countersById = new HashMap<String, Counter>();
  }

  public void createCounter() {}
  public void getCounter() {}
}
