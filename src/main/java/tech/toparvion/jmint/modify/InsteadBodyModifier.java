package tech.toparvion.jmint.modify;

import javassist.CannotCompileException;
import javassist.CtBehavior;

/**
 * Created by Toparvion on 29.04.2016 14:45
 */
public class InsteadBodyModifier implements MethodModifier {

  @Override
  public void apply(String injection, CtBehavior method, String... auxParams) throws CannotCompileException {
    method.setBody(injection);
  }
}
