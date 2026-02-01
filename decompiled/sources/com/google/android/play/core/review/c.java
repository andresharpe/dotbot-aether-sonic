package com.google.android.play.core.review;

import android.content.Context;
import androidx.annotation.N;

/* loaded from: classes2.dex */
public class c {
    private c() {
    }

    @N
    public static b a(@N Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new g(new l(context));
    }
}
