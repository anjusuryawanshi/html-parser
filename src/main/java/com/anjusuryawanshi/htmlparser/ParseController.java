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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.io.IOException;

@Controller
public class ParseController {

  @RequestMapping("/parse")
  public ModelAndView parse(@RequestParam String url) throws ParseException {
    try {
      return new ModelAndView("parsed", "document", new HtmlParser().parse(url));
    } catch (IOException e) {
      throw new ParseException("unable to parse document for url " + url, e);
    }
  }

}
