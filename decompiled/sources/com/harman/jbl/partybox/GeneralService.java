package com.harman.jbl.partybox;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/harman/jbl/partybox/GeneralService;", "Landroid/app/Service;", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "Lkotlin/H0;", "onDestroy", "()V", "rootIntent", "onTaskRemoved", "(Landroid/content/Intent;)V", "<init>", androidx.exifinterface.media.a.U4, "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class GeneralService extends Service {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    public static final a f38286E = new a(null);

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private static final String f38287F = "GeneralService";

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    @Override // android.app.Service
    @l3.e
    public IBinder onBind(@l3.d Intent intent) {
        F.p(intent, "intent");
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        T1.a.a("GeneralService onDestroy method called");
    }

    @Override // android.app.Service
    public int onStartCommand(@l3.e Intent intent, int i4, int i5) {
        T1.a.a("GeneralService onStartCommand method called");
        return super.onStartCommand(intent, i4, i5);
    }

    @Override // android.app.Service
    public void onTaskRemoved(@l3.e Intent intent) {
        super.onTaskRemoved(intent);
        T1.a.a("GeneralService onTaskRemoved method called");
        stopSelf();
    }
}
