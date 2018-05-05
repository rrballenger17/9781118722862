package group.mytests;


import group.mytests.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

import group.mytests.AppConfig;
/*
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class MachineLearningTest {

	//DI
    @Autowired
    @Qualifier("ml")
    DataModelService ml;

    @Test
    public void test_ml_always_return_true() {

        //assert correct type/impl
        assertThat(ml, instanceOf(MachineLearningService.class));

        //assert true
        assertThat(ml.isValid(""), is(true));

    }
}*/

@ContextConfiguration(classes = {AppConfig.class})
		@RunWith(SpringJUnit4ClassRunner.class)
		public class MachineLearningTest {

		    @Autowired
		    private DataModelService application;


		    @Test
		    public void checkWiring() {
		        assertNotNull(application);
		    }

		    @Test
		    public void useSpringIntegrationTests() {
		    	
		    		System.out.println("the result is "+ application.isValid("test"));

		        assertEquals(application.isValid("test"), true);
		    }
		}