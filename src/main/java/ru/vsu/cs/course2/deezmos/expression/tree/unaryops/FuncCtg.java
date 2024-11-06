package ru.vsu.cs.course2.deezmos.expression.tree.unaryops;

import ru.vsu.cs.course2.deezmos.expression.tree.ETNode;
import ru.vsu.cs.course2.deezmos.expression.tree.Evaluator;

/**
 * NodeCtg
 */
public class FuncCtg implements Evaluator {

  @Override
  public double evaluate(ETNode left, ETNode right) {
    return 1 / Math.tan(left.evaluate());
  }
}