package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.H;
import kotlinx.coroutines.flow.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class w extends y<Integer> implements H<Integer> {
    public w(int i4) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        j(Integer.valueOf(i4));
    }

    @Override // kotlinx.coroutines.flow.H
    @l3.d
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(S().intValue());
        }
        return valueOf;
    }

    public final boolean h0(int i4) {
        boolean j4;
        synchronized (this) {
            j4 = j(Integer.valueOf(S().intValue() + i4));
        }
        return j4;
    }
}
