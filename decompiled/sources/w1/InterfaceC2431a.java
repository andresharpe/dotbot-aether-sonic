package w1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC2431a {

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: w1.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public @interface InterfaceC0549a {
        boolean inline() default false;

        String name() default "";
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: w1.a$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }
}
