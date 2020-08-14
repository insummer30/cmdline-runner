package ind.tom.cmdlinerunnerex;

import ind.tom.cmdlinerunnerex.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * spring MVC가 아닌 일반 배치성 프로그램이 스프링부트로 실행되는 과정을 이해하기 위한 프로젝트!
 *  - 특히, replace batch 모듈들이 CommandLineRunner와 Aspect를 이용해서 동작하는 방식을 이해하는데 좋다.
 */
@SpringBootApplication
public class CmdLineRunnerExApplication {

    @Autowired
    private TestService testService;

    public static void main(String[] args) {
        System.out.println("main started.");

        SpringApplication.run(CmdLineRunnerExApplication.class, args);

        System.out.println("main finished.");
    }

    /**
     * CommandLineRunner는 함수형 인터페이스로 SpringApplication이 시작하면서 호출 되는 것으로 보인다.
     *
     *  실제로 SpringApplication.run() 안으로 들어가서 파다보면,
     *  callRunners 함수 안에서 ApplicationContext를 가지고
     *  ApplicatioRunner, CommandLineRunner 인터페이스를 구현한 Bean을 찾아서
     *  등록하고 실행 시키는 것을 알 수 있다.
     */
    @Bean
    public CommandLineRunner getCommandLineRunner() {
        return args -> {
            System.out.println("CommandLineRunner started!");

            // 보통 여기서 특정 서비스를 시작 시킨다.
            testService.printMsg();
            // 서비스 종료시 뭔가 추가로 할일이 있으면 이 밑에 추가하면 된다.

            System.out.println("CommandLineRunner finished!");
        };
    }
}
