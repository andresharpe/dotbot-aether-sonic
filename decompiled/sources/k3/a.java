package k3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({})
@P2.c(AnnotationRetention.SOURCE)
@Retention(RetentionPolicy.SOURCE)
@P2.d(allowedTargets = {AnnotationTarget.PROPERTY})
/* loaded from: classes2.dex */
public @interface a {
}
