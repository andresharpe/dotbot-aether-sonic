package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.a;

/* loaded from: classes.dex */
public abstract class c1 extends Service {

    /* loaded from: classes.dex */
    private class a extends a.b {
        a() {
        }

        @Override // android.support.v4.app.a
        public void E1(String str, int i4, String str2, Notification notification) throws RemoteException {
            c1.this.c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                c1.this.d(str, i4, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.a
        public void f1(String str, int i4, String str2) throws RemoteException {
            c1.this.c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                c1.this.a(str, i4, str2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.a
        public void s0(String str) {
            c1.this.c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                c1.this.b(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public abstract void a(String str, int i4, String str2);

    public abstract void b(String str);

    void c(int i4, String str) {
        for (String str2 : getPackageManager().getPackagesForUid(i4)) {
            if (str2.equals(str)) {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i4 + " is not authorized for package " + str);
    }

    public abstract void d(String str, int i4, String str2, Notification notification);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getAction().equals(p1.f12036g);
        return null;
    }
}
