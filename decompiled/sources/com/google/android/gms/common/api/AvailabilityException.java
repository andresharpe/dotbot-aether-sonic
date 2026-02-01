package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.N;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.internal.C1175c;
import com.google.android.gms.common.internal.C1285y;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AvailabilityException extends Exception {

    /* renamed from: E, reason: collision with root package name */
    private final androidx.collection.a<C1175c<?>, C1231c> f28019E;

    public AvailabilityException(@N androidx.collection.a<C1175c<?>, C1231c> aVar) {
        this.f28019E = aVar;
    }

    @N
    public C1231c a(@N h<? extends C1164a.d> hVar) {
        boolean z3;
        C1175c<? extends C1164a.d> b4 = hVar.b();
        if (this.f28019E.get(b4) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        String b5 = b4.b();
        StringBuilder sb = new StringBuilder(String.valueOf(b5).length() + 58);
        sb.append("The given API (");
        sb.append(b5);
        sb.append(") was not part of the availability request.");
        C1285y.b(z3, sb.toString());
        return (C1231c) C1285y.l(this.f28019E.get(b4));
    }

    @N
    public C1231c b(@N j<? extends C1164a.d> jVar) {
        boolean z3;
        C1175c<? extends C1164a.d> b4 = jVar.b();
        if (this.f28019E.get(b4) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        String b5 = b4.b();
        StringBuilder sb = new StringBuilder(String.valueOf(b5).length() + 58);
        sb.append("The given API (");
        sb.append(b5);
        sb.append(") was not part of the availability request.");
        C1285y.b(z3, sb.toString());
        return (C1231c) C1285y.l(this.f28019E.get(b4));
    }

    @Override // java.lang.Throwable
    @N
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z3 = true;
        for (C1175c<?> c1175c : this.f28019E.keySet()) {
            C1231c c1231c = (C1231c) C1285y.l(this.f28019E.get(c1175c));
            z3 &= !c1231c.x0();
            String b4 = c1175c.b();
            String valueOf = String.valueOf(c1231c);
            StringBuilder sb = new StringBuilder(String.valueOf(b4).length() + 2 + valueOf.length());
            sb.append(b4);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z3) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
