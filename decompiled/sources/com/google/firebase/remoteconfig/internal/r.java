package com.google.firebase.remoteconfig.internal;

import androidx.constraintlayout.core.motion.utils.v;

/* loaded from: classes2.dex */
public class r implements com.google.firebase.remoteconfig.o {

    /* renamed from: c, reason: collision with root package name */
    private static final String f37503c = "[Value: %s] cannot be converted to a %s.";

    /* renamed from: a, reason: collision with root package name */
    private final String f37504a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37505b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(String str, int i4) {
        this.f37504a = str;
        this.f37505b = i4;
    }

    private String g() {
        return e().trim();
    }

    private void h() {
        if (this.f37504a != null) {
        } else {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // com.google.firebase.remoteconfig.o
    public long a() {
        if (this.f37505b == 0) {
            return 0L;
        }
        String g4 = g();
        try {
            return Long.valueOf(g4).longValue();
        } catch (NumberFormatException e4) {
            throw new IllegalArgumentException(String.format(f37503c, g4, "long"), e4);
        }
    }

    @Override // com.google.firebase.remoteconfig.o
    public byte[] b() {
        if (this.f37505b == 0) {
            return com.google.firebase.remoteconfig.l.f37526p;
        }
        return this.f37504a.getBytes(m.f37466e);
    }

    @Override // com.google.firebase.remoteconfig.o
    public int c() {
        return this.f37505b;
    }

    @Override // com.google.firebase.remoteconfig.o
    public double d() {
        if (this.f37505b == 0) {
            return com.google.firebase.remoteconfig.l.f37524n;
        }
        String g4 = g();
        try {
            return Double.valueOf(g4).doubleValue();
        } catch (NumberFormatException e4) {
            throw new IllegalArgumentException(String.format(f37503c, g4, "double"), e4);
        }
    }

    @Override // com.google.firebase.remoteconfig.o
    public String e() {
        if (this.f37505b == 0) {
            return "";
        }
        h();
        return this.f37504a;
    }

    @Override // com.google.firebase.remoteconfig.o
    public boolean f() throws IllegalArgumentException {
        if (this.f37505b == 0) {
            return false;
        }
        String g4 = g();
        if (m.f37467f.matcher(g4).matches()) {
            return true;
        }
        if (m.f37468g.matcher(g4).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format(f37503c, g4, v.b.f7404f));
    }
}
