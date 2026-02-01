package org.hamcrest;

/* loaded from: classes2.dex */
public class l {
    public static <T> void a(T t3, k<? super T> kVar) {
        b("", t3, kVar);
    }

    public static <T> void b(String str, T t3, k<? super T> kVar) {
        if (kVar.c(t3)) {
            return;
        }
        n nVar = new n();
        nVar.d(str).d("\nExpected: ").b(kVar).d("\n     but: ");
        kVar.a(t3, nVar);
        throw new AssertionError(nVar.toString());
    }

    public static void c(String str, boolean z3) {
        if (z3) {
        } else {
            throw new AssertionError(str);
        }
    }
}
