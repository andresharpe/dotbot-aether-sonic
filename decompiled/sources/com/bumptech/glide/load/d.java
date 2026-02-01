package com.bumptech.glide.load;

import android.content.Context;
import androidx.annotation.N;
import com.bumptech.glide.load.engine.u;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d<T> implements i<T> {

    /* renamed from: c, reason: collision with root package name */
    private final Collection<? extends i<T>> f25785c;

    @SafeVarargs
    public d(@N i<T>... iVarArr) {
        if (iVarArr.length != 0) {
            this.f25785c = Arrays.asList(iVarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @Override // com.bumptech.glide.load.c
    public void a(@N MessageDigest messageDigest) {
        Iterator<? extends i<T>> it = this.f25785c.iterator();
        while (it.hasNext()) {
            it.next().a(messageDigest);
        }
    }

    @Override // com.bumptech.glide.load.i
    @N
    public u<T> b(@N Context context, @N u<T> uVar, int i4, int i5) {
        Iterator<? extends i<T>> it = this.f25785c.iterator();
        u<T> uVar2 = uVar;
        while (it.hasNext()) {
            u<T> b4 = it.next().b(context, uVar2, i4, i5);
            if (uVar2 != null && !uVar2.equals(uVar) && !uVar2.equals(b4)) {
                uVar2.a();
            }
            uVar2 = b4;
        }
        return uVar2;
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f25785c.equals(((d) obj).f25785c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        return this.f25785c.hashCode();
    }

    public d(@N Collection<? extends i<T>> collection) {
        if (!collection.isEmpty()) {
            this.f25785c = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
}
