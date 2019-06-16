package com.example;

import com.example.mymultiplyapi.MultiplyController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class MultiplyBase {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new MultiplyController());
    }

}