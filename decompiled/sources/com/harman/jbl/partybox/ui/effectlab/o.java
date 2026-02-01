package com.harman.jbl.partybox.ui.effectlab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.N;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.effectlab.o;
import com.harman.jbl.partybox.utils.r;

/* loaded from: classes2.dex */
public class o extends RecyclerView.Adapter<b> {

    /* renamed from: d, reason: collision with root package name */
    private Context f43564d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f43565e;

    /* renamed from: f, reason: collision with root package name */
    private int f43566f;

    /* renamed from: g, reason: collision with root package name */
    private a f43567g;

    /* renamed from: h, reason: collision with root package name */
    private r f43568h = new r();

    /* loaded from: classes2.dex */
    public interface a {
        void a(int i4);
    }

    /* loaded from: classes2.dex */
    public class b extends RecyclerView.F {

        /* renamed from: I, reason: collision with root package name */
        ConstraintLayout f43569I;

        /* renamed from: J, reason: collision with root package name */
        ImageView f43570J;

        public b(@N View view) {
            super(view);
            this.f43569I = (ConstraintLayout) view.findViewById(j.h.Xd);
            this.f43570J = (ImageView) view.findViewById(j.h.v7);
        }
    }

    public o(Context context, int[] iArr) {
        this.f43564d = context;
        this.f43565e = iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(int i4, View view) {
        view.performHapticFeedback(3);
        a aVar = this.f43567g;
        if (aVar != null) {
            aVar.a(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean S(int i4, View view) {
        view.performHapticFeedback(0);
        a aVar = this.f43567g;
        if (aVar != null) {
            aVar.a(i4);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r3 != 3) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean T(com.harman.jbl.partybox.ui.effectlab.o.b r2, android.view.View r3, android.view.MotionEvent r4) {
        /*
            int r3 = r4.getAction()
            java.lang.Class<com.harman.jbl.partybox.ui.effectlab.o> r4 = com.harman.jbl.partybox.ui.effectlab.o.class
            java.lang.String r4 = r4.getSimpleName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onInterceptTouchEvent action: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r4, r0)
            r4 = 0
            r0 = 1
            if (r3 == 0) goto L31
            if (r3 == r0) goto L2b
            r1 = 2
            if (r3 == r1) goto L31
            r0 = 3
            if (r3 == r0) goto L2b
            goto L36
        L2b:
            android.view.View r2 = r2.f17770a
            r2.setPressed(r4)
            goto L36
        L31:
            android.view.View r2 = r2.f17770a
            r2.setPressed(r0)
        L36:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.effectlab.o.T(com.harman.jbl.partybox.ui.effectlab.o$b, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"ClickableViewAccessibility", "RecyclerView"})
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void C(@N final b bVar, final int i4) {
        int a4 = (this.f43566f - com.harman.jbl.partybox.utils.j.a(this.f43564d, 9.0f)) / 2;
        ViewGroup.LayoutParams layoutParams = bVar.f17770a.getLayoutParams();
        layoutParams.height = a4;
        bVar.f17770a.setLayoutParams(layoutParams);
        bVar.f43570J.setImageResource(this.f43565e[i4]);
        bVar.f43569I.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.effectlab.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o.this.R(i4, view);
            }
        });
        bVar.f43569I.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.harman.jbl.partybox.ui.effectlab.m
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean S3;
                S3 = o.this.S(i4, view);
                return S3;
            }
        });
        bVar.f43569I.setOnTouchListener(new View.OnTouchListener() { // from class: com.harman.jbl.partybox.ui.effectlab.n
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean T3;
                T3 = o.T(o.b.this, view, motionEvent);
                return T3;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @N
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public b E(@N ViewGroup viewGroup, int i4) {
        return new b(LayoutInflater.from(this.f43564d).inflate(j.i.f41441S2, viewGroup, false));
    }

    public void W(a aVar) {
        this.f43567g = aVar;
    }

    public void X(int i4) {
        this.f43566f = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f43565e.length;
    }
}
