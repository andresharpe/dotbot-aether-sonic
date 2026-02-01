package com.harman.jbl.partybox.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.C;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.model.ClickEventType;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.equalizer.d;
import java.util.ArrayList;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001>B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b5\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b5\u00108B#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\u0006\u00109\u001a\u00020\u001d¢\u0006\u0004\b5\u0010:B+\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\u0006\u00109\u001a\u00020\u001d\u0012\u0006\u0010;\u001a\u00020\u001d¢\u0006\u0004\b5\u0010<J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\u00052\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010 R$\u0010(\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0016R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u0006?"}, d2 = {"Lcom/harman/jbl/partybox/ui/widget/HMCardEQ2View;", "Lcom/harman/jbl/partybox/ui/widget/l;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Lkotlin/H0;", "c", "(Landroid/content/Context;)V", "Ljava/util/ArrayList;", "Lcom/harman/jbl/partybox/model/a;", "Lkotlin/collections/ArrayList;", "eqCategoryList", "Lcom/harman/jbl/partybox/ui/equalizer/d$c;", C.a.f28602a, "e", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/harman/jbl/partybox/ui/equalizer/d$c;)V", "eqModelList", "f", "(Ljava/util/ArrayList;)V", "Lcom/harman/jbl/partybox/ui/widget/q;", "onActionListener", "setOnActionListener", "(Lcom/harman/jbl/partybox/ui/widget/q;)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "d", "()V", "", "visibility", "g", "(I)V", "position", "setSmoothScroll", "I", "Lcom/harman/jbl/partybox/ui/widget/q;", "getMOnActionListener", "()Lcom/harman/jbl/partybox/ui/widget/q;", "setMOnActionListener", "mOnActionListener", "Lcom/harman/jbl/partybox/ui/customviews/HmCustomFontTextView;", "J", "Lcom/harman/jbl/partybox/ui/customviews/HmCustomFontTextView;", "editButton", "Landroidx/recyclerview/widget/RecyclerView;", "K", "Landroidx/recyclerview/widget/RecyclerView;", "eq2RecyclerView", "Lcom/harman/jbl/partybox/ui/equalizer/d;", "L", "Lcom/harman/jbl/partybox/ui/equalizer/d;", "eq2Adapter", "<init>", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "M", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nHMCardEQ2View.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HMCardEQ2View.kt\ncom/harman/jbl/partybox/ui/widget/HMCardEQ2View\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
/* loaded from: classes2.dex */
public final class HMCardEQ2View extends l implements View.OnClickListener {

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    public static final a f45786M = new a(null);

    /* renamed from: N, reason: collision with root package name */
    @l3.d
    public static final String f45787N = "HMCardEQ2View";

    /* renamed from: I, reason: collision with root package name */
    @l3.e
    private q f45788I;

    /* renamed from: J, reason: collision with root package name */
    @l3.e
    private HmCustomFontTextView f45789J;

    /* renamed from: K, reason: collision with root package name */
    @l3.e
    private RecyclerView f45790K;

    /* renamed from: L, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.equalizer.d f45791L;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMCardEQ2View(@l3.d Context context) {
        super(context);
        F.p(context, "context");
        c(context);
    }

    public final void c(@l3.d Context context) {
        Integer num;
        F.p(context, "context");
        View inflate = LayoutInflater.from(context).inflate(j.i.f41484d1, (ViewGroup) this, true);
        F.m(inflate);
        this.f45789J = (HmCustomFontTextView) inflate.findViewById(j.h.e4);
        this.f45790K = (RecyclerView) inflate.findViewById(j.h.u4);
        HmCustomFontTextView hmCustomFontTextView = this.f45789J;
        if (hmCustomFontTextView != null) {
            num = Integer.valueOf(hmCustomFontTextView.getId());
        } else {
            num = null;
        }
        com.harman.log.f.a(f45787N, "initView called, editButton viewId = " + num);
        HmCustomFontTextView hmCustomFontTextView2 = this.f45789J;
        if (hmCustomFontTextView2 != null) {
            hmCustomFontTextView2.setOnClickListener(this);
        }
    }

    public final void d() {
        com.harman.jbl.partybox.ui.equalizer.d dVar = this.f45791L;
        if (dVar != null) {
            dVar.r();
        }
    }

    public final void e(@l3.d Context context, @l3.e ArrayList<com.harman.jbl.partybox.model.a> arrayList, @l3.d d.c listener) {
        F.p(context, "context");
        F.p(listener, "listener");
        if (arrayList != null) {
            com.harman.log.f.a(f45787N, "Set the EQ Adapter");
            this.f45791L = new com.harman.jbl.partybox.ui.equalizer.d(context, arrayList, listener);
            RecyclerView recyclerView = this.f45790K;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
                int a4 = com.harman.jbl.partybox.utils.j.a(context, 10.0f);
                recyclerView.n(new o(a4, a4, a4 / 2));
                recyclerView.setAdapter(this.f45791L);
            }
        }
    }

    public final void f(@l3.e ArrayList<com.harman.jbl.partybox.model.a> arrayList) {
        com.harman.jbl.partybox.ui.equalizer.d dVar;
        if (arrayList != null && (dVar = this.f45791L) != null) {
            dVar.X(arrayList);
        }
    }

    public final void g(int i4) {
        HmCustomFontTextView hmCustomFontTextView = this.f45789J;
        if (hmCustomFontTextView != null) {
            hmCustomFontTextView.setVisibility(i4);
        }
    }

    @l3.e
    public final q getMOnActionListener() {
        return this.f45788I;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@l3.d View v3) {
        boolean z3;
        q qVar;
        F.p(v3, "v");
        int id = v3.getId();
        if (this.f45788I == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        com.harman.log.f.a(f45787N, "onClick called, viewId = " + id + ", mOnActionListener == null? " + z3);
        if (v3.getId() == j.h.e4 && (qVar = this.f45788I) != null) {
            qVar.onAction(ClickEventType.ACTION_EDIT_CUSTOM_EQ);
        }
    }

    public final void setMOnActionListener(@l3.e q qVar) {
        this.f45788I = qVar;
    }

    public final void setOnActionListener(@l3.d q onActionListener) {
        F.p(onActionListener, "onActionListener");
        this.f45788I = onActionListener;
    }

    public final void setSmoothScroll(int i4) {
        RecyclerView recyclerView = this.f45790K;
        if (recyclerView != null) {
            recyclerView.O1(i4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMCardEQ2View(@l3.d Context context, @l3.e AttributeSet attributeSet) {
        super(context, attributeSet);
        F.p(context, "context");
        c(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMCardEQ2View(@l3.d Context context, @l3.e AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        F.p(context, "context");
        c(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMCardEQ2View(@l3.d Context context, @l3.e AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        F.p(context, "context");
        c(context);
    }
}
