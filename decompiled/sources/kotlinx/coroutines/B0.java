package kotlinx.coroutines;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.TYPE, ElementType.METHOD})
@P2.a
@RequiresOptIn(level = RequiresOptIn.Level.WARNING, message = "This declaration is in a preview state and can be changed in a backwards-incompatible manner with a best-effort migration. Its usage should be marked with '@kotlinx.coroutines.FlowPreview' or '@OptIn(kotlinx.coroutines.FlowPreview::class)' if you accept the drawback of relying on preview API")
@P2.c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
@P2.d(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.TYPEALIAS, AnnotationTarget.PROPERTY})
@Documented
/* loaded from: classes2.dex */
public @interface B0 {
}
