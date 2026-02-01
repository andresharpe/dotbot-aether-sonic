package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes.dex */
public final class m<Z> extends e<Z> {

    /* renamed from: I, reason: collision with root package name */
    private static final int f26874I = 1;

    /* renamed from: J, reason: collision with root package name */
    private static final Handler f26875J = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: H, reason: collision with root package name */
    private final com.bumptech.glide.j f26876H;

    /* loaded from: classes.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((m) message.obj).f();
                return true;
            }
            return false;
        }
    }

    private m(com.bumptech.glide.j jVar, int i4, int i5) {
        super(i4, i5);
        this.f26876H = jVar;
    }

    public static <Z> m<Z> g(com.bumptech.glide.j jVar, int i4, int i5) {
        return new m<>(jVar, i4, i5);
    }

    @Override // com.bumptech.glide.request.target.p
    public void e(@N Z z3, @P com.bumptech.glide.request.transition.f<? super Z> fVar) {
        f26875J.obtainMessage(1, this).sendToTarget();
    }

    void f() {
        this.f26876H.C(this);
    }

    @Override // com.bumptech.glide.request.target.p
    public void r(@P Drawable drawable) {
    }
}
