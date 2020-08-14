package ind.tom.cmdlinerunnerex.service;

import ind.tom.cmdlinerunnerex.annotation.Tom;
import org.springframework.stereotype.Service;

/**
 * Created on 2020/05/22
 *
 * @author tom.j
 */
@Service
public class TestService {

    @Tom
    public void printMsg() {
        System.out.println("Hello, I am TestService!");
    }
}
