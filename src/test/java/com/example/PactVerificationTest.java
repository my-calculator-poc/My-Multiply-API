package com.example;

import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import com.example.mymultiplyapi.MyMultiplyApiApplication;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.web.context.ConfigurableWebApplicationContext;

@RunWith(PactRunner.class)
@Provider("test_provider")
@PactBroker(host = "localhost", port = "9292")
public class PactVerificationTest {
    @TestTarget
    public final Target target = new HttpTarget("http", "localhost", 8081);

    private static ConfigurableWebApplicationContext application;

    @BeforeClass
    public static void start() {
        application = (ConfigurableWebApplicationContext)
                SpringApplication.run(MyMultiplyApiApplication.class);
    }

    @State("test multiply POST")
    public void toPostState() { }
}