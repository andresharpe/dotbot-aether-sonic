package com.google.firebase.platforminfo;

import com.google.firebase.components.C1792f;
import com.google.firebase.components.j;
import com.google.firebase.components.u;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f37349a;

    /* renamed from: b, reason: collision with root package name */
    private final d f37350b;

    c(Set<f> set, d dVar) {
        this.f37349a = e(set);
        this.f37350b = dVar;
    }

    public static C1792f<i> c() {
        return C1792f.d(i.class).b(u.l(f.class)).f(new j() { // from class: com.google.firebase.platforminfo.b
            @Override // com.google.firebase.components.j
            public final Object a(com.google.firebase.components.g gVar) {
                i d4;
                d4 = c.d(gVar);
                return d4;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(com.google.firebase.components.g gVar) {
        return new c(gVar.e(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.google.firebase.platforminfo.i
    public String a() {
        if (this.f37350b.b().isEmpty()) {
            return this.f37349a;
        }
        return this.f37349a + ' ' + e(this.f37350b.b());
    }
}
