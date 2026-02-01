package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;

@Target({})
@P2.a
@P2.c(AnnotationRetention.BINARY)
@Documented
@Retention(RetentionPolicy.CLASS)
@P2.d(allowedTargets = {})
/* loaded from: classes2.dex */
public @interface V {
    String expression();

    String[] imports();
}
