package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.a4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1352a4 {

    /* renamed from: a, reason: collision with root package name */
    private static final Y3 f29586a = new Z3();

    /* renamed from: b, reason: collision with root package name */
    private static final Y3 f29587b;

    static {
        Y3 y3;
        try {
            y3 = (Y3) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            y3 = null;
        }
        f29587b = y3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Y3 a() {
        Y3 y3 = f29587b;
        if (y3 != null) {
            return y3;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Y3 b() {
        return f29586a;
    }
}
