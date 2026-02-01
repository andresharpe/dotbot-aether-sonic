package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class i<C, T, A> implements Cloneable {

    /* renamed from: J, reason: collision with root package name */
    private static final String f14085J = "CallbackRegistry";

    /* renamed from: E, reason: collision with root package name */
    private List<C> f14086E = new ArrayList();

    /* renamed from: F, reason: collision with root package name */
    private long f14087F = 0;

    /* renamed from: G, reason: collision with root package name */
    private long[] f14088G;

    /* renamed from: H, reason: collision with root package name */
    private int f14089H;

    /* renamed from: I, reason: collision with root package name */
    private final a<C, T, A> f14090I;

    /* loaded from: classes.dex */
    public static abstract class a<C, T, A> {
        public abstract void a(C callback, T sender, int arg, A arg2);
    }

    public i(a<C, T, A> notifier) {
        this.f14090I = notifier;
    }

    private boolean h(int index) {
        int i4;
        if (index < 64) {
            if (((1 << index) & this.f14087F) != 0) {
                return true;
            }
            return false;
        }
        long[] jArr = this.f14088G;
        if (jArr == null || (i4 = (index / 64) - 1) >= jArr.length) {
            return false;
        }
        if (((1 << (index % 64)) & jArr[i4]) != 0) {
            return true;
        }
        return false;
    }

    private void j(T t3, int i4, A a4, int i5, int i6, long j4) {
        long j5 = 1;
        while (i5 < i6) {
            if ((j4 & j5) == 0) {
                this.f14090I.a(this.f14086E.get(i5), t3, i4, a4);
            }
            j5 <<= 1;
            i5++;
        }
    }

    private void k(T sender, int arg, A arg2) {
        j(sender, arg, arg2, 0, Math.min(64, this.f14086E.size()), this.f14087F);
    }

    private void l(T sender, int arg, A arg2) {
        int length;
        int size = this.f14086E.size();
        long[] jArr = this.f14088G;
        if (jArr == null) {
            length = -1;
        } else {
            length = jArr.length - 1;
        }
        n(sender, arg, arg2, length);
        j(sender, arg, arg2, (length + 2) * 64, size, 0L);
    }

    private void n(T sender, int arg, A arg2, int remainderIndex) {
        if (remainderIndex < 0) {
            k(sender, arg, arg2);
            return;
        }
        long j4 = this.f14088G[remainderIndex];
        int i4 = (remainderIndex + 1) * 64;
        int min = Math.min(this.f14086E.size(), i4 + 64);
        n(sender, arg, arg2, remainderIndex - 1);
        j(sender, arg, arg2, i4, min, j4);
    }

    private void p(int startIndex, long removed) {
        long j4 = Long.MIN_VALUE;
        for (int i4 = startIndex + 63; i4 >= startIndex; i4--) {
            if ((removed & j4) != 0) {
                this.f14086E.remove(i4);
            }
            j4 >>>= 1;
        }
    }

    private void q(int index) {
        if (index < 64) {
            this.f14087F = (1 << index) | this.f14087F;
            return;
        }
        int i4 = (index / 64) - 1;
        long[] jArr = this.f14088G;
        if (jArr == null) {
            this.f14088G = new long[this.f14086E.size() / 64];
        } else if (jArr.length <= i4) {
            long[] jArr2 = new long[this.f14086E.size() / 64];
            long[] jArr3 = this.f14088G;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f14088G = jArr2;
        }
        long j4 = 1 << (index % 64);
        long[] jArr4 = this.f14088G;
        jArr4[i4] = j4 | jArr4[i4];
    }

    public synchronized void a(C callback) {
        try {
            if (callback != null) {
                int lastIndexOf = this.f14086E.lastIndexOf(callback);
                if (lastIndexOf >= 0) {
                    if (h(lastIndexOf)) {
                    }
                }
                this.f14086E.add(callback);
            } else {
                throw new IllegalArgumentException("callback cannot be null");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        try {
            if (this.f14089H == 0) {
                this.f14086E.clear();
            } else if (!this.f14086E.isEmpty()) {
                for (int size = this.f14086E.size() - 1; size >= 0; size--) {
                    q(size);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public synchronized i<C, T, A> clone() {
        i<C, T, A> iVar;
        CloneNotSupportedException e4;
        try {
            iVar = (i) super.clone();
        } catch (CloneNotSupportedException e5) {
            iVar = null;
            e4 = e5;
        }
        try {
            iVar.f14087F = 0L;
            iVar.f14088G = null;
            iVar.f14089H = 0;
            iVar.f14086E = new ArrayList();
            int size = this.f14086E.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!h(i4)) {
                    iVar.f14086E.add(this.f14086E.get(i4));
                }
            }
        } catch (CloneNotSupportedException e6) {
            e4 = e6;
            e4.printStackTrace();
            return iVar;
        }
        return iVar;
    }

    public synchronized ArrayList<C> e() {
        ArrayList<C> arrayList;
        arrayList = new ArrayList<>(this.f14086E.size());
        int size = this.f14086E.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!h(i4)) {
                arrayList.add(this.f14086E.get(i4));
            }
        }
        return arrayList;
    }

    public synchronized void f(List<C> callbacks) {
        callbacks.clear();
        int size = this.f14086E.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!h(i4)) {
                callbacks.add(this.f14086E.get(i4));
            }
        }
    }

    public synchronized boolean g() {
        if (this.f14086E.isEmpty()) {
            return true;
        }
        if (this.f14089H == 0) {
            return false;
        }
        int size = this.f14086E.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!h(i4)) {
                return false;
            }
        }
        return true;
    }

    public synchronized void i(T sender, int arg, A arg2) {
        try {
            this.f14089H++;
            l(sender, arg, arg2);
            int i4 = this.f14089H - 1;
            this.f14089H = i4;
            if (i4 == 0) {
                long[] jArr = this.f14088G;
                if (jArr != null) {
                    for (int length = jArr.length - 1; length >= 0; length--) {
                        long j4 = this.f14088G[length];
                        if (j4 != 0) {
                            p((length + 1) * 64, j4);
                            this.f14088G[length] = 0;
                        }
                    }
                }
                long j5 = this.f14087F;
                if (j5 != 0) {
                    p(0, j5);
                    this.f14087F = 0L;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void o(C callback) {
        try {
            if (this.f14089H == 0) {
                this.f14086E.remove(callback);
            } else {
                int lastIndexOf = this.f14086E.lastIndexOf(callback);
                if (lastIndexOf >= 0) {
                    q(lastIndexOf);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
