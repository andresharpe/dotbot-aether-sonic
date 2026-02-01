package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.U6;
import java.util.List;

/* loaded from: classes2.dex */
final class U1 implements U6 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ W1 f30425a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U1(W1 w12) {
        this.f30425a = w12;
    }

    @Override // com.google.android.gms.internal.measurement.U6
    public final void a(int i4, String str, List list, boolean z3, boolean z4) {
        C1708r1 o4;
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        o4 = this.f30425a.f31060a.b().s();
                    } else if (z3) {
                        o4 = this.f30425a.f31060a.b().w();
                    } else if (!z4) {
                        o4 = this.f30425a.f31060a.b().v();
                    } else {
                        o4 = this.f30425a.f31060a.b().u();
                    }
                } else {
                    o4 = this.f30425a.f31060a.b().t();
                }
            } else if (z3) {
                o4 = this.f30425a.f31060a.b().r();
            } else if (!z4) {
                o4 = this.f30425a.f31060a.b().q();
            } else {
                o4 = this.f30425a.f31060a.b().p();
            }
        } else {
            o4 = this.f30425a.f31060a.b().o();
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    o4.a(str);
                    return;
                } else {
                    o4.d(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            o4.c(str, list.get(0), list.get(1));
            return;
        }
        o4.b(str, list.get(0));
    }
}
