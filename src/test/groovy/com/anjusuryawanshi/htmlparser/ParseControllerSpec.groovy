package com.anjusuryawanshi.htmlparser

import org.hamcrest.Matchers
import spock.lang.Unroll
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view

class ParseControllerSpec extends AbstractSpringContextSpec {

  @Unroll
  def 'can load title for url #url'() {
    expect:
      mockMvc.perform(get('/parse').param('url', url))
          .andExpect(status().isOk())
          .andExpect(view().name('parsed'))
          .andExpect(model().attribute('document', Matchers.hasProperty('title', Matchers.equalTo(title))))

    where:
      url           | title
      'http://www.google.com'  | 'Google'
      'http://www.hotwire.com' | 'Cheap Hotels, Cars, Airfare | Last Minute Travel Deals | Hotwire'
  }

}
