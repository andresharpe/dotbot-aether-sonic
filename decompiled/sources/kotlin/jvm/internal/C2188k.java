package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.l0;

/* renamed from: kotlin.jvm.internal.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2188k extends l0 {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final short[] f52344E;

    /* renamed from: F, reason: collision with root package name */
    private int f52345F;

    public C2188k(@l3.d short[] array) {
        F.p(array, "array");
        this.f52344E = array;
    }

    @Override // kotlin.collections.l0
    public short c() {
        try {
            short[] sArr = this.f52344E;
            int i4 = this.f52345F;
            this.f52345F = i4 + 1;
            return sArr[i4];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.f52345F--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f52345F < this.f52344E.length) {
            return true;
        }
        return false;
    }
}
