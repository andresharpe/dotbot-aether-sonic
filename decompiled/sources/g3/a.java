package g3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlinx.android.extensions.CacheImplementation;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface a {
    CacheImplementation cache() default CacheImplementation.HASH_MAP;
}
