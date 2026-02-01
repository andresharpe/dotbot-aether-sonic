package androidx.core.os;

import androidx.annotation.P;

/* loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(@P String str) {
        super(androidx.core.util.p.f(str, "The operation has been canceled."));
    }
}
