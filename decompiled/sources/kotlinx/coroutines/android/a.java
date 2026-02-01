package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.W0;
import kotlinx.coroutines.internal.B;
import kotlinx.coroutines.internal.D;

/* loaded from: classes2.dex */
public final class a implements D {
    @Override // kotlinx.coroutines.internal.D
    @l3.d
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.D
    @l3.d
    public W0 b(@l3.d List<? extends D> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(g.d(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.internal.D
    public int c() {
        return B.f54409j;
    }
}
