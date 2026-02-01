package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import x0.InterfaceC2435a;

@x0.h
/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1136f {
    /* JADX INFO: Access modifiers changed from: package-private */
    @O2.b("SQLITE_DB_NAME")
    @x0.i
    public static String b() {
        return "com.google.android.datatransport.events";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @O2.b("PACKAGE_NAME")
    @x0.i
    public static String d(Context context) {
        return context.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @O2.b("SCHEMA_VERSION")
    @x0.i
    public static int e() {
        return V.f27640W;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @x0.i
    public static AbstractC1135e f() {
        return AbstractC1135e.f27670f;
    }

    @InterfaceC2435a
    abstract InterfaceC1133c a(N n4);

    @InterfaceC2435a
    abstract InterfaceC1134d c(N n4);

    @InterfaceC2435a
    abstract B0.a g(N n4);
}
