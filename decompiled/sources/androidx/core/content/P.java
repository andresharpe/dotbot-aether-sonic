package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.i0;
import androidx.core.app.unusedapprestrictions.a;
import androidx.core.app.unusedapprestrictions.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class P implements ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.N
    androidx.concurrent.futures.d<Integer> f12176d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f12177e;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.P
    @i0
    androidx.core.app.unusedapprestrictions.b f12175c = null;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12178f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends a.b {
        a() {
        }

        @Override // androidx.core.app.unusedapprestrictions.a
        public void v1(boolean z3, boolean z4) throws RemoteException {
            if (z3) {
                if (z4) {
                    P.this.f12176d.q(3);
                    return;
                } else {
                    P.this.f12176d.q(2);
                    return;
                }
            }
            P.this.f12176d.q(0);
            Log.e(J.f12164a, "Unable to retrieve the permission revocation setting from the backport");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public P(@androidx.annotation.N Context context) {
        this.f12177e = context;
    }

    private androidx.core.app.unusedapprestrictions.a c() {
        return new a();
    }

    public void a(@androidx.annotation.N androidx.concurrent.futures.d<Integer> dVar) {
        if (!this.f12178f) {
            this.f12178f = true;
            this.f12176d = dVar;
            this.f12177e.bindService(new Intent(O.f12172F).setPackage(J.b(this.f12177e.getPackageManager())), this, 1);
            return;
        }
        throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
    }

    public void b() {
        if (this.f12178f) {
            this.f12178f = false;
            this.f12177e.unbindService(this);
            return;
        }
        throw new IllegalStateException("bindService must be called before unbind");
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        androidx.core.app.unusedapprestrictions.b v3 = b.AbstractBinderC0080b.v(iBinder);
        this.f12175c = v3;
        try {
            v3.u0(c());
        } catch (RemoteException unused) {
            this.f12176d.q(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f12175c = null;
    }
}
