package androidx.core.content;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.core.app.unusedapprestrictions.b;

/* loaded from: classes.dex */
public abstract class O extends Service {

    /* renamed from: F, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f12172F = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";

    /* renamed from: E, reason: collision with root package name */
    private b.AbstractBinderC0080b f12173E = new a();

    /* loaded from: classes.dex */
    class a extends b.AbstractBinderC0080b {
        a() {
        }

        @Override // androidx.core.app.unusedapprestrictions.b
        public void u0(@androidx.annotation.P androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException {
            if (aVar == null) {
                return;
            }
            O.this.a(new N(aVar));
        }
    }

    protected abstract void a(@androidx.annotation.N N n4);

    @Override // android.app.Service
    @androidx.annotation.P
    public IBinder onBind(@androidx.annotation.P Intent intent) {
        return this.f12173E;
    }
}
