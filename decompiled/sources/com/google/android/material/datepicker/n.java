package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.P;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class n extends BaseAdapter {

    /* renamed from: J, reason: collision with root package name */
    static final int f32233J = v.v().getMaximum(4);

    /* renamed from: E, reason: collision with root package name */
    final m f32234E;

    /* renamed from: F, reason: collision with root package name */
    final f<?> f32235F;

    /* renamed from: G, reason: collision with root package name */
    private Collection<Long> f32236G;

    /* renamed from: H, reason: collision with root package name */
    c f32237H;

    /* renamed from: I, reason: collision with root package name */
    final a f32238I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(m mVar, f<?> fVar, a aVar) {
        this.f32234E = mVar;
        this.f32235F = fVar;
        this.f32238I = aVar;
        this.f32236G = fVar.H();
    }

    private void e(Context context) {
        if (this.f32237H == null) {
            this.f32237H = new c(context);
        }
    }

    private boolean h(long j4) {
        Iterator<Long> it = this.f32235F.H().iterator();
        while (it.hasNext()) {
            if (v.a(j4) == v.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private void k(@P TextView textView, long j4) {
        b bVar;
        if (textView == null) {
            return;
        }
        if (this.f32238I.g().D(j4)) {
            textView.setEnabled(true);
            if (h(j4)) {
                bVar = this.f32237H.f32191b;
            } else if (v.t().getTimeInMillis() == j4) {
                bVar = this.f32237H.f32192c;
            } else {
                bVar = this.f32237H.f32190a;
            }
        } else {
            textView.setEnabled(false);
            bVar = this.f32237H.f32196g;
        }
        bVar.f(textView);
    }

    private void l(MaterialCalendarGridView materialCalendarGridView, long j4) {
        if (m.g(j4).equals(this.f32234E)) {
            k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(this.f32234E.n(j4)) - materialCalendarGridView.getFirstVisiblePosition()), j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i4) {
        return b() + (i4 - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f32234E.l();
    }

    @Override // android.widget.Adapter
    @P
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i4) {
        if (i4 >= this.f32234E.l() && i4 <= i()) {
            return Long.valueOf(this.f32234E.m(j(i4)));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    @Override // android.widget.Adapter
    @androidx.annotation.N
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, @androidx.annotation.P android.view.View r7, @androidx.annotation.N android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = T0.a.k.f3019r0
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L75
            com.google.android.material.datepicker.m r8 = r5.f32234E
            int r2 = r8.f32230I
            if (r7 < r2) goto L2d
            goto L75
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.m r8 = r5.f32234E
            long r7 = r8.m(r7)
            com.google.android.material.datepicker.m r3 = r5.f32234E
            int r3 = r3.f32228G
            com.google.android.material.datepicker.m r4 = com.google.android.material.datepicker.m.i()
            int r4 = r4.f32228G
            if (r3 != r4) goto L67
            java.lang.String r7 = com.google.android.material.datepicker.g.g(r7)
            r0.setContentDescription(r7)
            goto L6e
        L67:
            java.lang.String r7 = com.google.android.material.datepicker.g.l(r7)
            r0.setContentDescription(r7)
        L6e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L7d
        L75:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L7d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L84
            return r0
        L84:
            long r6 = r6.longValue()
            r5.k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.n.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(int i4) {
        if (i4 % this.f32234E.f32229H == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(int i4) {
        if ((i4 + 1) % this.f32234E.f32229H == 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f32234E.f32230I + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4 / this.f32234E.f32229H;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return (this.f32234E.l() + this.f32234E.f32230I) - 1;
    }

    int j(int i4) {
        return (i4 - this.f32234E.l()) + 1;
    }

    public void m(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f32236G.iterator();
        while (it.hasNext()) {
            l(materialCalendarGridView, it.next().longValue());
        }
        f<?> fVar = this.f32235F;
        if (fVar != null) {
            Iterator<Long> it2 = fVar.H().iterator();
            while (it2.hasNext()) {
                l(materialCalendarGridView, it2.next().longValue());
            }
            this.f32236G = this.f32235F.H();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n(int i4) {
        if (i4 >= b() && i4 <= i()) {
            return true;
        }
        return false;
    }
}
