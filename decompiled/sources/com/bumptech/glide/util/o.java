package com.bumptech.glide.util;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.f;
import java.util.Arrays;

/* loaded from: classes.dex */
public class o<T> implements f.b<T>, com.bumptech.glide.request.target.o {

    /* renamed from: a, reason: collision with root package name */
    private int[] f26967a;

    /* renamed from: b, reason: collision with root package name */
    private a f26968b;

    /* loaded from: classes.dex */
    static final class a extends com.bumptech.glide.request.target.f<View, Object> {
        a(@N View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.p
        public void e(@N Object obj, @P com.bumptech.glide.request.transition.f<? super Object> fVar) {
        }

        @Override // com.bumptech.glide.request.target.f
        protected void k(@P Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void m(@P Drawable drawable) {
        }
    }

    public o() {
    }

    @Override // com.bumptech.glide.f.b
    @P
    public int[] a(@N T t3, int i4, int i5) {
        int[] iArr = this.f26967a;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public void b(@N View view) {
        if (this.f26967a == null && this.f26968b == null) {
            a aVar = new a(view);
            this.f26968b = aVar;
            aVar.s(this);
        }
    }

    @Override // com.bumptech.glide.request.target.o
    public void f(int i4, int i5) {
        this.f26967a = new int[]{i4, i5};
        this.f26968b = null;
    }

    public o(@N View view) {
        a aVar = new a(view);
        this.f26968b = aVar;
        aVar.s(this);
    }
}
