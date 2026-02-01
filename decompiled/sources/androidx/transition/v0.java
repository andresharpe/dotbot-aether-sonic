package androidx.transition;

import android.os.IBinder;

/* loaded from: classes.dex */
class v0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f20190a;

    v0(IBinder iBinder) {
        this.f20190a = iBinder;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof v0) && ((v0) obj).f20190a.equals(this.f20190a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f20190a.hashCode();
    }
}
