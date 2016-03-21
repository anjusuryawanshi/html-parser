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

package com.anjusuryawanshi.htmlparser.document;

import java.util.List;
import java.util.Map;

public class ParsedDocument {

  private String title;
  private List<TagDescription> tags;
  private Map<String, Integer> tagCounts;

  public String getTitle() {
    return title;
  }

  public List<TagDescription> getTags() {
    return tags;
  }

  public Map<String, Integer> getTagCounts() {
    return tagCounts;
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

    public Builder tags(List<TagDescription> tags) {
      document.tags = tags;
      return this;
    }

    public Builder tagCounts(Map<String, Integer> tagCounts) {
      document.tagCounts = tagCounts;
      return this;
    }

    public ParsedDocument build() {
      return document;
    }
  }
}
