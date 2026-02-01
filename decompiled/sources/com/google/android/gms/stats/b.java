package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.internal.D;

@D
@I0.a
/* loaded from: classes2.dex */
public abstract class b extends E.a {
    @I0.a
    public static boolean d(@N Context context, @P Intent intent) {
        if (intent == null) {
            return false;
        }
        return E.a.b(intent);
    }
}
