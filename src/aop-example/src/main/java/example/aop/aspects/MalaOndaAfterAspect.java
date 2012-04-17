package example.aop.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MalaOndaAfterAspect {

    @AfterReturning("execution(* comprar(..))")
    public void despues() {
        System.out.println("Maldito ..");
    }
}