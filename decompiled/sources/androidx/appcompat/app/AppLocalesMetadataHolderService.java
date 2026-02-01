package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.W;

/* loaded from: classes.dex */
public final class AppLocalesMetadataHolderService extends Service {

    @W(24)
    /* loaded from: classes.dex */
    private static class a {
        private a() {
        }

        @InterfaceC0577u
        static int a() {
            return 512;
        }
    }

    @N
    public static ServiceInfo a(@N Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), a.a() | 128);
    }

    @Override // android.app.Service
    @N
    public IBinder onBind(@N Intent intent) {
        throw new UnsupportedOperationException();
    }
}
