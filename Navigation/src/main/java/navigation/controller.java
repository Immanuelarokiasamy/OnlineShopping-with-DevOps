package navigation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class controller {
@RequestMapping(value="/navig")
	   public String navigate() {
	      return "nav";
	   }
}

