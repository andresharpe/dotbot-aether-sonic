package com.google.android.gms.common.data;

import androidx.annotation.N;
import com.google.android.gms.common.internal.C1285y;
import java.util.NoSuchElementException;

@I0.a
/* loaded from: classes.dex */
public class l<T> extends c<T> {

    /* renamed from: G, reason: collision with root package name */
    private T f28540G;

    public l(@N b<T> bVar) {
        super(bVar);
    }

    @Override // com.google.android.gms.common.data.c, java.util.Iterator
    @N
    public final T next() {
        if (hasNext()) {
            int i4 = this.f28529F + 1;
            this.f28529F = i4;
            if (i4 == 0) {
                T t3 = (T) C1285y.l(this.f28528E.get(0));
                this.f28540G = t3;
                if (!(t3 instanceof f)) {
                    String valueOf = String.valueOf(t3.getClass());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 44);
                    sb.append("DataBuffer reference of type ");
                    sb.append(valueOf);
                    sb.append(" is not movable");
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                ((f) C1285y.l(this.f28540G)).n(this.f28529F);
            }
            return this.f28540G;
        }
        int i5 = this.f28529F;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Cannot advance the iterator beyond ");
        sb2.append(i5);
        throw new NoSuchElementException(sb2.toString());
    }
}
