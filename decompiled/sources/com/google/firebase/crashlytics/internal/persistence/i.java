package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* loaded from: classes2.dex */
public class i implements h {

    /* renamed from: b, reason: collision with root package name */
    public static final String f35640b = ".com.google.firebase.crashlytics";

    /* renamed from: a, reason: collision with root package name */
    private final Context f35641a;

    public i(Context context) {
        this.f35641a = context;
    }

    @Override // com.google.firebase.crashlytics.internal.persistence.h
    public String a() {
        return new File(this.f35641a.getFilesDir(), f35640b).getPath();
    }

    @Override // com.google.firebase.crashlytics.internal.persistence.h
    public File b() {
        return d(new File(this.f35641a.getFilesDir(), f35640b));
    }

    boolean c() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            com.google.firebase.crashlytics.internal.f.f().m("External Storage is not mounted and/or writable\nHave you declared android.permission.WRITE_EXTERNAL_STORAGE in the manifest?");
            return false;
        }
        return true;
    }

    File d(File file) {
        if (file != null) {
            if (!file.exists() && !file.mkdirs()) {
                com.google.firebase.crashlytics.internal.f.f().m("Couldn't create file");
                return null;
            }
            return file;
        }
        com.google.firebase.crashlytics.internal.f.f().m("Null File");
        return null;
    }
}
