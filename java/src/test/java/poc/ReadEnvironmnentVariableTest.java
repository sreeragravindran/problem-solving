package poc;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class ReadEnvironmnentVariableTest {

    @Test
    public void should_read_env_variables(){
        Map<String, String> env =  ReadEnvironmentVariable.getVariables();

        Assert.assertTrue(env.containsKey("NODE_ENV"));
    }
}
