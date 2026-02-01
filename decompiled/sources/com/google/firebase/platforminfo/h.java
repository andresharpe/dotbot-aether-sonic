package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.C1792f;
import com.google.firebase.components.j;
import com.google.firebase.components.u;

/* loaded from: classes2.dex */
public class h {

    /* loaded from: classes2.dex */
    public interface a<T> {
        String a(T t3);
    }

    private h() {
    }

    public static C1792f<?> b(String str, String str2) {
        return C1792f.k(f.a(str, str2), f.class);
    }

    public static C1792f<?> c(final String str, final a<Context> aVar) {
        return C1792f.l(f.class).b(u.j(Context.class)).f(new j() { // from class: com.google.firebase.platforminfo.g
            @Override // com.google.firebase.components.j
            public final Object a(com.google.firebase.components.g gVar) {
                f d4;
                d4 = h.d(str, aVar, gVar);
                return d4;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, com.google.firebase.components.g gVar) {
        return f.a(str, aVar.a((Context) gVar.a(Context.class)));
    }
}
