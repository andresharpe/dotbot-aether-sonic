package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
class x {

    /* renamed from: a, reason: collision with root package name */
    private boolean f26252a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f26253b = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes.dex */
    private static final class a implements Handler.Callback {

        /* renamed from: c, reason: collision with root package name */
        static final int f26254c = 1;

        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((u) message.obj).a();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(u<?> uVar, boolean z3) {
        try {
            if (!this.f26252a && !z3) {
                this.f26252a = true;
                uVar.a();
                this.f26252a = false;
            }
            this.f26253b.obtainMessage(1, uVar).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }
}
