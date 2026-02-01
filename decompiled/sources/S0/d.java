package s0;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface d {

    /* renamed from: Q0, reason: collision with root package name */
    public static final int f57632Q0 = 0;

    /* renamed from: R0, reason: collision with root package name */
    public static final int f57633R0 = 1;

    /* renamed from: S0, reason: collision with root package name */
    public static final int f57634S0 = 2;

    boolean memoizeStaticMethod() default false;

    int override() default 0;

    boolean skipStaticMethod() default false;

    String staticMethodName() default "";
}
