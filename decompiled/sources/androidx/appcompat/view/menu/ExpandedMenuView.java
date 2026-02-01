package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.g0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements g.b, o, AdapterView.OnItemClickListener {

    /* renamed from: G, reason: collision with root package name */
    private static final int[] f5210G = {R.attr.background, R.attr.divider};

    /* renamed from: E, reason: collision with root package name */
    private g f5211E;

    /* renamed from: F, reason: collision with root package name */
    private int f5212F;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(j jVar) {
        return this.f5211E.O(jVar, 0);
    }

    @Override // androidx.appcompat.view.menu.o
    public void e(g gVar) {
        this.f5211E = gVar;
    }

    @Override // androidx.appcompat.view.menu.o
    public int getWindowAnimations() {
        return this.f5212F;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        a((j) getAdapter().getItem(i4));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        g0 G3 = g0.G(context, attributeSet, f5210G, i4, 0);
        if (G3.C(0)) {
            setBackgroundDrawable(G3.h(0));
        }
        if (G3.C(1)) {
            setDivider(G3.h(1));
        }
        G3.I();
    }
}
