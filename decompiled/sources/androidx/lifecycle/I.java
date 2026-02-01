package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.InterfaceC0566i;
import kotlin.InterfaceC2205l;

/* loaded from: classes.dex */
public class I extends Service implements E {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final g0 f15426E = new g0(this);

    @Override // androidx.lifecycle.E
    @l3.d
    public Lifecycle getLifecycle() {
        return this.f15426E.a();
    }

    @Override // android.app.Service
    @l3.e
    @InterfaceC0566i
    public IBinder onBind(@l3.d Intent intent) {
        kotlin.jvm.internal.F.p(intent, "intent");
        this.f15426E.b();
        return null;
    }

    @Override // android.app.Service
    @InterfaceC0566i
    public void onCreate() {
        this.f15426E.c();
        super.onCreate();
    }

    @Override // android.app.Service
    @InterfaceC0566i
    public void onDestroy() {
        this.f15426E.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    @InterfaceC0566i
    @InterfaceC2205l(message = "Deprecated in Java")
    public void onStart(@l3.e Intent intent, int i4) {
        this.f15426E.e();
        super.onStart(intent, i4);
    }

    @Override // android.app.Service
    @InterfaceC0566i
    public int onStartCommand(@l3.e Intent intent, int i4, int i5) {
        return super.onStartCommand(intent, i4, i5);
    }
}
