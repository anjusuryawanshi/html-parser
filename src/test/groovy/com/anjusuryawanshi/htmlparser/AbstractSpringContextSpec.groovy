package com.anjusuryawanshi.htmlparser

import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import spock.lang.Specification

@ContextConfiguration(loader = SpringApplicationContextLoader.class, classes = HtmlParseApplication.class)
@WebAppConfiguration
@IntegrationTest
abstract class AbstractSpringContextSpec extends Specification {

  protected MockMvc mockMvc

  def setup() {
    mockMvc = MockMvcBuilders.standaloneSetup(new IndexController(), new ParseController()).build()
  }

}
