package k3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import k3.c;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.TYPE_USE})
@P2.c(AnnotationRetention.SOURCE)
@Retention(RetentionPolicy.SOURCE)
@P2.d(allowedTargets = {AnnotationTarget.TYPE})
/* loaded from: classes2.dex */
public @interface g<P extends c<?>> {
}
