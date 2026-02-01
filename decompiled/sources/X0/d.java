package x0;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface d {

    @Target({ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface a {
    }

    @Target({ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface b {
    }

    Class<?>[] dependencies() default {};

    Class<?>[] modules() default {};
}
