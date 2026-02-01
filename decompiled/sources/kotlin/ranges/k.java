package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.P;

/* loaded from: classes2.dex */
public final class k extends P {

    /* renamed from: E, reason: collision with root package name */
    private final int f52469E;

    /* renamed from: F, reason: collision with root package name */
    private final int f52470F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f52471G;

    /* renamed from: H, reason: collision with root package name */
    private int f52472H;

    public k(int i4, int i5, int i6) {
        this.f52469E = i6;
        this.f52470F = i5;
        boolean z3 = true;
        if (i6 <= 0 ? i4 < i5 : i4 > i5) {
            z3 = false;
        }
        this.f52471G = z3;
        this.f52472H = z3 ? i4 : i5;
    }

    @Override // kotlin.collections.P
    public int c() {
        int i4 = this.f52472H;
        if (i4 == this.f52470F) {
            if (this.f52471G) {
                this.f52471G = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f52472H = this.f52469E + i4;
        }
        return i4;
    }

    public final int d() {
        return this.f52469E;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f52471G;
    }
}
