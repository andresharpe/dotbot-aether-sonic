package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;

@SuppressLint({"InlinedApi"})
/* renamed from: androidx.core.text.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0755c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12903a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12904b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12905c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12906d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f12907e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f12908f = 8;

    /* renamed from: g, reason: collision with root package name */
    public static final int f12909g = 16;

    /* renamed from: h, reason: collision with root package name */
    public static final int f12910h = 32;

    /* renamed from: i, reason: collision with root package name */
    public static final int f12911i = 256;

    /* renamed from: j, reason: collision with root package name */
    public static final int f12912j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f12913k = 63;

    @W(24)
    /* renamed from: androidx.core.text.c$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static Spanned a(String str, int i4) {
            return Html.fromHtml(str, i4);
        }

        @InterfaceC0577u
        static Spanned b(String str, int i4, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i4, imageGetter, tagHandler);
        }

        @InterfaceC0577u
        static String c(Spanned spanned, int i4) {
            return Html.toHtml(spanned, i4);
        }
    }

    private C0755c() {
    }

    @N
    public static Spanned a(@N String str, int i4) {
        return a.a(str, i4);
    }

    @N
    public static Spanned b(@N String str, int i4, @P Html.ImageGetter imageGetter, @P Html.TagHandler tagHandler) {
        return a.b(str, i4, imageGetter, tagHandler);
    }

    @N
    public static String c(@N Spanned spanned, int i4) {
        return a.c(spanned, i4);
    }
}
