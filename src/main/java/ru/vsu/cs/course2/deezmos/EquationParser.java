package ru.vsu.cs.course2.deezmos;

import java.io.IOException;

import ru.vsu.cs.course2.deezmos.EquationTokenizer.Token;

/** EquationParser. */
public class EquationParser {
  private EquationTokenizer tokenizer;
  private Token currentToken;

  public EquationParser(EquationTokenizer tokenizer) {
    this.tokenizer = tokenizer;
  }

  public void setData(String string) throws IOException {
    this.tokenizer.setData(string);
    this.currentToken = this.tokenizer.next();
    //return this.expression();
  }
}
