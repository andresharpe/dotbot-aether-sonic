package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.media.q;
import androidx.media.r;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    static final String f16070b = "MediaSessionManager";

    /* renamed from: c, reason: collision with root package name */
    static final boolean f16071c = Log.isLoggable(f16070b, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final Object f16072d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static volatile i f16073e;

    /* renamed from: a, reason: collision with root package name */
    a f16074a;

    /* loaded from: classes.dex */
    interface a {
        boolean a(c cVar);

        Context e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        int a();

        int b();

        String g();
    }

    private i(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f16074a = new q(context);
        } else {
            this.f16074a = new j(context);
        }
    }

    @N
    public static i b(@N Context context) {
        i iVar = f16073e;
        if (iVar == null) {
            synchronized (f16072d) {
                try {
                    iVar = f16073e;
                    if (iVar == null) {
                        f16073e = new i(context.getApplicationContext());
                        iVar = f16073e;
                    }
                } finally {
                }
            }
        }
        return iVar;
    }

    Context a() {
        return this.f16074a.e();
    }

    public boolean c(@N b bVar) {
        if (bVar != null) {
            return this.f16074a.a(bVar.f16076a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final String f16075b = "android.media.session.MediaController";

        /* renamed from: a, reason: collision with root package name */
        c f16076a;

        public b(@N String str, int i4, int i5) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f16076a = new q.a(str, i4, i5);
            } else {
                this.f16076a = new r.a(str, i4, i5);
            }
        }

        @N
        public String a() {
            return this.f16076a.g();
        }

        public int b() {
            return this.f16076a.b();
        }

        public int c() {
            return this.f16076a.a();
        }

        public boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.f16076a.equals(((b) obj).f16076a);
        }

        public int hashCode() {
            return this.f16076a.hashCode();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @W(28)
        public b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f16076a = new q.a(remoteUserInfo);
        }
    }
}
