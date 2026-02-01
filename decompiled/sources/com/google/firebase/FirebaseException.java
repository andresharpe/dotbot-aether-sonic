package com.google.firebase;

import androidx.annotation.N;
import com.google.android.gms.common.internal.C1285y;

/* loaded from: classes2.dex */
public class FirebaseException extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public FirebaseException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(@N String str) {
        super(str);
        C1285y.i(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(@N String str, @N Throwable th) {
        super(str, th);
        C1285y.i(str, "Detail message must not be empty");
    }
}
