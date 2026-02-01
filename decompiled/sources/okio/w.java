package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    static final long f55418a = 65536;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    static v f55419b;

    /* renamed from: c, reason: collision with root package name */
    static long f55420c;

    private w() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(v vVar) {
        if (vVar.f55416f == null && vVar.f55417g == null) {
            if (vVar.f55414d) {
                return;
            }
            synchronized (w.class) {
                try {
                    long j4 = f55420c;
                    if (j4 + PlaybackStateCompat.f4289d0 > 65536) {
                        return;
                    }
                    f55420c = j4 + PlaybackStateCompat.f4289d0;
                    vVar.f55416f = f55419b;
                    vVar.f55413c = 0;
                    vVar.f55412b = 0;
                    f55419b = vVar;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v b() {
        synchronized (w.class) {
            try {
                v vVar = f55419b;
                if (vVar != null) {
                    f55419b = vVar.f55416f;
                    vVar.f55416f = null;
                    f55420c -= PlaybackStateCompat.f4289d0;
                    return vVar;
                }
                return new v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
