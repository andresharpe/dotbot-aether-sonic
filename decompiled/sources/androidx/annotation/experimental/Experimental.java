package androidx.annotation.experimental;

import P2.c;
import P2.d;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.E;
import kotlin.InterfaceC2205l;
import kotlin.V;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Target({ElementType.ANNOTATION_TYPE})
@InterfaceC2205l(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @V(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
@c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
@d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
/* loaded from: classes.dex */
public @interface Experimental {

    @E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/annotation/experimental/Experimental$Level;", "", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "annotation-experimental_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public enum Level {
        WARNING,
        ERROR
    }

    Level level() default Level.ERROR;
}
