package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.AbstractC2106t;

/* renamed from: kotlin.jvm.internal.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2180c extends AbstractC2106t {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final char[] f52332E;

    /* renamed from: F, reason: collision with root package name */
    private int f52333F;

    public C2180c(@l3.d char[] array) {
        F.p(array, "array");
        this.f52332E = array;
    }

    @Override // kotlin.collections.AbstractC2106t
    public char c() {
        try {
            char[] cArr = this.f52332E;
            int i4 = this.f52333F;
            this.f52333F = i4 + 1;
            return cArr[i4];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.f52333F--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f52333F < this.f52332E.length) {
            return true;
        }
        return false;
    }
}
