package androidx.arch.core.executor;

import androidx.annotation.N;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class e {
    public abstract void a(@N Runnable runnable);

    public void b(@N Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            d(runnable);
        }
    }

    public abstract boolean c();

    public abstract void d(@N Runnable runnable);
}
