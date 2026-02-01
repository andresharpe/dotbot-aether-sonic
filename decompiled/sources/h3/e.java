package h3;

import h3.b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.P;

@Target({ElementType.TYPE})
@P2.b
@P2.c(AnnotationRetention.SOURCE)
@Repeatable(a.class)
@Retention(RetentionPolicy.SOURCE)
@P2.d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.PROPERTY})
/* loaded from: classes2.dex */
public @interface e<T, P extends b<? super T>> {

    @Target({ElementType.TYPE})
    @P
    @P2.c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    @P2.d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.PROPERTY})
    /* loaded from: classes2.dex */
    public @interface a {
        e[] value();
    }
}
