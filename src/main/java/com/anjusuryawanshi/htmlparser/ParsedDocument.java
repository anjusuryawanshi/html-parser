/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.anjusuryawanshi.htmlparser;

public class ParsedDocument {

  private String title;

  public String getTitle() {
    return title;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {

    private final ParsedDocument document = new ParsedDocument();

    public Builder title(String title) {
      document.title = title;
      return this;
    }

    public ParsedDocument build() {
      return document;
    }

  }
}
