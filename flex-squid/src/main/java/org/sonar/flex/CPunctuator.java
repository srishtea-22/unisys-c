/*
 * SonarQube Flex Plugin
 * Copyright (C) 2010-2025 SonarSource Sàrl
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the Sonar Source-Available License Version 1, as published by SonarSource SA.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the Sonar Source-Available License for more details.
 *
 * You should have received a copy of the Sonar Source-Available License
 * along with this program; if not, see https://sonarsource.com/license/ssal/
 */
package org.sonar.flex;

import org.sonar.sslr.grammar.GrammarRuleKey;

public enum CPunctuator implements GrammarRuleKey {
  // Unisys C operators and punctuators
  LBRACK("["),
  RBRACK("]"),
  LPAREN("("),
  RPAREN(")"),
  DOT("."),
  ARROW("->"),
  INC("++"),
  DEC("--"),
  BAND("&"),
  STAR("*"),
  PLUS("+"),
  MINUS("-"),
  BNOT("~"),
  LNOT("!"),
  SIZEOF("sizeof"),
  DIV("/"),
  MOD("%"),
  SL("<<"),
  SR(">>"),
  LT("<"),
  GT(">"),
  LE("<="),
  GE(">="),
  EQUAL("=="),
  NOT_EQUAL("!="),
  BXOR("^"),
  BOR("|"),
  LAND("&&"),
  LOR("||"),
  QUESTION("?"),
  COLON(":"),
  ASSIGN("="),
  STAR_ASSIGN("*="),
  DIV_ASSIGN("/="),
  MOD_ASSIGN("%="),
  PLUS_ASSIGN("+="),
  MINUS_ASSIGN("-="),
  SL_ASSIGN("<<="),
  SR_ASSIGN(">>="),
  BAND_ASSIGN("&="),
  BXOR_ASSIGN("^="),
  BOR_ASSIGN("|="),
  COMMA(","),
  HASH("#"),
  HASHHASH("##"),


  AT_SIGN("@"),
  DOUBLE_COLON("::"),
  DOUBLE_DOT(".."),
  LCURLYBRACE("{"),
  RCURLYBRACE("}"),
  LBRAKET("["),
  RBRAKET("]"),
  LPARENTHESIS("("),
  RPARENTHESIS(")"),
  DOUBLE_PLUS("++"),
  DOUBLE_MINUS("--"),
  NOT("!"),
  EQUAL1("="),
  EQUAL2("=="),
  EQUAL3("==="),
  NOTEQUAL1("!="),
  NOTEQUAL2("!=="),
  SR2(">>>"),
  STAR_EQU("*="),
  DIV_EQU("/="),
  MOD_EQU("%="),
  PLUS_EQU("+="),
  MINUS_EQU("-="),
  SL_EQU("<<="),
  SR_EQU(">>="),
  SR_EQU2(">>>="),
  AND_EQU("&="),
  XOR_EQU("^="),
  OR_EQU("|="),
  ANDAND_EQU("&&="),
  XORXOR_EQU("^^="),
  OROR_EQU("||="),
  AND("&"),
  ANDAND("&&"),
  XOR("^"),
  OR("|"),
  OROR("||"),
  QUERY("?"),
  TILD("~"),
  TRIPLE_DOTS("..."),
  SEMICOLON(";");

  private final String value;

  CPunctuator(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

}
