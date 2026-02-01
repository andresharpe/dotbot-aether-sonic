package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1510u3;
import com.google.android.gms.internal.measurement.AbstractC1518v3;

/* renamed from: com.google.android.gms.internal.measurement.u3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1510u3<MessageType extends AbstractC1518v3<MessageType, BuilderType>, BuilderType extends AbstractC1510u3<MessageType, BuilderType>> implements O4 {
    @Override // com.google.android.gms.internal.measurement.O4
    public final /* synthetic */ O4 c(byte[] bArr) throws zzko {
        return j(bArr, 0, bArr.length);
    }

    @Override // 
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC1510u3 clone();

    protected abstract AbstractC1510u3 i(AbstractC1518v3 abstractC1518v3);

    public AbstractC1510u3 j(byte[] bArr, int i4, int i5) throws zzko {
        throw null;
    }

    public AbstractC1510u3 k(byte[] bArr, int i4, int i5, X3 x3) throws zzko {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final /* synthetic */ O4 m(byte[] bArr, X3 x3) throws zzko {
        return k(bArr, 0, bArr.length, x3);
    }

    @Override // com.google.android.gms.internal.measurement.O4
    public final /* bridge */ /* synthetic */ O4 z(P4 p4) {
        if (b().getClass().isInstance(p4)) {
            return i((AbstractC1518v3) p4);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
