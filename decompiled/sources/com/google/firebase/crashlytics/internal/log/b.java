package com.google.firebase.crashlytics.internal.log;

import android.content.Context;
import androidx.annotation.P;
import com.google.firebase.crashlytics.internal.common.C1799g;
import com.google.firebase.crashlytics.internal.f;
import java.io.File;
import java.util.Set;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    private static final String f35230d = "com.crashlytics.CollectCustomLogs";

    /* renamed from: e, reason: collision with root package name */
    private static final String f35231e = ".temp";

    /* renamed from: f, reason: collision with root package name */
    private static final String f35232f = "crashlytics-userlog-";

    /* renamed from: g, reason: collision with root package name */
    private static final c f35233g = new c();

    /* renamed from: h, reason: collision with root package name */
    static final int f35234h = 65536;

    /* renamed from: a, reason: collision with root package name */
    private final Context f35235a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0312b f35236b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.firebase.crashlytics.internal.log.a f35237c;

    /* renamed from: com.google.firebase.crashlytics.internal.log.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0312b {
        File a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class c implements com.google.firebase.crashlytics.internal.log.a {
        private c() {
        }

        @Override // com.google.firebase.crashlytics.internal.log.a
        public void a() {
        }

        @Override // com.google.firebase.crashlytics.internal.log.a
        public String b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.log.a
        public byte[] c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.log.a
        public void d() {
        }

        @Override // com.google.firebase.crashlytics.internal.log.a
        public void e(long j4, String str) {
        }
    }

    public b(Context context, InterfaceC0312b interfaceC0312b) {
        this(context, interfaceC0312b, null);
    }

    private String e(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(f35231e);
        if (lastIndexOf == -1) {
            return name;
        }
        return name.substring(20, lastIndexOf);
    }

    private File f(String str) {
        return new File(this.f35236b.a(), f35232f + str + f35231e);
    }

    public void a() {
        this.f35237c.d();
    }

    public void b(Set<String> set) {
        File[] listFiles = this.f35236b.a().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(e(file))) {
                    file.delete();
                }
            }
        }
    }

    public byte[] c() {
        return this.f35237c.c();
    }

    @P
    public String d() {
        return this.f35237c.b();
    }

    public final void g(String str) {
        this.f35237c.a();
        this.f35237c = f35233g;
        if (str == null) {
            return;
        }
        if (!C1799g.k(this.f35235a, f35230d, true)) {
            f.f().b("Preferences requested no custom logs. Aborting log file creation.");
        } else {
            h(f(str), 65536);
        }
    }

    void h(File file, int i4) {
        this.f35237c = new d(file, i4);
    }

    public void i(long j4, String str) {
        this.f35237c.e(j4, str);
    }

    public b(Context context, InterfaceC0312b interfaceC0312b, String str) {
        this.f35235a = context;
        this.f35236b = interfaceC0312b;
        this.f35237c = f35233g;
        g(str);
    }
}
