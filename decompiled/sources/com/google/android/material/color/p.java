package com.google.android.material.color;

import T0.a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.content.res.loader.ResourcesLoader;
import android.os.Build;
import android.view.ContextThemeWrapper;
import androidx.annotation.InterfaceC0568k;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.core.content.C0669d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static final String f32031a = "p";

    private p() {
    }

    @W(api = 21)
    private static void a(@N Map<Integer, Integer> map, @N TypedArray typedArray, @P TypedArray typedArray2, @InterfaceC0569l int i4) {
        if (typedArray2 == null) {
            typedArray2 = typedArray;
        }
        for (int i5 = 0; i5 < typedArray.getIndexCount(); i5++) {
            int resourceId = typedArray2.getResourceId(i5, 0);
            if (resourceId != 0 && typedArray.hasValue(i5) && e(typedArray.getType(i5))) {
                map.put(Integer.valueOf(resourceId), Integer.valueOf(s.i(typedArray.getColor(i5, 0), i4)));
            }
        }
    }

    @W(api = 30)
    private static boolean b(Context context, Map<Integer, Integer> map) {
        ResourcesLoader a4 = h.a(context, map);
        if (a4 != null) {
            context.getResources().addLoaders(a4);
            return true;
        }
        return false;
    }

    @N
    public static void c(@N Context context, @N q qVar) {
        if (!f()) {
            return;
        }
        Map<Integer, Integer> d4 = d(context, qVar);
        int e4 = qVar.e(0);
        if (b(context, d4) && e4 != 0) {
            u.a(context, e4);
        }
    }

    @W(api = 21)
    private static Map<Integer, Integer> d(Context context, q qVar) {
        TypedArray typedArray;
        HashMap hashMap = new HashMap();
        int c4 = s.c(context, qVar.b(), f32031a);
        for (int i4 : qVar.d()) {
            hashMap.put(Integer.valueOf(i4), Integer.valueOf(s.i(C0669d.f(context, i4), c4)));
        }
        n c5 = qVar.c();
        if (c5 != null) {
            int[] d4 = c5.d();
            if (d4.length > 0) {
                int e4 = c5.e();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d4);
                if (e4 != 0) {
                    typedArray = new ContextThemeWrapper(context, e4).obtainStyledAttributes(d4);
                } else {
                    typedArray = null;
                }
                a(hashMap, obtainStyledAttributes, typedArray, c4);
                obtainStyledAttributes.recycle();
                if (typedArray != null) {
                    typedArray.recycle();
                }
            }
        }
        return hashMap;
    }

    private static boolean e(int i4) {
        return 28 <= i4 && i4 <= 31;
    }

    @InterfaceC0568k(api = 30)
    public static boolean f() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    @N
    public static Context g(@N Context context, @N q qVar) {
        if (!f()) {
            return context;
        }
        Map<Integer, Integer> d4 = d(context, qVar);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, qVar.e(a.n.z9));
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        if (b(contextThemeWrapper, d4)) {
            return contextThemeWrapper;
        }
        return context;
    }
}
