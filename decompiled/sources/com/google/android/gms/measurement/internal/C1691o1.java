package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C1285y;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1691o1 {

    /* renamed from: b, reason: collision with root package name */
    protected static final AtomicReference f30892b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    protected static final AtomicReference f30893c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    protected static final AtomicReference f30894d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1685n1 f30895a;

    public C1691o1(InterfaceC1685n1 interfaceC1685n1) {
        this.f30895a = interfaceC1685n1;
    }

    private static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z3;
        String str2;
        C1285y.l(strArr);
        C1285y.l(strArr2);
        C1285y.l(atomicReference);
        if (strArr.length == strArr2.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.a(z3);
        for (int i4 = 0; i4 < strArr.length; i4++) {
            Object obj = strArr[i4];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i4];
                        if (str2 == null) {
                            str2 = strArr2[i4] + "(" + strArr[i4] + ")";
                            strArr3[i4] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String a(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = b((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(valueOf);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.f30895a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(e(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = a(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb.append(valueOf);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String c(C1736w c1736w) {
        String b4;
        if (!this.f30895a.zza()) {
            return c1736w.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(c1736w.f31014G);
        sb.append(",name=");
        sb.append(d(c1736w.f31012E));
        sb.append(",params=");
        C1724u c1724u = c1736w.f31013F;
        if (c1724u == null) {
            b4 = null;
        } else if (!this.f30895a.zza()) {
            b4 = c1724u.toString();
        } else {
            b4 = b(c1724u.i0());
        }
        sb.append(b4);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String d(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f30895a.zza()) {
            return str;
        }
        return g(str, D2.f30147c, D2.f30145a, f30892b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f30895a.zza()) {
            return str;
        }
        return g(str, E2.f30164b, E2.f30163a, f30893c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f30895a.zza()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return "experiment_id(" + str + ")";
        }
        return g(str, F2.f30177b, F2.f30176a, f30894d);
    }
}
