package com.google.android.material.datepicker;

import T0.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.core.view.C0823k0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes2.dex */
class o extends RecyclerView.Adapter<b> {

    /* renamed from: d, reason: collision with root package name */
    @N
    private final com.google.android.material.datepicker.a f32239d;

    /* renamed from: e, reason: collision with root package name */
    private final f<?> f32240e;

    /* renamed from: f, reason: collision with root package name */
    private final MaterialCalendar.l f32241f;

    /* renamed from: g, reason: collision with root package name */
    private final int f32242g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f32243E;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f32243E = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (this.f32243E.getAdapter().n(i4)) {
                o.this.f32241f.a(this.f32243E.getAdapter().getItem(i4).longValue());
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends RecyclerView.F {

        /* renamed from: I, reason: collision with root package name */
        final TextView f32245I;

        /* renamed from: J, reason: collision with root package name */
        final MaterialCalendarGridView f32246J;

        b(@N LinearLayout linearLayout, boolean z3) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(a.h.f2750d3);
            this.f32245I = textView;
            C0823k0.C1(textView, true);
            this.f32246J = (MaterialCalendarGridView) linearLayout.findViewById(a.h.f2726Y2);
            if (!z3) {
                textView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(@N Context context, f<?> fVar, @N com.google.android.material.datepicker.a aVar, MaterialCalendar.l lVar) {
        int i4;
        m m4 = aVar.m();
        m h4 = aVar.h();
        m l4 = aVar.l();
        if (m4.compareTo(l4) <= 0) {
            if (l4.compareTo(h4) <= 0) {
                int y02 = n.f32233J * MaterialCalendar.y0(context);
                if (MaterialDatePicker.E0(context)) {
                    i4 = MaterialCalendar.y0(context);
                } else {
                    i4 = 0;
                }
                this.f32242g = y02 + i4;
                this.f32239d = aVar;
                this.f32240e = fVar;
                this.f32241f = lVar;
                L(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public m P(int i4) {
        return this.f32239d.m().r(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public CharSequence Q(int i4) {
        return P(i4).o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int R(@N m mVar) {
        return this.f32239d.m().s(mVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void C(@N b bVar, int i4) {
        m r4 = this.f32239d.m().r(i4);
        bVar.f32245I.setText(r4.o());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f32246J.findViewById(a.h.f2726Y2);
        if (materialCalendarGridView.getAdapter() != null && r4.equals(materialCalendarGridView.getAdapter().f32234E)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().m(materialCalendarGridView);
        } else {
            n nVar = new n(r4, this.f32240e, this.f32239d);
            materialCalendarGridView.setNumColumns(r4.f32229H);
            materialCalendarGridView.setAdapter((ListAdapter) nVar);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @N
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public b E(@N ViewGroup viewGroup, int i4) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(a.k.f3029w0, viewGroup, false);
        if (MaterialDatePicker.E0(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f32242g));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f32239d.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long m(int i4) {
        return this.f32239d.m().r(i4).q();
    }
}
