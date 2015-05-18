import org.junit.Ignore;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;


/**
 * @description 计划测试
 */
@ContextConfiguration(locations = { 
		"classpath:/spring/spring-common.xml"
})
@Ignore
public class BaseTestCase extends AbstractTransactionalJUnit4SpringContextTests {
	
}
