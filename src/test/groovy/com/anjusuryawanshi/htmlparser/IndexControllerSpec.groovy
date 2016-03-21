package com.anjusuryawanshi.htmlparser

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view

class IndexControllerSpec extends AbstractSpringContextSpec {

  def 'loads index page by default'() {
    expect:
      mockMvc.perform(get('/'))
          .andExpect(status().isOk())
          .andExpect(view().name('index'))
  }

}
