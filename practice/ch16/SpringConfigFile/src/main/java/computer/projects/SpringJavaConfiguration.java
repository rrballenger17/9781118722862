package computer.projects;

import java.io.IOException;
import java.util.Dictionary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringJavaConfiguration {

    @Bean
    public MessageService messageService() throws IOException {
        return new MockMessageService();
    }
    
    //<bean id="MessageService" 
    //        class="computer.projects.beans.MockMessageService">
    //  </bean>


}