package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;

@Target({})
@P2.a
@Documented
@Retention(RetentionPolicy.RUNTIME)
@P2.d(allowedTargets = {AnnotationTarget.TYPE})
@Y(version = "1.1")
/* loaded from: classes2.dex */
public @interface O {
    String name();
}
