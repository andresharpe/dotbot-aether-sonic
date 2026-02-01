package com.google.android.gms.common.data;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1285y;
import java.util.ArrayList;

@I0.a
/* loaded from: classes.dex */
public abstract class i<T> extends a<T> {

    /* renamed from: F, reason: collision with root package name */
    private boolean f28538F;

    /* renamed from: G, reason: collision with root package name */
    private ArrayList<Integer> f28539G;

    @I0.a
    protected i(@N DataHolder dataHolder) {
        super(dataHolder);
        this.f28538F = false;
    }

    private final void j() {
        synchronized (this) {
            try {
                if (!this.f28538F) {
                    int count = ((DataHolder) C1285y.l(this.f28527E)).getCount();
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    this.f28539G = arrayList;
                    if (count > 0) {
                        arrayList.add(0);
                        String d4 = d();
                        String B02 = this.f28527E.B0(d4, 0, this.f28527E.E0(0));
                        for (int i4 = 1; i4 < count; i4++) {
                            int E02 = this.f28527E.E0(i4);
                            String B03 = this.f28527E.B0(d4, i4, E02);
                            if (B03 != null) {
                                if (!B03.equals(B02)) {
                                    this.f28539G.add(Integer.valueOf(i4));
                                    B02 = B03;
                                }
                            } else {
                                StringBuilder sb = new StringBuilder(String.valueOf(d4).length() + 78);
                                sb.append("Missing value for markerColumn: ");
                                sb.append(d4);
                                sb.append(", at row: ");
                                sb.append(i4);
                                sb.append(", for window: ");
                                sb.append(E02);
                                throw new NullPointerException(sb.toString());
                            }
                        }
                    }
                    this.f28538F = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @P
    @I0.a
    protected String b() {
        return null;
    }

    @I0.a
    @N
    protected abstract T c(int i4, int i5);

    @I0.a
    @N
    protected abstract String d();

    final int f(int i4) {
        if (i4 >= 0 && i4 < this.f28539G.size()) {
            return this.f28539G.get(i4).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(i4);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.common.data.a, com.google.android.gms.common.data.b
    @I0.a
    @N
    public final T get(int i4) {
        int intValue;
        int intValue2;
        j();
        int f4 = f(i4);
        int i5 = 0;
        if (i4 >= 0 && i4 != this.f28539G.size()) {
            if (i4 == this.f28539G.size() - 1) {
                intValue = ((DataHolder) C1285y.l(this.f28527E)).getCount();
                intValue2 = this.f28539G.get(i4).intValue();
            } else {
                intValue = this.f28539G.get(i4 + 1).intValue();
                intValue2 = this.f28539G.get(i4).intValue();
            }
            int i6 = intValue - intValue2;
            if (i6 == 1) {
                int f5 = f(i4);
                int E02 = ((DataHolder) C1285y.l(this.f28527E)).E0(f5);
                String b4 = b();
                if (b4 == null || this.f28527E.B0(b4, f5, E02) != null) {
                    i5 = 1;
                }
            } else {
                i5 = i6;
            }
        }
        return c(f4, i5);
    }

    @Override // com.google.android.gms.common.data.a, com.google.android.gms.common.data.b
    @I0.a
    public int getCount() {
        j();
        return this.f28539G.size();
    }
}
