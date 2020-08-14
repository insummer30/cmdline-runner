package ind.tom.cmdlinerunnerex.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created on 2020/05/22
 *
 * 어노테이션 애스팩트.
 *  -> replace-batch 모듈의 어노테이션 처리 애스팩트를 상정한 녀석이다.
 *
 * @author tom.j
 */
@Aspect
@Component
public class TomAnnotationAspect {

    @Around("@annotation(Tom)")
    public Object target(ProceedingJoinPoint point) throws Throwable {
        System.out.println("Aspect started...");

        Object ret = point.proceed();

        System.out.println("Aspect finished...");

        return ret;
    }
}
