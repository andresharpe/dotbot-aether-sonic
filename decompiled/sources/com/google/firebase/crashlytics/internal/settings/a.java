package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.C1799g;
import com.google.firebase.crashlytics.internal.persistence.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f35651b = "com.crashlytics.settings.json";

    /* renamed from: a, reason: collision with root package name */
    private final Context f35652a;

    public a(Context context) {
        this.f35652a = context;
    }

    private File a() {
        return new File(new i(this.f35652a).b(), f35651b);
    }

    public JSONObject b() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        com.google.firebase.crashlytics.internal.f.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File a4 = a();
                if (a4.exists()) {
                    fileInputStream = new FileInputStream(a4);
                    try {
                        jSONObject = new JSONObject(C1799g.G(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e4) {
                        e = e4;
                        com.google.firebase.crashlytics.internal.f.f().e("Failed to fetch cached settings", e);
                        C1799g.e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    com.google.firebase.crashlytics.internal.f.f().k("Settings file does not exist.");
                    jSONObject = null;
                }
                C1799g.e(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                C1799g.e(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            C1799g.e(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j4, JSONObject jSONObject) {
        FileWriter fileWriter;
        com.google.firebase.crashlytics.internal.f.f().k("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j4);
                    fileWriter = new FileWriter(a());
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e4) {
                e = e4;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                C1799g.e(fileWriter, "Failed to close settings writer.");
            } catch (Exception e5) {
                e = e5;
                fileWriter2 = fileWriter;
                com.google.firebase.crashlytics.internal.f.f().e("Failed to cache settings", e);
                C1799g.e(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                C1799g.e(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}
