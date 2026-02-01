package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.C0;
import com.google.android.gms.tasks.C1773n;
import com.google.firebase.messaging.C1820e;
import com.google.firebase.messaging.C1821f;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.messaging.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C1822g {

    /* renamed from: d, reason: collision with root package name */
    private static final int f37013d = 5;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f37014a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f37015b;

    /* renamed from: c, reason: collision with root package name */
    private final L f37016c;

    public C1822g(Context context, L l4, ExecutorService executorService) {
        this.f37014a = executorService;
        this.f37015b = context;
        this.f37016c = l4;
    }

    private boolean b() {
        if (((KeyguardManager) this.f37015b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!com.google.android.gms.common.util.v.j()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f37015b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                if (runningAppProcessInfo.importance != 100) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private void c(C1820e.a aVar) {
        if (Log.isLoggable(C1821f.f36920a, 3)) {
            Log.d(C1821f.f36920a, "Showing notification");
        }
        ((NotificationManager) this.f37015b.getSystemService("notification")).notify(aVar.f36911b, aVar.f36912c, aVar.f36910a.h());
    }

    @androidx.annotation.P
    private H d() {
        H d4 = H.d(this.f37016c.p(C1821f.c.f36951j));
        if (d4 != null) {
            d4.i(this.f37014a);
        }
        return d4;
    }

    private void e(C0.g gVar, @androidx.annotation.P H h4) {
        if (h4 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) C1773n.b(h4.f(), 5L, TimeUnit.SECONDS);
            gVar.c0(bitmap);
            gVar.z0(new C0.d().C(bitmap).B(null));
        } catch (InterruptedException unused) {
            Log.w(C1821f.f36920a, "Interrupted while downloading image, showing notification without it");
            h4.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e4) {
            Log.w(C1821f.f36920a, "Failed to download image: " + e4.getCause());
        } catch (TimeoutException unused2) {
            Log.w(C1821f.f36920a, "Failed to download image in time, showing notification without it");
            h4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (this.f37016c.a(C1821f.c.f36947f)) {
            return true;
        }
        if (b()) {
            return false;
        }
        H d4 = d();
        C1820e.a f4 = C1820e.f(this.f37015b, this.f37016c);
        e(f4.f36910a, d4);
        c(f4);
        return true;
    }
}
