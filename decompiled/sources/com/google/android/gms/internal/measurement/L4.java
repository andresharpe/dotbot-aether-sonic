package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class L4 {

    /* renamed from: a, reason: collision with root package name */
    private static final K4 f29382a;

    /* renamed from: b, reason: collision with root package name */
    private static final K4 f29383b;

    static {
        K4 k4;
        try {
            k4 = (K4) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            k4 = null;
        }
        f29382a = k4;
        f29383b = new K4();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static K4 a() {
        return f29382a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static K4 b() {
        return f29383b;
    }
}
