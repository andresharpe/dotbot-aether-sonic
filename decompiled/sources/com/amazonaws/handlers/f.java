package com.amazonaws.handlers;

import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.x;

/* loaded from: classes.dex */
final class f extends e {

    /* renamed from: a, reason: collision with root package name */
    private final g f23608a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(g gVar) {
        if (gVar != null) {
            this.f23608a = gVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.amazonaws.handlers.e
    public void b(com.amazonaws.f<?> fVar, com.amazonaws.g<?> gVar, Exception exc) {
        this.f23608a.c(fVar, exc);
    }

    @Override // com.amazonaws.handlers.e
    public void c(com.amazonaws.f<?> fVar, com.amazonaws.g<?> gVar) {
        AWSRequestMetrics g4;
        Object a4;
        x xVar = null;
        if (fVar == null) {
            g4 = null;
        } else {
            g4 = fVar.g();
        }
        if (gVar == null) {
            a4 = null;
        } else {
            a4 = gVar.a();
        }
        if (g4 != null) {
            xVar = g4.g();
        }
        this.f23608a.b(fVar, a4, xVar);
    }

    @Override // com.amazonaws.handlers.e
    public void d(com.amazonaws.f<?> fVar) {
        this.f23608a.a(fVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f23608a.equals(((f) obj).f23608a);
    }

    public int hashCode() {
        return this.f23608a.hashCode();
    }
}
