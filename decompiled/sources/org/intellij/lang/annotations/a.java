package org.intellij.lang.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface a {

    /* renamed from: K0, reason: collision with root package name */
    @l3.c
    public static final String f55464K0 = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    /* renamed from: L0, reason: collision with root package name */
    @l3.c
    public static final String f55465L0 = "this";

    /* renamed from: M0, reason: collision with root package name */
    @l3.c
    public static final String f55466M0 = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    /* renamed from: N0, reason: collision with root package name */
    @l3.c
    public static final String f55467N0 = "The return value of this method";

    /* renamed from: O0, reason: collision with root package name */
    @l3.c
    public static final String f55468O0 = "this";

    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}
