package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.annotation.j0;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import k1.InterfaceFutureC2077a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17382a = "/data/misc/profiles/ref/";

    /* renamed from: b, reason: collision with root package name */
    private static final String f17383b = "/data/misc/profiles/cur/0/";

    /* renamed from: c, reason: collision with root package name */
    private static final String f17384c = "primary.prof";

    /* renamed from: d, reason: collision with root package name */
    private static final String f17385d = "profileInstalled";

    /* renamed from: g, reason: collision with root package name */
    private static final String f17388g = "ProfileVerifier";

    /* renamed from: e, reason: collision with root package name */
    private static final androidx.concurrent.futures.d<c> f17386e = androidx.concurrent.futures.d.v();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f17387f = new Object();

    /* renamed from: h, reason: collision with root package name */
    @P
    private static c f17389h = null;

    /* JADX INFO: Access modifiers changed from: private */
    @W(33)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: e, reason: collision with root package name */
        private static final int f17390e = 1;

        /* renamed from: a, reason: collision with root package name */
        final int f17391a;

        /* renamed from: b, reason: collision with root package name */
        final int f17392b;

        /* renamed from: c, reason: collision with root package name */
        final long f17393c;

        /* renamed from: d, reason: collision with root package name */
        final long f17394d;

        b(int i4, int i5, long j4, long j5) {
            this.f17391a = i4;
            this.f17392b = i5;
            this.f17393c = j4;
            this.f17394d = j5;
        }

        static b a(@N File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        void b(@N File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f17391a);
                dataOutputStream.writeInt(this.f17392b);
                dataOutputStream.writeLong(this.f17393c);
                dataOutputStream.writeLong(this.f17394d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f17392b == bVar.f17392b && this.f17393c == bVar.f17393c && this.f17391a == bVar.f17391a && this.f17394d == bVar.f17394d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f17392b), Long.valueOf(this.f17393c), Integer.valueOf(this.f17391a), Long.valueOf(this.f17394d));
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: d, reason: collision with root package name */
        private static final int f17395d = 16;

        /* renamed from: e, reason: collision with root package name */
        public static final int f17396e = 0;

        /* renamed from: f, reason: collision with root package name */
        public static final int f17397f = 1;

        /* renamed from: g, reason: collision with root package name */
        public static final int f17398g = 2;

        /* renamed from: h, reason: collision with root package name */
        public static final int f17399h = 3;

        /* renamed from: i, reason: collision with root package name */
        public static final int f17400i = 65536;

        /* renamed from: j, reason: collision with root package name */
        public static final int f17401j = 131072;

        /* renamed from: k, reason: collision with root package name */
        public static final int f17402k = 196608;

        /* renamed from: l, reason: collision with root package name */
        public static final int f17403l = 262144;

        /* renamed from: a, reason: collision with root package name */
        final int f17404a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f17405b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f17406c;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* loaded from: classes.dex */
        public @interface a {
        }

        c(int i4, boolean z3, boolean z4) {
            this.f17404a = i4;
            this.f17406c = z4;
            this.f17405b = z3;
        }

        public int a() {
            return this.f17404a;
        }

        public boolean b() {
            return this.f17406c;
        }

        public boolean c() {
            return this.f17405b;
        }
    }

    private p() {
    }

    @N
    public static InterfaceFutureC2077a<c> a() {
        return f17386e;
    }

    private static long b(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return a.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c c(int i4, boolean z3, boolean z4) {
        c cVar = new c(i4, z3, z4);
        f17389h = cVar;
        f17386e.q(cVar);
        return f17389h;
    }

    @j0
    @N
    public static c d(@N Context context) {
        return e(context, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(20:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
    
        r3 = androidx.profileinstaller.p.c.f17402k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a0, code lost:
    
        r3 = 1;
     */
    @androidx.annotation.j0
    @androidx.annotation.N
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.profileinstaller.p.c e(@androidx.annotation.N android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.p.e(android.content.Context, boolean):androidx.profileinstaller.p$c");
    }
}
