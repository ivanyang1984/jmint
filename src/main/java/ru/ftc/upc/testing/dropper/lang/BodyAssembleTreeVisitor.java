package ru.ftc.upc.testing.dropper.lang;

import org.antlr.v4.runtime.tree.TerminalNode;
import ru.ftc.upc.testing.dropper.lang.gen.DroppingJavaBaseVisitor;

/**
 * A parse tree visitor for assembling all the child terminal node's texts into single string separated with spaces.
 * @author Toparvion
 */
class BodyAssembleTreeVisitor extends DroppingJavaBaseVisitor<String> {

  @Override
  public String visitTerminal(TerminalNode node) {
    return node.getText();
  }

  @Override
  protected String aggregateResult(String aggregate, String nextResult) {
    return (aggregate == null)
            ? nextResult
            : String.format("%s %s", aggregate, nextResult);
  }
}
