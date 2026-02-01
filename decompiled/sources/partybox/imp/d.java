package partybox.imp;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.harman.log.f;
import jar.model.RequestPayload;
import jar.model_new.RequestPayloadNew;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    private static final String f55904e = "d";

    /* renamed from: f, reason: collision with root package name */
    private static volatile d f55905f = null;

    /* renamed from: g, reason: collision with root package name */
    private static final String f55906g = "aws_analytics_temp_info.txt";

    /* renamed from: h, reason: collision with root package name */
    private static final String f55907h = "/AWS_Connect_Analytics/";

    /* renamed from: a, reason: collision with root package name */
    private String f55908a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f55909b;

    /* renamed from: c, reason: collision with root package name */
    private Context f55910c;

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, RequestPayload> f55911d;

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d d() {
        if (f55905f == null) {
            synchronized (d.class) {
                try {
                    if (f55905f == null) {
                        f55905f = new d();
                    }
                } finally {
                }
            }
        }
        return f55905f;
    }

    private static String e(Context context) {
        File file;
        File[] externalFilesDirs = context.getExternalFilesDirs(null);
        if (externalFilesDirs != null && externalFilesDirs.length > 0 && (file = externalFilesDirs[0]) != null && file.exists()) {
            return externalFilesDirs[0].getAbsolutePath();
        }
        return "";
    }

    private boolean g(String str) {
        if (str != null && !str.isEmpty()) {
            return new File(str).exists();
        }
        return false;
    }

    private void h() {
        if (!this.f55909b) {
            f.b(f55904e, "loadData not init");
            return;
        }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(this.f55908a));
            this.f55911d = (ConcurrentHashMap) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e4) {
            String str = f55904e;
            f.c(str, "Exception:", e4);
            f.b(str, "loadData failed");
        }
    }

    private void i() {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.f55908a));
            objectOutputStream.writeObject(this.f55911d);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Exception e4) {
            String str = f55904e;
            f.c(str, "Exception:", e4);
            f.b(str, "saveData failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(String str) {
        if (!this.f55909b) {
            f.b(f55904e, "deleteCurRequestPayload not init");
            return;
        }
        String str2 = f55904e;
        f.a(str2, "deleteCurrentData currentAddress: " + str);
        h();
        this.f55911d.remove(str);
        i();
        f.a(str2, "deleteCurrentData success");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConcurrentHashMap<String, RequestPayload> b() {
        if (!this.f55909b) {
            f.b(f55904e, "getCurRequestPayload not init");
            return null;
        }
        h();
        return this.f55911d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RequestPayload c(String str) {
        if (!this.f55909b) {
            f.b(f55904e, "getCurRequestPayload not init");
            return null;
        }
        h();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        RequestPayload requestPayload = this.f55911d.get(str);
        if (requestPayload != null) {
            return requestPayload;
        }
        f.b(f55904e, "getCurRequestPayload failed, requestPayload is null, currentAddress: " + str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6 A[Catch: all -> 0x006a, Exception -> 0x006d, TryCatch #2 {Exception -> 0x006d, blocks: (B:5:0x0046, B:7:0x0051, B:8:0x0070, B:22:0x00a2, B:30:0x00ce, B:32:0x00d6, B:34:0x00e3, B:36:0x00e9, B:37:0x0103, B:38:0x0131, B:40:0x0135, B:42:0x013c, B:49:0x012e), top: B:4:0x0046, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0135 A[Catch: all -> 0x006a, Exception -> 0x006d, TryCatch #2 {Exception -> 0x006d, blocks: (B:5:0x0046, B:7:0x0051, B:8:0x0070, B:22:0x00a2, B:30:0x00ce, B:32:0x00d6, B:34:0x00e3, B:36:0x00e9, B:37:0x0103, B:38:0x0131, B:40:0x0135, B:42:0x013c, B:49:0x012e), top: B:4:0x0046, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e A[Catch: all -> 0x006a, Exception -> 0x006d, TryCatch #2 {Exception -> 0x006d, blocks: (B:5:0x0046, B:7:0x0051, B:8:0x0070, B:22:0x00a2, B:30:0x00ce, B:32:0x00d6, B:34:0x00e3, B:36:0x00e9, B:37:0x0103, B:38:0x0131, B:40:0x0135, B:42:0x013c, B:49:0x012e), top: B:4:0x0046, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void f(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: partybox.imp.d.f(android.content.Context):void");
    }

    public void j(String str, RequestPayload requestPayload) {
        String str2 = f55904e;
        f.b(str2, "enter saveLog");
        if (requestPayload != null && requestPayload.a() != null) {
            String str3 = (e(this.f55910c) + f55907h) + (str + "_" + com.harman.log.c.n(System.currentTimeMillis()) + ".txt");
            f.b(str2, "enter saveLog fullPath = " + str3);
            try {
                FileWriter fileWriter = new FileWriter(str3);
                fileWriter.write(new GsonBuilder().setPrettyPrinting().create().toJson(requestPayload.a()));
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e4) {
                f.b(f55904e, "saveLog Exception: " + e4.getLocalizedMessage());
            }
        }
    }

    public void k(String str, RequestPayloadNew requestPayloadNew) {
        String str2 = f55904e;
        f.b(str2, "enter saveLog");
        if (requestPayloadNew != null && requestPayloadNew.a() != null) {
            String str3 = (e(this.f55910c) + f55907h) + (str + "_" + com.harman.log.c.n(System.currentTimeMillis()) + "_new.txt");
            f.b(str2, "enter saveLog fullPath = " + str3);
            try {
                FileWriter fileWriter = new FileWriter(str3);
                fileWriter.write(new GsonBuilder().setPrettyPrinting().create().toJson(requestPayloadNew.a()));
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e4) {
                f.b(f55904e, "saveLog Exception: " + e4.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void l(String str, RequestPayload requestPayload) {
        if (!this.f55909b) {
            f.b(f55904e, "updateCurRequestPayload not init");
        } else {
            if (requestPayload == null) {
                f.b(f55904e, "updateCurRequestPayload requestPayload is null");
                return;
            }
            h();
            this.f55911d.put(str, requestPayload);
            i();
        }
    }
}
