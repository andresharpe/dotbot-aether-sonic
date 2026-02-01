package com.blankj.utilcode.util;

import com.blankj.utilcode.util.E0;
import java.util.List;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f25177a = System.getProperty("line.separator");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends E0.f<b> {

        /* renamed from: T, reason: collision with root package name */
        final /* synthetic */ String[] f25178T;

        /* renamed from: U, reason: collision with root package name */
        final /* synthetic */ boolean f25179U;

        /* renamed from: V, reason: collision with root package name */
        final /* synthetic */ boolean f25180V;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(E0.b bVar, String[] strArr, boolean z3, boolean z4) {
            super(bVar);
            this.f25178T = strArr;
            this.f25179U = z3;
            this.f25180V = z4;
        }

        @Override // com.blankj.utilcode.util.y0.g
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b f() {
            return t0.j(this.f25178T, this.f25179U, this.f25180V);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f25181a;

        /* renamed from: b, reason: collision with root package name */
        public String f25182b;

        /* renamed from: c, reason: collision with root package name */
        public String f25183c;

        public b(int i4, String str, String str2) {
            this.f25181a = i4;
            this.f25182b = str;
            this.f25183c = str2;
        }

        public String toString() {
            return "result: " + this.f25181a + "\nsuccessMsg: " + this.f25182b + "\nerrorMsg: " + this.f25183c;
        }
    }

    private t0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static b a(String str, List<String> list, boolean z3) {
        String[] strArr;
        String[] strArr2 = {str};
        if (list == null) {
            strArr = null;
        } else {
            strArr = (String[]) list.toArray(new String[0]);
        }
        return k(strArr2, strArr, z3, true);
    }

    public static b b(String str, List<String> list, boolean z3, boolean z4) {
        String[] strArr;
        String[] strArr2 = {str};
        if (list == null) {
            strArr = null;
        } else {
            strArr = (String[]) list.toArray(new String[0]);
        }
        return k(strArr2, strArr, z3, z4);
    }

    public static b c(String str, boolean z3) {
        return j(new String[]{str}, z3, true);
    }

    public static b d(String str, boolean z3, boolean z4) {
        return j(new String[]{str}, z3, z4);
    }

    public static b e(String str, String[] strArr, boolean z3, boolean z4) {
        return k(new String[]{str}, strArr, z3, z4);
    }

    public static b f(List<String> list, List<String> list2, boolean z3) {
        String[] strArr;
        String[] strArr2 = null;
        if (list == null) {
            strArr = null;
        } else {
            strArr = (String[]) list.toArray(new String[0]);
        }
        if (list2 != null) {
            strArr2 = (String[]) list2.toArray(new String[0]);
        }
        return k(strArr, strArr2, z3, true);
    }

    public static b g(List<String> list, boolean z3) {
        String[] strArr;
        if (list == null) {
            strArr = null;
        } else {
            strArr = (String[]) list.toArray(new String[0]);
        }
        return j(strArr, z3, true);
    }

    public static b h(List<String> list, boolean z3, boolean z4) {
        String[] strArr;
        if (list == null) {
            strArr = null;
        } else {
            strArr = (String[]) list.toArray(new String[0]);
        }
        return j(strArr, z3, z4);
    }

    public static b i(String[] strArr, boolean z3) {
        return j(strArr, z3, true);
    }

    public static b j(String[] strArr, boolean z3, boolean z4) {
        return k(strArr, null, z3, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.blankj.utilcode.util.t0.b k(java.lang.String[] r8, java.lang.String[] r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.t0.k(java.lang.String[], java.lang.String[], boolean, boolean):com.blankj.utilcode.util.t0$b");
    }

    public static E0.f<b> l(String str, boolean z3, E0.b<b> bVar) {
        return q(new String[]{str}, z3, true, bVar);
    }

    public static E0.f<b> m(String str, boolean z3, boolean z4, E0.b<b> bVar) {
        return q(new String[]{str}, z3, z4, bVar);
    }

    public static E0.f<b> n(List<String> list, boolean z3, E0.b<b> bVar) {
        String[] strArr;
        if (list == null) {
            strArr = null;
        } else {
            strArr = (String[]) list.toArray(new String[0]);
        }
        return q(strArr, z3, true, bVar);
    }

    public static E0.f<b> o(List<String> list, boolean z3, boolean z4, E0.b<b> bVar) {
        String[] strArr;
        if (list == null) {
            strArr = null;
        } else {
            strArr = (String[]) list.toArray(new String[0]);
        }
        return q(strArr, z3, z4, bVar);
    }

    public static E0.f<b> p(String[] strArr, boolean z3, E0.b<b> bVar) {
        return q(strArr, z3, true, bVar);
    }

    public static E0.f<b> q(String[] strArr, boolean z3, boolean z4, @androidx.annotation.N E0.b<b> bVar) {
        return H0.v(new a(bVar, strArr, z3, z4));
    }
}
