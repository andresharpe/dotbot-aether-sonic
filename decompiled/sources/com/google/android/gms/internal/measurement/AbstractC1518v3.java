package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1510u3;
import com.google.android.gms.internal.measurement.AbstractC1518v3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1518v3<MessageType extends AbstractC1518v3<MessageType, BuilderType>, BuilderType extends AbstractC1510u3<MessageType, BuilderType>> implements P4 {
    protected int zzb = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public static void i(Iterable iterable, List list) {
        C1503t4.e(iterable);
        if (iterable instanceof InterfaceC1535x4) {
            List zzh = ((InterfaceC1535x4) iterable).zzh();
            InterfaceC1535x4 interfaceC1535x4 = (InterfaceC1535x4) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC1535x4.size() - size) + " is null.";
                    int size2 = interfaceC1535x4.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            interfaceC1535x4.remove(size2);
                        }
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof zzjd) {
                    interfaceC1535x4.P((zzjd) obj);
                } else {
                    interfaceC1535x4.add((String) obj);
                }
            }
            return;
        }
        if (!(iterable instanceof W4)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 < size3) {
                            break;
                        } else {
                            list.remove(size4);
                        }
                    }
                    throw new NullPointerException(str2);
                }
                list.add(obj2);
            }
            return;
        }
        list.addAll((Collection) iterable);
    }

    @Override // com.google.android.gms.internal.measurement.P4
    public final zzjd a() {
        try {
            int f4 = f();
            zzjd zzjdVar = zzjd.f29849F;
            byte[] bArr = new byte[f4];
            S3 c4 = S3.c(bArr);
            g(c4);
            c4.d();
            return new J3(bArr);
        } catch (IOException e4) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(int i4) {
        throw null;
    }

    public final byte[] k() {
        try {
            byte[] bArr = new byte[f()];
            S3 c4 = S3.c(bArr);
            g(c4);
            c4.d();
            return bArr;
        } catch (IOException e4) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e4);
        }
    }
}
