package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzbax;
import com.google.android.gms.internal.gtm.zzbay;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzbay<MessageType extends zzbay<MessageType, BuilderType>, BuilderType extends zzbax<MessageType, BuilderType>> implements zzbgs {
    protected int zzc = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public static void zzS(Iterable iterable, List list) {
        zzbfq.zze(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        break;
                    } else {
                        list.remove(size2);
                    }
                }
                throw new NullPointerException(str);
            }
            list.add(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzQ() {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zzbgs
    public final zzbbw zzR() {
        try {
            int zzY = zzY();
            zzbbw zzbbwVar = zzbbw.zzb;
            byte[] bArr = new byte[zzY];
            zzbcj zzL = zzbcj.zzL(bArr);
            zzau(zzL);
            if (zzL.zzb() == 0) {
                return new zzbbt(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e4) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzT(int i4) {
        throw null;
    }

    public final void zzU(OutputStream outputStream) throws IOException {
        zzbcj zzM = zzbcj.zzM(outputStream, zzbcj.zzG(zzY()));
        zzau(zzM);
        zzM.zzR();
    }
}
