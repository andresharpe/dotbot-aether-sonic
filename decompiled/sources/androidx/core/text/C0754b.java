package androidx.core.text;

import android.text.TextUtils;

/* renamed from: androidx.core.text.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0754b {
    public static final boolean a(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return TextUtils.isDigitsOnly(charSequence);
    }

    public static final int b(@l3.d CharSequence charSequence) {
        kotlin.jvm.internal.F.p(charSequence, "<this>");
        return TextUtils.getTrimmedLength(charSequence);
    }
}
