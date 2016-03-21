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

public class TagDescription {

  private String name;
  private Map<String, String> attributes;
  private List<TagDescription> children;
  private String text;

  public String getName() {
    return name;
  }

  public Map<String, String> getAttributes() {
    return attributes;
  }

  public List<TagDescription> getChildren() {
    return children;
  }

  public String getText() {
    return text;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {

    private final TagDescription tag = new TagDescription();

    public Builder name(String name) {
      tag.name = name;
      return this;
    }

    public Builder attributes(Map<String, String> attributes) {
      tag.attributes = attributes;
      return this;
    }

    public Builder children(List<TagDescription> children) {
      tag.children = children;
      return this;
    }

    public Builder text(String text) {
      tag.text = text;
      return this;
    }

    public TagDescription build() {
      return tag;
    }
  }
}
