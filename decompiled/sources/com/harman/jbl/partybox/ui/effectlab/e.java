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
import com.harman.jbl.partybox.ui.effectlab.e;
import com.harman.jbl.partybox.utils.r;

/* loaded from: classes2.dex */
public class e extends RecyclerView.Adapter<a> {

    /* renamed from: d, reason: collision with root package name */
    private Context f43525d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f43526e;

    /* renamed from: f, reason: collision with root package name */
    private b f43527f;

    /* renamed from: g, reason: collision with root package name */
    private r f43528g = new r();

    /* loaded from: classes2.dex */
    public class a extends RecyclerView.F {

        /* renamed from: I, reason: collision with root package name */
        ImageView f43529I;

        /* renamed from: J, reason: collision with root package name */
        ConstraintLayout f43530J;

        public a(@N View view) {
            super(view);
            this.f43529I = (ImageView) view.findViewById(j.h.w7);
            this.f43530J = (ConstraintLayout) view.findViewById(j.h.Xd);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(int i4);
    }

    public e(Context context, int[] iArr) {
        this.f43525d = context;
        this.f43526e = iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(int i4, View view) {
        view.performHapticFeedback(3);
        b bVar = this.f43527f;
        if (bVar != null) {
            bVar.a(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean S(int i4, View view) {
        view.performHapticFeedback(0);
        b bVar = this.f43527f;
        if (bVar != null) {
            bVar.a(i4);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        if (r3 != 3) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean T(com.harman.jbl.partybox.ui.effectlab.e.a r2, android.view.View r3, android.view.MotionEvent r4) {
        /*
            int r3 = r4.getAction()
            r4 = 0
            r0 = 1
            if (r3 == 0) goto L17
            if (r3 == r0) goto L11
            r1 = 2
            if (r3 == r1) goto L17
            r0 = 3
            if (r3 == r0) goto L11
            goto L1c
        L11:
            androidx.constraintlayout.widget.ConstraintLayout r2 = r2.f43530J
            r2.setPressed(r4)
            goto L1c
        L17:
            androidx.constraintlayout.widget.ConstraintLayout r2 = r2.f43530J
            r2.setPressed(r0)
        L1c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.effectlab.e.T(com.harman.jbl.partybox.ui.effectlab.e$a, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"ClickableViewAccessibility", "RecyclerView"})
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void C(@N final a aVar, final int i4) {
        aVar.f43529I.setImageResource(this.f43526e[i4]);
        aVar.f43530J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.effectlab.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.this.R(i4, view);
            }
        });
        aVar.f43530J.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.harman.jbl.partybox.ui.effectlab.c
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean S3;
                S3 = e.this.S(i4, view);
                return S3;
            }
        });
        aVar.f17770a.setOnTouchListener(new View.OnTouchListener() { // from class: com.harman.jbl.partybox.ui.effectlab.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean T3;
                T3 = e.T(e.a.this, view, motionEvent);
                return T3;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @N
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public a E(@N ViewGroup viewGroup, int i4) {
        return new a(LayoutInflater.from(this.f43525d).inflate(j.i.f41421N2, viewGroup, false));
    }

    public void W(b bVar) {
        this.f43527f = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f43526e.length;
    }
}
