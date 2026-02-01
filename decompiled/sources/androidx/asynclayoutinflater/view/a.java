package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.I;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.h0;
import androidx.core.util.t;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f6391e = "AsyncLayoutInflater";

    /* renamed from: a, reason: collision with root package name */
    LayoutInflater f6392a;

    /* renamed from: d, reason: collision with root package name */
    private Handler.Callback f6395d = new C0052a();

    /* renamed from: b, reason: collision with root package name */
    Handler f6393b = new Handler(this.f6395d);

    /* renamed from: c, reason: collision with root package name */
    d f6394c = d.b();

    /* renamed from: androidx.asynclayoutinflater.view.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0052a implements Handler.Callback {
        C0052a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            c cVar = (c) message.obj;
            if (cVar.f6401d == null) {
                cVar.f6401d = a.this.f6392a.inflate(cVar.f6400c, cVar.f6399b, false);
            }
            cVar.f6402e.a(cVar.f6401d, cVar.f6400c, cVar.f6399b);
            a.this.f6394c.d(cVar);
            return true;
        }
    }

    /* loaded from: classes.dex */
    private static class b extends LayoutInflater {

        /* renamed from: a, reason: collision with root package name */
        private static final String[] f6397a = {"android.widget.", "android.webkit.", "android.app."};

        b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new b(context);
        }

        @Override // android.view.LayoutInflater
        protected View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View createView;
            for (String str2 : f6397a) {
                try {
                    createView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        a f6398a;

        /* renamed from: b, reason: collision with root package name */
        ViewGroup f6399b;

        /* renamed from: c, reason: collision with root package name */
        int f6400c;

        /* renamed from: d, reason: collision with root package name */
        View f6401d;

        /* renamed from: e, reason: collision with root package name */
        e f6402e;

        c() {
        }
    }

    /* loaded from: classes.dex */
    private static class d extends Thread {

        /* renamed from: G, reason: collision with root package name */
        private static final d f6403G;

        /* renamed from: E, reason: collision with root package name */
        private ArrayBlockingQueue<c> f6404E = new ArrayBlockingQueue<>(10);

        /* renamed from: F, reason: collision with root package name */
        private t.c<c> f6405F = new t.c<>(10);

        static {
            d dVar = new d();
            f6403G = dVar;
            dVar.start();
        }

        private d() {
        }

        public static d b() {
            return f6403G;
        }

        public void a(c cVar) {
            try {
                this.f6404E.put(cVar);
            } catch (InterruptedException e4) {
                throw new RuntimeException("Failed to enqueue async inflate request", e4);
            }
        }

        public c c() {
            c b4 = this.f6405F.b();
            if (b4 == null) {
                return new c();
            }
            return b4;
        }

        public void d(c cVar) {
            cVar.f6402e = null;
            cVar.f6398a = null;
            cVar.f6399b = null;
            cVar.f6400c = 0;
            cVar.f6401d = null;
            this.f6405F.a(cVar);
        }

        public void e() {
            try {
                c take = this.f6404E.take();
                try {
                    take.f6401d = take.f6398a.f6392a.inflate(take.f6400c, take.f6399b, false);
                } catch (RuntimeException e4) {
                    Log.w(a.f6391e, "Failed to inflate resource in the background! Retrying on the UI thread", e4);
                }
                Message.obtain(take.f6398a.f6393b, 0, take).sendToTarget();
            } catch (InterruptedException e5) {
                Log.w(a.f6391e, e5);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                e();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(@N View view, @I int i4, @P ViewGroup viewGroup);
    }

    public a(@N Context context) {
        this.f6392a = new b(context);
    }

    @h0
    public void a(@I int i4, @P ViewGroup viewGroup, @N e eVar) {
        if (eVar != null) {
            c c4 = this.f6394c.c();
            c4.f6398a = this;
            c4.f6400c = i4;
            c4.f6399b = viewGroup;
            c4.f6402e = eVar;
            this.f6394c.a(c4);
            return;
        }
        throw new NullPointerException("callback argument may not be null!");
    }
}
