package com.harman.jbl.partybox.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.E;
import kotlin.jvm.internal.C2197u;

@E(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bB\u0013\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013B-\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/harman/jbl/partybox/ui/widget/VarColumnGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "H3", "()Landroidx/recyclerview/widget/GridLayoutManager$c;", "Lcom/harman/jbl/partybox/ui/widget/VarColumnGridLayoutManager$a;", "a0", "Lcom/harman/jbl/partybox/ui/widget/VarColumnGridLayoutManager$a;", "Q3", "()Lcom/harman/jbl/partybox/ui/widget/VarColumnGridLayoutManager$a;", "R3", "(Lcom/harman/jbl/partybox/ui/widget/VarColumnGridLayoutManager$a;)V", "columnCountProvider", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "spanCount", "(Landroid/content/Context;I)V", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "b0", "a", com.harman.log.b.f47574c, "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class VarColumnGridLayoutManager extends GridLayoutManager {

    /* renamed from: b0, reason: collision with root package name */
    @l3.d
    public static final b f45926b0 = new b(null);

    /* renamed from: c0, reason: collision with root package name */
    private static final int f45927c0 = 2;

    /* renamed from: a0, reason: collision with root package name */
    @l3.e
    private a f45928a0;

    /* loaded from: classes2.dex */
    public interface a {
        int a(int i4);
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C2197u c2197u) {
            this();
        }

        private b() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends GridLayoutManager.c {
        c() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i4) {
            a Q3 = VarColumnGridLayoutManager.this.Q3();
            if (Q3 != null) {
                return Q3.a(i4);
            }
            return 2;
        }
    }

    public VarColumnGridLayoutManager(@l3.e Context context) {
        super(context, 2);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager
    @l3.d
    public GridLayoutManager.c H3() {
        return new c();
    }

    @l3.e
    public final a Q3() {
        return this.f45928a0;
    }

    public final void R3(@l3.e a aVar) {
        this.f45928a0 = aVar;
    }

    public VarColumnGridLayoutManager(@l3.e Context context, int i4) {
        super(context, i4);
    }

    public VarColumnGridLayoutManager(@l3.e Context context, @l3.e AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
    }
}
