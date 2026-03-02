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
package org.sonar.flex.api;

import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.TokenType;

public enum FlexPunctuator implements TokenType {
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

  LCURLY("{"),
  RCURLY("}"),
  DBL_COLON("::"),
  STRICT_EQUAL("==="),
  STRICT_NOT_EQUAL("!=="),
  BSR(">>>"),
  BSR_ASSIGN(">>>="),
  LAND_ASSIGN("&&="),
  LOR_ASSIGN("||="),
  E4X_ATTRI("@"),
  SEMI(";"),
  REST("...");

  private final String value;

  FlexPunctuator(String value) {
    this.value = value;
  }

  @Override
  public String getName() {
    return name();
  }

  @Override
  public String getValue() {
    return value;
  }

  @Override
  public boolean hasToBeSkippedFromAst(AstNode node) {
    return false;
  }

}
