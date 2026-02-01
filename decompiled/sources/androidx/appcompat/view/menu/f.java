package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: E, reason: collision with root package name */
    g f5323E;

    /* renamed from: F, reason: collision with root package name */
    private int f5324F = -1;

    /* renamed from: G, reason: collision with root package name */
    private boolean f5325G;

    /* renamed from: H, reason: collision with root package name */
    private final boolean f5326H;

    /* renamed from: I, reason: collision with root package name */
    private final LayoutInflater f5327I;

    /* renamed from: J, reason: collision with root package name */
    private final int f5328J;

    public f(g gVar, LayoutInflater layoutInflater, boolean z3, int i4) {
        this.f5326H = z3;
        this.f5327I = layoutInflater;
        this.f5323E = gVar;
        this.f5328J = i4;
        a();
    }

    void a() {
        j y3 = this.f5323E.y();
        if (y3 != null) {
            ArrayList<j> C3 = this.f5323E.C();
            int size = C3.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (C3.get(i4) == y3) {
                    this.f5324F = i4;
                    return;
                }
            }
        }
        this.f5324F = -1;
    }

    public g b() {
        return this.f5323E;
    }

    public boolean c() {
        return this.f5325G;
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public j getItem(int i4) {
        ArrayList<j> H3;
        if (this.f5326H) {
            H3 = this.f5323E.C();
        } else {
            H3 = this.f5323E.H();
        }
        int i5 = this.f5324F;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return H3.get(i4);
    }

    public void e(boolean z3) {
        this.f5325G = z3;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<j> H3;
        if (this.f5326H) {
            H3 = this.f5323E.C();
        } else {
            H3 = this.f5323E.H();
        }
        if (this.f5324F < 0) {
            return H3.size();
        }
        return H3.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int i5;
        boolean z3;
        if (view == null) {
            view = this.f5327I.inflate(this.f5328J, viewGroup, false);
        }
        int groupId = getItem(i4).getGroupId();
        int i6 = i4 - 1;
        if (i6 >= 0) {
            i5 = getItem(i6).getGroupId();
        } else {
            i5 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f5323E.I() && groupId != i5) {
            z3 = true;
        } else {
            z3 = false;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        o.a aVar = (o.a) view;
        if (this.f5325G) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.h(getItem(i4), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
