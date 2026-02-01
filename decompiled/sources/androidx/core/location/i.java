package androidx.core.location;

import android.location.LocationManager;
import androidx.core.location.j;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationManager f12633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j.i f12634b;

    public /* synthetic */ i(LocationManager locationManager, j.i iVar) {
        this.f12633a = locationManager;
        this.f12634b = iVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean i4;
        i4 = j.i(this.f12633a, this.f12634b);
        return i4;
    }
}
