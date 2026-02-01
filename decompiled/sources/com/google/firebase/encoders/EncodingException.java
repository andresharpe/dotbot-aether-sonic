package com.google.firebase.encoders;

import androidx.annotation.N;

/* loaded from: classes2.dex */
public final class EncodingException extends RuntimeException {
    public EncodingException(@N String str) {
        super(str);
    }

    public EncodingException(@N String str, @N Exception exc) {
        super(str, exc);
    }
}
