package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.TYPE})
@P2.c(AnnotationRetention.RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
@P2.d(allowedTargets = {AnnotationTarget.CLASS})
@Y(version = "1.3")
/* loaded from: classes2.dex */
public @interface E {

    /* loaded from: classes2.dex */
    public static final class a {
        @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.")
        public static /* synthetic */ void a() {
        }

        @Y(version = "1.2")
        public static /* synthetic */ void b() {
        }

        @Y(version = "1.1")
        public static /* synthetic */ void c() {
        }
    }

    @W2.i(name = "bv")
    int[] bv() default {1, 0, 3};

    @W2.i(name = "d1")
    String[] d1() default {};

    @W2.i(name = "d2")
    String[] d2() default {};

    @W2.i(name = "k")
    int k() default 1;

    @W2.i(name = "mv")
    int[] mv() default {};

    @W2.i(name = "pn")
    String pn() default "";

    @W2.i(name = "xi")
    int xi() default 0;

    @W2.i(name = "xs")
    String xs() default "";
}
