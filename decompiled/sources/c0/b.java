package c0;

import androidx.annotation.N;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface b {

    @Target({})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
        int mask() default 0;

        @N
        String name();

        int value();
    }

    @N
    a[] intMapping() default {};

    @N
    String value();
}
