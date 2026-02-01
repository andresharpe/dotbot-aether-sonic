package androidx.navigation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.METHOD})
@RequiresOptIn(level = RequiresOptIn.Level.WARNING)
@P2.c(AnnotationRetention.RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
@P2.d(allowedTargets = {AnnotationTarget.FUNCTION})
/* loaded from: classes.dex */
public @interface E {
}
