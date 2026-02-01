package androidx.startup;

import androidx.annotation.N;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class StartupException extends RuntimeException {
    public StartupException(@N String str) {
        super(str);
    }

    public StartupException(@N Throwable th) {
        super(th);
    }

    public StartupException(@N String str, @N Throwable th) {
        super(str, th);
    }
}
