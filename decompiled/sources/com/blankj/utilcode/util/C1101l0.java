package com.blankj.utilcode.util;

import android.graphics.drawable.Drawable;
import androidx.annotation.InterfaceC0578v;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.core.content.C0669d;
import com.spotify.sdk.android.auth.b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.blankj.utilcode.util.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1101l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f25029a = 8192;

    private C1101l0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean a(String str, String str2) {
        try {
            String[] list = E0.a().getAssets().list(str);
            if (list != null && list.length > 0) {
                boolean z3 = true;
                for (String str3 : list) {
                    z3 &= a(str + "/" + str3, str2 + "/" + str3);
                }
                return z3;
            }
            return H0.i1(str2, E0.a().getAssets().open(str));
        } catch (IOException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public static boolean b(@androidx.annotation.V int i4, String str) {
        return H0.i1(str, E0.a().getResources().openRawResource(i4));
    }

    public static int c(String str) {
        return E0.a().getResources().getIdentifier(str, "anim", E0.a().getPackageName());
    }

    public static int d(String str) {
        return E0.a().getResources().getIdentifier(str, v.b.f7402d, E0.a().getPackageName());
    }

    public static int e(String str) {
        return E0.a().getResources().getIdentifier(str, "dimen", E0.a().getPackageName());
    }

    public static Drawable f(@InterfaceC0578v int i4) {
        return C0669d.i(E0.a(), i4);
    }

    public static int g(String str) {
        return E0.a().getResources().getIdentifier(str, "drawable", E0.a().getPackageName());
    }

    public static int h(String str) {
        return E0.a().getResources().getIdentifier(str, b.c.f48986a, E0.a().getPackageName());
    }

    public static int i(String str) {
        return E0.a().getResources().getIdentifier(str, "layout", E0.a().getPackageName());
    }

    public static int j(String str) {
        return E0.a().getResources().getIdentifier(str, "menu", E0.a().getPackageName());
    }

    public static int k(String str) {
        return E0.a().getResources().getIdentifier(str, "mipmap", E0.a().getPackageName());
    }

    public static int l(String str) {
        return E0.a().getResources().getIdentifier(str, v.b.f7403e, E0.a().getPackageName());
    }

    public static int m(String str) {
        return E0.a().getResources().getIdentifier(str, "style", E0.a().getPackageName());
    }

    public static List<String> n(String str) {
        return o(str, "");
    }

    public static List<String> o(String str, String str2) {
        try {
            return H0.o0(E0.a().getResources().getAssets().open(str), str2);
        } catch (IOException e4) {
            e4.printStackTrace();
            return Collections.emptyList();
        }
    }

    public static String p(String str) {
        return q(str, null);
    }

    public static String q(String str, String str2) {
        try {
            byte[] n02 = H0.n0(E0.a().getAssets().open(str));
            if (n02 == null) {
                return "";
            }
            if (H0.D0(str2)) {
                return new String(n02);
            }
            try {
                return new String(n02, str2);
            } catch (UnsupportedEncodingException e4) {
                e4.printStackTrace();
                return "";
            }
        } catch (IOException e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public static List<String> r(@androidx.annotation.V int i4) {
        return s(i4, "");
    }

    public static List<String> s(@androidx.annotation.V int i4, String str) {
        return H0.o0(E0.a().getResources().openRawResource(i4), str);
    }

    public static String t(@androidx.annotation.V int i4) {
        return u(i4, null);
    }

    public static String u(@androidx.annotation.V int i4, String str) {
        byte[] n02 = H0.n0(E0.a().getResources().openRawResource(i4));
        if (n02 == null) {
            return null;
        }
        if (H0.D0(str)) {
            return new String(n02);
        }
        try {
            return new String(n02, str);
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
            return "";
        }
    }
}
