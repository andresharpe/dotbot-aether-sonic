package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.ANNOTATION_TYPE})
@P2.c(AnnotationRetention.SOURCE)
@Retention(RetentionPolicy.SOURCE)
@P2.d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
/* loaded from: classes.dex */
public @interface b0 {
    boolean open() default false;

    String[] value() default {};
}
