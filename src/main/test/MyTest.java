import com.service.DogService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MyTest {

     DogService dogService=new DogService ();
    @Test
    public void test(){
        System.out.println (dogService.getDogList ("0","15"));
    }
}
