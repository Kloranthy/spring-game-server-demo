package io.github.kloranthy.counter;

/**
 */
public class Counter {
  private String counterId;
  private String name;
  private int value;

  public Counter() {
    this.value = 0;
  }

  public String getCounterId() {
    return this.counterId;
  }

  public Counter setCounterId( String counterId ) {
    this.counterId = counterId;
    return this;
  }

  public String getName() {
    return this.name;
  }

  public Counter setName( String name ) {
    this.name = name;
    return this;
  }

  public int getValue() {
    return this.value;
  }

  public Counter setValue( int value ) {
    this.value = value;
    return this;
  }

  public Counter increment() {
    this.value++;
    return this;
  }
  public Counter decrement() {
    this.value--;
    return this;
  }
}
