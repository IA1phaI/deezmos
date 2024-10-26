package ru.vsu.cs.course2.deezmos.expressiontree.unaryops;

import ru.vsu.cs.course2.deezmos.expressiontree.ETNode;
import ru.vsu.cs.course2.deezmos.expressiontree.Evaluator;

/**
 * FuncAtg
 */
public class FuncAtg implements Evaluator {

  @Override
  public double evaluate(ETNode left, ETNode right) {
    return 1 / Math.atan(left.evaluate());
  }
}
