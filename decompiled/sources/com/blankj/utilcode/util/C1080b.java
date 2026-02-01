package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.blankj.utilcode.util.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1080b {

    /* renamed from: a, reason: collision with root package name */
    private static List<Field> f24980a;

    /* renamed from: com.blankj.utilcode.util.b$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1080b.l();
        }
    }

    private C1080b() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @androidx.annotation.N
    public static Resources b(@androidx.annotation.N Resources resources, int i4) {
        return c(resources, i4, false);
    }

    @androidx.annotation.N
    public static Resources c(@androidx.annotation.N Resources resources, int i4, boolean z3) {
        int i5;
        int i6 = resources.getDisplayMetrics().heightPixels;
        if (z3) {
            i5 = j(resources);
        } else {
            i5 = 0;
        }
        e(resources, ((i6 + i5) * 72.0f) / i4);
        return resources;
    }

    @androidx.annotation.N
    public static Resources d(@androidx.annotation.N Resources resources, int i4) {
        e(resources, (resources.getDisplayMetrics().widthPixels * 72.0f) / i4);
        return resources;
    }

    private static void e(@androidx.annotation.N Resources resources, float f4) {
        resources.getDisplayMetrics().xdpi = f4;
        E0.a().getResources().getDisplayMetrics().xdpi = f4;
        g(resources, f4);
    }

    private static void f(Resources resources, float f4) {
        Iterator<Field> it = f24980a.iterator();
        while (it.hasNext()) {
            try {
                DisplayMetrics displayMetrics = (DisplayMetrics) it.next().get(resources);
                if (displayMetrics != null) {
                    displayMetrics.xdpi = f4;
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    private static void g(Resources resources, float f4) {
        if (f24980a == null) {
            f24980a = new ArrayList();
            Class<?> cls = resources.getClass();
            Field[] declaredFields = cls.getDeclaredFields();
            while (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    if (field.getType().isAssignableFrom(DisplayMetrics.class)) {
                        field.setAccessible(true);
                        DisplayMetrics i4 = i(resources, field);
                        if (i4 != null) {
                            f24980a.add(field);
                            i4.xdpi = f4;
                        }
                    }
                }
                cls = cls.getSuperclass();
                if (cls != null) {
                    declaredFields = cls.getDeclaredFields();
                } else {
                    return;
                }
            }
            return;
        }
        f(resources, f4);
    }

    @androidx.annotation.N
    public static Resources h(@androidx.annotation.N Resources resources) {
        e(resources, Resources.getSystem().getDisplayMetrics().density * 72.0f);
        return resources;
    }

    private static DisplayMetrics i(Resources resources, Field field) {
        try {
            return (DisplayMetrics) field.get(resources);
        } catch (Exception unused) {
            return null;
        }
    }

    private static int j(@androidx.annotation.N Resources resources) {
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable k() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l() {
        e(Resources.getSystem(), Resources.getSystem().getDisplayMetrics().xdpi);
    }

    public static int m(float f4) {
        return (int) (((f4 * E0.a().getResources().getDisplayMetrics().xdpi) / 72.0f) + 0.5d);
    }

    public static int n(float f4) {
        return (int) (((f4 * 72.0f) / E0.a().getResources().getDisplayMetrics().xdpi) + 0.5d);
    }
}
