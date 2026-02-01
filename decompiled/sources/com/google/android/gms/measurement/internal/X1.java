package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.v;
import com.google.android.gms.common.r;

/* loaded from: classes2.dex */
public final class X1 {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(r.b.f28867a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    @androidx.annotation.P
    public static final String b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, v.b.f7403e, str2);
        if (identifier != 0) {
            try {
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        return resources.getString(identifier);
    }
}
