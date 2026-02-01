package com.blankj.utilcode.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class C0 implements Handler.Callback {

    /* renamed from: h, reason: collision with root package name */
    private static final String f24741h = "UiMessageUtils";

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f24742i = H0.q0();

    /* renamed from: c, reason: collision with root package name */
    private final Handler f24743c;

    /* renamed from: d, reason: collision with root package name */
    private final c f24744d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray<List<d>> f24745e;

    /* renamed from: f, reason: collision with root package name */
    private final List<d> f24746f;

    /* renamed from: g, reason: collision with root package name */
    private final List<d> f24747g;

    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final C0 f24748a = new C0();

        private b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private Message f24749a;

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Message message) {
            this.f24749a = message;
        }

        public int b() {
            return this.f24749a.what;
        }

        public Object c() {
            return this.f24749a.obj;
        }

        public String toString() {
            return "{ id=" + b() + ", obj=" + c() + " }";
        }

        private c(Message message) {
            this.f24749a = message;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(@androidx.annotation.N c cVar);
    }

    public static C0 c() {
        return b.f24748a;
    }

    private void d(@androidx.annotation.N c cVar) {
        List<d> list = this.f24745e.get(cVar.b());
        if ((list == null || list.size() == 0) && this.f24746f.size() == 0) {
            Log.w(f24741h, "Delivering FAILED for message ID " + cVar.b() + ". No listeners. " + cVar.toString());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Delivering message ID ");
        sb.append(cVar.b());
        sb.append(", Specific listeners: ");
        if (list != null && list.size() != 0) {
            sb.append(list.size());
            sb.append(" [");
            for (int i4 = 0; i4 < list.size(); i4++) {
                sb.append(list.get(i4).getClass().getSimpleName());
                if (i4 < list.size() - 1) {
                    sb.append(",");
                }
            }
            sb.append("]");
        } else {
            sb.append(0);
        }
        sb.append(", Universal listeners: ");
        synchronized (this.f24746f) {
            try {
                if (this.f24746f.size() == 0) {
                    sb.append(0);
                } else {
                    sb.append(this.f24746f.size());
                    sb.append(" [");
                    for (int i5 = 0; i5 < this.f24746f.size(); i5++) {
                        sb.append(this.f24746f.get(i5).getClass().getSimpleName());
                        if (i5 < this.f24746f.size() - 1) {
                            sb.append(",");
                        }
                    }
                    sb.append("], Message: ");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        sb.append(cVar.toString());
        Log.v(f24741h, sb.toString());
    }

    public void a(int i4, @androidx.annotation.N d dVar) {
        synchronized (this.f24745e) {
            try {
                List<d> list = this.f24745e.get(i4);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f24745e.put(i4, list);
                }
                if (!list.contains(dVar)) {
                    list.add(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(@androidx.annotation.N d dVar) {
        synchronized (this.f24746f) {
            try {
                if (!this.f24746f.contains(dVar)) {
                    this.f24746f.add(dVar);
                } else if (f24742i) {
                    Log.w(f24741h, "Listener is already added. " + dVar.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(int i4, @androidx.annotation.N d dVar) {
        synchronized (this.f24745e) {
            try {
                List<d> list = this.f24745e.get(i4);
                if (list != null && !list.isEmpty()) {
                    if (f24742i && !list.contains(dVar)) {
                        Log.w(f24741h, "Trying to remove specific listener that is not registered. ID " + i4 + ", " + dVar);
                        return;
                    }
                    list.remove(dVar);
                } else if (f24742i) {
                    Log.w(f24741h, "Trying to remove specific listener that is not registered. ID " + i4 + ", " + dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(@androidx.annotation.N d dVar) {
        synchronized (this.f24746f) {
            try {
                if (f24742i && !this.f24746f.contains(dVar)) {
                    Log.w(f24741h, "Trying to remove a listener that is not registered. " + dVar.toString());
                }
                this.f24746f.remove(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(int i4) {
        List<d> list;
        if (f24742i && ((list = this.f24745e.get(i4)) == null || list.size() == 0)) {
            Log.w(f24741h, "Trying to remove specific listeners that are not registered. ID " + i4);
        }
        synchronized (this.f24745e) {
            this.f24745e.delete(i4);
        }
    }

    public final void h(int i4) {
        this.f24743c.sendEmptyMessage(i4);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        this.f24744d.d(message);
        if (f24742i) {
            d(this.f24744d);
        }
        synchronized (this.f24745e) {
            try {
                List<d> list = this.f24745e.get(message.what);
                if (list != null) {
                    if (list.size() == 0) {
                        this.f24745e.remove(message.what);
                    } else {
                        this.f24747g.addAll(list);
                        Iterator<d> it = this.f24747g.iterator();
                        while (it.hasNext()) {
                            it.next().a(this.f24744d);
                        }
                        this.f24747g.clear();
                    }
                }
            } finally {
            }
        }
        synchronized (this.f24746f) {
            try {
                if (this.f24746f.size() > 0) {
                    this.f24747g.addAll(this.f24746f);
                    Iterator<d> it2 = this.f24747g.iterator();
                    while (it2.hasNext()) {
                        it2.next().a(this.f24744d);
                    }
                    this.f24747g.clear();
                }
            } finally {
            }
        }
        this.f24744d.d(null);
        return true;
    }

    public final void i(int i4, @androidx.annotation.N Object obj) {
        Handler handler = this.f24743c;
        handler.sendMessage(handler.obtainMessage(i4, obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C0() {
        this.f24743c = new Handler(Looper.getMainLooper(), this);
        this.f24744d = new c(null);
        this.f24745e = new SparseArray<>();
        this.f24746f = new ArrayList();
        this.f24747g = new ArrayList();
    }
}
