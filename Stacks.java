package com.java.day14.stque;

public class Stacks<E> {

  LinkedLists<E> linkedL = new LinkedLists<>();

  public void push(E data) {
    linkedL.addLast(data);
  }

  public void display() {
    linkedL.displayFromEnd();
  }
}