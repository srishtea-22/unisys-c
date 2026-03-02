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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import org.sonar.sslr.grammar.GrammarRuleKey;

public enum CKeyword implements GrammarRuleKey {
  // Unisys C keywords
  ASM,
  AUTO,
  BREAK,
  CHAR,
  CONST,
  CONTINUE,
  DEFAULT,
  DO,
  DOUBLE,
  ELSE,
  ENUM,
  EXTERN,
  __FAR,
  FLOAT,
  FOR,
  GOTO,
  IF,
  INLINE,
  INT,
  LONG,
  __NEAR,
  REGISTER,
  RETURN,
  SHORT,
  SIGNED,
  SIZEOF,
  __STACK_NUMBER__,
  STATIC(true),
  STRUCT,
  SWITCH,
  TYPEDEF,
  UNION,
  UNSIGNED,
  __USER_LOCK__,
  __USER_UNLOCK__,
  VOID,
  VOLATILE,
  WHILE,

  /**
   * "as" is not keyword in ActionScript 2, so we treat it as syntactic keyword
   */
  AS(true),
  CASE,
  CATCH,
  CLASS,
  DELETE,
  EXTENDS,
  FALSE,
  FINALLY,
  FUNCTION,
  IMPLEMENTS,
  IMPORT,
  IN,
  INSTANCEOF,
  INTERFACE,
  INTERNAL,
  IS,
  NEW,
  NULL,
  PACKAGE,
  PRIVATE,
  PROTECTED,
  PUBLIC,
  SUPER,
  THIS,
  THROW,
  TRUE,
  TRY,
  TYPEOF,
  USE,
  VAR,
  WITH,

  EACH(true),
  GET(true),
  SET(true),
  NAMESPACE(true),
  INCLUDE(true),
  DYNAMIC(true),
  FINAL(true),
  // "native" strangely appears in both the "keywords" and "syntactic keywords" lists of the language spec
  // It seems that "native" is accepted as a valid identifier by the compiler and should be considered as a "syntactic keyword"
  NATIVE(true),
  OVERRIDE(true),
  XML(true);

  private final boolean syntactic;

  CKeyword() {
    this(false);
  }

  CKeyword(boolean syntactic) {
    this.syntactic = syntactic;
  }

  public static String[] keywordValues() {
    String[] keywordsValue = new String[CKeyword.values().length];
    int i = 0;
    for (CKeyword keyword : CKeyword.values()) {
      keywordsValue[i] = keyword.getValue();
      i++;
    }
    return keywordsValue;
  }

  public static List<CKeyword> keywords() {
    return Collections.unmodifiableList(Arrays.stream(values())
      .filter(CKeyword -> !CKeyword.syntactic)
      .collect(Collectors.toList()));
  }

  public String getValue() {
    return toString().toLowerCase(Locale.ENGLISH);
  }

}
