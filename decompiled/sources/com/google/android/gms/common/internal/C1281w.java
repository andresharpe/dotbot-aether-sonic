package com.google.android.gms.common.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import l1.InterfaceC2354a;

@I0.a
/* renamed from: com.google.android.gms.common.internal.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1281w {

    @I0.a
    /* renamed from: com.google.android.gms.common.internal.w$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f28827a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f28828b;

        /* synthetic */ a(Object obj, C1284x0 c1284x0) {
            C1285y.l(obj);
            this.f28828b = obj;
            this.f28827a = new ArrayList();
        }

        @I0.a
        @InterfaceC2354a
        @androidx.annotation.N
        public a a(@androidx.annotation.N String str, @androidx.annotation.P Object obj) {
            List list = this.f28827a;
            C1285y.l(str);
            list.add(str + "=" + String.valueOf(obj));
            return this;
        }

        @I0.a
        @androidx.annotation.N
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f28828b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f28827a.size();
            for (int i4 = 0; i4 < size; i4++) {
                sb.append((String) this.f28827a.get(i4));
                if (i4 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private C1281w() {
        throw new AssertionError("Uninstantiable");
    }

    @I0.a
    public static boolean a(@androidx.annotation.N Bundle bundle, @androidx.annotation.N Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            Set<String> keySet = bundle.keySet();
            if (!keySet.containsAll(bundle2.keySet())) {
                return false;
            }
            for (String str : keySet) {
                if (!b(bundle.get(str), bundle2.get(str))) {
                    return false;
                }
            }
            return true;
        }
        if (bundle == bundle2) {
            return true;
        }
        return false;
    }

    @I0.a
    public static boolean b(@androidx.annotation.P Object obj, @androidx.annotation.P Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    @I0.a
    public static int c(@androidx.annotation.N Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @I0.a
    @androidx.annotation.N
    public static a d(@androidx.annotation.N Object obj) {
        return new a(obj, null);
    }
}
