package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;

/* renamed from: androidx.core.content.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0672g {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f12214a = "android.intent.action.CREATE_REMINDER";

    /* renamed from: b, reason: collision with root package name */
    public static final String f12215b = "android.intent.extra.HTML_TEXT";

    /* renamed from: c, reason: collision with root package name */
    public static final String f12216c = "android.intent.extra.START_PLAYBACK";

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f12217d = "android.intent.extra.TIME";

    /* renamed from: e, reason: collision with root package name */
    public static final String f12218e = "android.intent.category.LEANBACK_LAUNCHER";

    @W(15)
    /* renamed from: androidx.core.content.g$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static Intent a(String str, String str2) {
            return Intent.makeMainSelectorActivity(str, str2);
        }
    }

    private C0672g() {
    }

    @androidx.annotation.N
    public static Intent a(@androidx.annotation.N Context context, @androidx.annotation.N String str) {
        if (J.a(context.getPackageManager())) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 31) {
                return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", str, null));
            }
            Intent data = new Intent(J.f12165b).setData(Uri.fromParts("package", str, null));
            if (i4 >= 30) {
                return data;
            }
            return data.setPackage((String) androidx.core.util.u.l(J.b(context.getPackageManager())));
        }
        throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
    }

    @androidx.annotation.N
    public static Intent b(@androidx.annotation.N String str, @androidx.annotation.N String str2) {
        return a.a(str, str2);
    }
}
