package ind.tom.cmdlinerunnerex.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created on 2020/05/22
 *
 * 애스팩트 실험을 위한 어노테이션.
 *  -> replace-batch 모듈의 BatchManager 어노테이션을 상정한 녀석이다.
 *
 * @author tom.j
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Tom {
}
