package com.google.firebase.installations.local;

import androidx.annotation.N;
import com.google.firebase.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PersistedInstallation {

    /* renamed from: c, reason: collision with root package name */
    private static final String f36034c = "PersistedInstallation";

    /* renamed from: d, reason: collision with root package name */
    private static final String f36035d = "Fid";

    /* renamed from: e, reason: collision with root package name */
    private static final String f36036e = "AuthToken";

    /* renamed from: f, reason: collision with root package name */
    private static final String f36037f = "RefreshToken";

    /* renamed from: g, reason: collision with root package name */
    private static final String f36038g = "TokenCreationEpochInSecs";

    /* renamed from: h, reason: collision with root package name */
    private static final String f36039h = "ExpiresInSecs";

    /* renamed from: i, reason: collision with root package name */
    private static final String f36040i = "Status";

    /* renamed from: j, reason: collision with root package name */
    private static final String f36041j = "FisError";

    /* renamed from: a, reason: collision with root package name */
    private File f36042a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final e f36043b;

    /* loaded from: classes2.dex */
    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(@N e eVar) {
        this.f36043b = eVar;
    }

    private File b() {
        if (this.f36042a == null) {
            synchronized (this) {
                try {
                    if (this.f36042a == null) {
                        this.f36042a = new File(this.f36043b.n().getFilesDir(), "PersistedInstallation." + this.f36043b.t() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.f36042a;
    }

    private JSONObject d() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(b());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public void a() {
        b().delete();
    }

    @N
    public c c(@N c cVar) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f36035d, cVar.d());
            jSONObject.put(f36040i, cVar.g().ordinal());
            jSONObject.put(f36036e, cVar.b());
            jSONObject.put(f36037f, cVar.f());
            jSONObject.put(f36038g, cVar.h());
            jSONObject.put(f36039h, cVar.c());
            jSONObject.put(f36041j, cVar.e());
            createTempFile = File.createTempFile(f36034c, "tmp", this.f36043b.n().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (!createTempFile.renameTo(b())) {
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        }
        return cVar;
    }

    @N
    public c e() {
        JSONObject d4 = d();
        String optString = d4.optString(f36035d, null);
        int optInt = d4.optInt(f36040i, RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String optString2 = d4.optString(f36036e, null);
        String optString3 = d4.optString(f36037f, null);
        long optLong = d4.optLong(f36038g, 0L);
        long optLong2 = d4.optLong(f36039h, 0L);
        return c.a().d(optString).g(RegistrationStatus.values()[optInt]).b(optString2).f(optString3).h(optLong).c(optLong2).e(d4.optString(f36041j, null)).a();
    }
}
