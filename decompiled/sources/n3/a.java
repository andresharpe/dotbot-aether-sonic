package n3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.experimental.theories.f;

@Target({ElementType.PARAMETER})
@f(b.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface a {
    int[] ints();
}
