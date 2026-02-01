package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.B;
import androidx.annotation.InterfaceC0561d;
import androidx.annotation.i0;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC0561d
/* loaded from: classes2.dex */
public class o {

    /* renamed from: c, reason: collision with root package name */
    @B("ConfigStorageClient.class")
    private static final Map<String, o> f37490c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final String f37491d = "UTF-8";

    /* renamed from: a, reason: collision with root package name */
    private final Context f37492a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37493b;

    private o(Context context, String str) {
        this.f37492a = context;
        this.f37493b = str;
    }

    @i0
    public static synchronized void b() {
        synchronized (o.class) {
            f37490c.clear();
        }
    }

    public static synchronized o d(Context context, String str) {
        o oVar;
        synchronized (o.class) {
            try {
                Map<String, o> map = f37490c;
                if (!map.containsKey(str)) {
                    map.put(str, new o(context, str));
                }
                oVar = map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    public synchronized Void a() {
        this.f37492a.deleteFile(this.f37493b);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.f37493b;
    }

    @Nullable
    public synchronized f e() throws IOException {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = this.f37492a.openFileInput(this.f37493b);
        } catch (FileNotFoundException | JSONException unused) {
            fileInputStream = null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
        }
        try {
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            fileInputStream.read(bArr, 0, available);
            f b4 = f.b(new JSONObject(new String(bArr, "UTF-8")));
            fileInputStream.close();
            return b4;
        } catch (FileNotFoundException | JSONException unused2) {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public synchronized Void f(f fVar) throws IOException {
        FileOutputStream openFileOutput = this.f37492a.openFileOutput(this.f37493b, 0);
        try {
            openFileOutput.write(fVar.toString().getBytes("UTF-8"));
        } finally {
            openFileOutput.close();
        }
        return null;
    }
}
