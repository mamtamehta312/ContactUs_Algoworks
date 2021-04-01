package Base;

//import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.BasicAWSCredentials;
@Configuration
public class AmazonClient {  
 //   private AmazonSQS sqsClient;

    @Value("${amazonProperties.accessKey}")
    private String accessKey;
    @Value("${amazonProperties.secretKey}")
    private String secretKey;

    //@PostConstruct
    private void initializeAmazon() {
    	System.out.println(accessKey);
    	System.out.println(secretKey);
        BasicAWSCredentials awsCredentials = new BasicAWSCredentials(this.accessKey, this.secretKey);
        System.out.println(awsCredentials.getAWSAccessKeyId());
    }
}
