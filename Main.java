package com.java.day14.stque;

public class Main {

  public static void main(String[] args) {
    Stacks<Integer> st = new Stacks<>();
    st.push(70);
    st.push(30);
    st.push(56);

    st.peek();

    st.display();
    st.pop();
    st.peek();

    st.display();
    st.pop();

    st.display();
    st.pop();

    st.display();
    st.pop();

  }
}
