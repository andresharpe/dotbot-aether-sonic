package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.W;
import java.util.Locale;

@SuppressLint({"ClassVerificationFailure"})
/* renamed from: androidx.core.text.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0758f {
    @W(17)
    public static final int a(@l3.d Locale locale) {
        kotlin.jvm.internal.F.p(locale, "<this>");
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
