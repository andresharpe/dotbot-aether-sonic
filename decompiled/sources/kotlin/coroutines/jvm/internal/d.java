package kotlin.coroutines.jvm.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Y;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@P2.d(allowedTargets = {AnnotationTarget.CLASS})
@Y(version = "1.3")
/* loaded from: classes2.dex */
public @interface d {
    @W2.i(name = "c")
    String c() default "";

    @W2.i(name = "f")
    String f() default "";

    @W2.i(name = "i")
    int[] i() default {};

    @W2.i(name = "l")
    int[] l() default {};

    @W2.i(name = "m")
    String m() default "";

    @W2.i(name = "n")
    String[] n() default {};

    @W2.i(name = "s")
    String[] s() default {};

    @W2.i(name = "v")
    int v() default 1;
}
