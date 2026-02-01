package com.google.android.gms.tasks;

/* loaded from: classes2.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, @androidx.annotation.P Throwable th) {
        super(str, th);
    }

    @androidx.annotation.N
    public static IllegalStateException a(@androidx.annotation.N AbstractC1770k<?> abstractC1770k) {
        String str;
        if (!abstractC1770k.u()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception q4 = abstractC1770k.q();
        if (q4 != null) {
            str = "failure";
        } else if (abstractC1770k.v()) {
            str = "result ".concat(String.valueOf(abstractC1770k.r()));
        } else if (abstractC1770k.t()) {
            str = "cancellation";
        } else {
            str = "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(str), q4);
    }
}
