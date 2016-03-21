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

import com.anjusuryawanshi.htmlparser.document.ParsedDocument;
import com.anjusuryawanshi.htmlparser.document.TagDescription;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HtmlParser {

  public ParsedDocument parse(String url) throws IOException {
    Document doc = Jsoup.connect(url).get();
    return ParsedDocument.builder()
        .title(doc.title())
        .tags(buildTags(doc))
        .tagCounts(buildTagCounts(doc))
        .build();
  }

  private List<TagDescription> buildTags(Element parentElement) {
    return parentElement.children()
        .stream()
        .map(element -> TagDescription.builder()
            .name(element.tagName())
            .children(buildTags(element))
            .attributes(buildAttributes(element))
            .text(element.ownText())
            .build())
        .collect(Collectors.<TagDescription>toList());
  }

  private Map<String, String> buildAttributes(Element element) {
    return element.attributes()
        .asList()
        .stream()
        .collect(Collectors.toMap(Attribute::getKey, Attribute::getValue));
  }

  private Map<String, Integer> buildTagCounts(Document doc) {
    Map<String, Integer> tagCounts = new LinkedHashMap<>();
    doc.getAllElements()
        .stream()
        .skip(1) // skip root
        .forEachOrdered(element -> {
          Integer currentValue = tagCounts.computeIfAbsent(element.tagName(), (key) -> 0);
          tagCounts.put(element.tagName(), currentValue + 1);
        });
    return tagCounts;
  }

}
