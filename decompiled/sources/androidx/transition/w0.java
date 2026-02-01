package androidx.transition;

import android.view.View;
import android.view.WindowId;

@androidx.annotation.W(18)
/* loaded from: classes.dex */
class w0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private final WindowId f20194a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(@androidx.annotation.N View view) {
        this.f20194a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof w0) && ((w0) obj).f20194a.equals(this.f20194a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f20194a.hashCode();
    }
}
