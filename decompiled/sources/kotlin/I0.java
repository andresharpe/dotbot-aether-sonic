package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({})
@P2.a
@P2.c(AnnotationRetention.SOURCE)
@Documented
@Retention(RetentionPolicy.SOURCE)
@P2.d(allowedTargets = {AnnotationTarget.TYPE})
/* loaded from: classes2.dex */
public @interface I0 {
}
