package com.example.mymultiplyapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MyMultiplyApiApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void whenTestApp_thenEmptyResponse() throws Exception {
		this.mockMvc.perform(post("/multiply")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{ \"number1\": 2, \"number2\": 3 }"))
				.andExpect(status().isOk())
		        .andExpect(content().string(containsString("6")));
	}
}
