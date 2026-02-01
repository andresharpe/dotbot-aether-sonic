package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.crashlytics.internal.common.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1807o {

    /* renamed from: a, reason: collision with root package name */
    private final String f35166a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.h f35167b;

    public C1807o(String str, com.google.firebase.crashlytics.internal.persistence.h hVar) {
        this.f35166a = str;
        this.f35167b = hVar;
    }

    private File b() {
        return new File(this.f35167b.b(), this.f35166a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.f.f().e("Error creating marker: " + this.f35166a, e4);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
